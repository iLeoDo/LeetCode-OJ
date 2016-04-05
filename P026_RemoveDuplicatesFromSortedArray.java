
public class P026_RemoveDuplicatesFromSortedArray{
    public int removeDuplicates(int[] nums) {
        if(nums.length==0){
            return 0;
        }
        int counter = 0;
        for(int i=1;i<nums.length;i++){
            if(nums[i]==nums[i-1]){
                counter++;
            }
            nums[i-counter] = nums[i];
        }
        return nums.length-counter;
    }
}
