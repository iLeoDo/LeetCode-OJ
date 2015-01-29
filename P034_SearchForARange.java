
public class P034_SearchForARange{
	public int[] searchRange(int[] A, int target) {
        int[] result = new int[2];
        int left = binarySearchFirstGE(A,0,A.length,target);
        if(A[left]!=target){
            return new int[]{-1,-1};
        }
        int right = binarySearchFirstGE(A,0,A.length,target+1);
        if(A[right]==target){
            return new int[]{left,right};
        }
        return new int[]{left,right-1};
    }

    // first one greater than or equal to key 
    // (when key > all element, return a[a.length-1], so double check, please)
    private static int binarySearchFirstGE(int[] a, int fromIndex, int toIndex, int key) {
        int low = fromIndex;
        int high = toIndex - 1;

        while (low < high) {
            int mid = (low + high)/2;
            int midVal = a[mid];

            if (midVal < key)
                low = mid + 1;
            else
                high = mid;
        }
        return low;  // key not found.
    }
}
