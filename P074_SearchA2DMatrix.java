/*
    Write an efficient algorithm that searches for a value in an m x n matrix.
    This matrix has the following properties:

    Integers in each row are sorted from left to right.
    The first integer of each row is greater than the last integer of the
    previous row.

    For example,

    Consider the following matrix:

    [
      [1,   3,  5,  7],
      [10, 11, 16, 20],
      [23, 30, 34, 50]
    ]
    Given target = 3, return true.

    @tags: Array, Binary Search
 */

public class P074_SearchA2DMatrix{
    /*
     * O(log(MN))
     */
    public boolean searchMatrix(int[][] matrix,int target){
        int m = matrix.length;
        int n = matrix[0].length;
        int lo = 0, hi = m*n-1;
        while(lo<=hi){
            int mid = (lo+hi)/2;
            if(matrix[mid/n][mid%n]>target){
                hi = mid-1;
            }else if(matrix[mid/n][mid%n]<target){
                lo = mid+1;
            }else{
                return true;
            }
        }
        return false;
    }


    /*
     * O(log(M)+log(N))
     */
    public boolean searchMatrix(int[][] matrix, int target) {
        //First Great Or Equal Element
        int lo = 0, hi = matrix.length-1;
        while(lo < hi){
            int mid = (lo+hi)/2;
            if(matrix[mid][0]<target){
                lo = mid+1;
            }else{
                hi = mid;
            }
        }

        if(matrix[lo][0]==target){
            // this row start with the target
            return true;
        }else if(matrix[lo][0]<target){
            // only one row;
            return binarySearchRow(matrix[lo],target);
        }else if(matrix[lo][0]>target&&lo-1>=0){
            // this row is the first row which is greater or equal than task
            return binarySearchRow(matrix[lo-1],target);
        }else{
            return false;
        }
    }

    public boolean binarySearchRow(int[] row, int target){
        int lo = 0, hi = row.length-1;
        while(lo<=hi){
            int mid = (lo+hi)/2;
            if(row[mid]<target){
                lo = mid+1;
            }else if(row[mid]>target){
                hi = mid-1;
            }else{
                return true;
            }
        }
        return false;
    }
}
