
public class P035_SearchInsertPosition{
	public int searchInsert(int[] A, int target) {
        int lo = 0; int hi = A.length-1;
        int mid = 0;
        while(lo<=hi){
            mid = (lo+hi)>>1;
            if(A[mid]==target){
                return mid;
            }else if(A[mid]>target){
                hi = mid-1;
            }else{
                lo = mid+1;
            }
        }
        return lo;
    }
}
