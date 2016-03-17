
public class P033_SearchInRotatedSortedArray{

    /**
     * V1. group by which side to search.
     */
    public int search(int[] nums, int target) {
        int low = 0, high = nums.length-1;
        while(low<=high){
            int mid = (low+high)/2;
            int lowVal = nums[low];
            int highVal = nums[high];
            int midVal = nums[mid];
            if(midVal==target){
                return mid;
            }

            if((lowVal<=midVal &&target>=lowVal&&target<midVal) // left in order && in
                ||
                (midVal<=highVal && (target<midVal||target>highVal)) //right in order && out
                ){
                high = mid-1;
                //left
            }else if((midVal<=highVal &&target>midVal&&target<=highVal) // right in order && in
                ||
                (lowVal<=midVal && (target>midVal||target<lowVal)) //left in order && out
                ){
                low = mid+1;
            }
        }
        return -1;

    }



    /**
     * V1. group by which side is sorted.
     */

    public int search(int[] nums, int target) {
        int low = 0, high = nums.length-1;
        while(low<=high){
            int mid = (low+high)/2;
            int lowVal = nums[low];
            int highVal = nums[high];
            int midVal = nums[mid];
            if(midVal==target){
                return mid;
            }


            // left part is sorted
            if(lowVal<=midVal){
                if(midVal>target&&lowVal<=target){
                    high = mid-1;
                }else{
                    low = mid+1;
                }
            }

            // right part is sorted
            if(midVal<=highVal){
                if(midVal<target&&highVal>=target){
                    low = mid+1;
                }else{
                    high = mid-1;
                }
            }

        }
        return -1;

    }

}
