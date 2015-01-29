
public class P033_SearchInRotatedSortedArray{
	public int search(int[] A, int target) {
        return binarySearchWithRotated(A,0,A.length-1,target);
    }
    private int binarySearchWithRotated(int[] a, int start, int end, int target){
        if(start>end){
            return -1;
        }
        int mid = (start+end)/2;
        int midVal = a[mid];
        
        if(midVal==target){
            return mid;
        }
        
        // left part is sorted
        if(a[start]<=a[mid]){
            if(a[mid]>target&&a[start]<=target){
                return binarySearchWithRotated(a,start,mid-1,target);
            }else{
                return binarySearchWithRotated(a,mid+1,end,target);
            }
        }
        
        // right part is sorted
        if(a[end]>=a[mid]){
            if(a[mid]<target&&a[end]>=target){
                return binarySearchWithRotated(a,mid+1,end,target);
            }else{
                return binarySearchWithRotated(a,start,mid-1,target);
            }
        }
        return -1;
    }
}
