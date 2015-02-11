
public class P162_FindPeakElement {
    public int findPeakElement(int[] num) {
        int low = 0;
        int high = num.length-1;
        while(low<high){
            int mid = (low+high)/2;
            if(num[mid]>num[mid+1]){
                high = mid;
            }
            if(num[mid]<num[mid+1]){
                low = mid+1;
            }
        }
        return low;
    }
}
