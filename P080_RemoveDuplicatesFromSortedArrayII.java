
public class P080_RemoveDuplicatesFromSortedArrayII{
    public int removeDuplicates(int[] nums) {

        final int k = 3;

        if(nums.length==0){
            return 0;
        }

        int current = 1;
        int counter = 1;
        for(int i=1;i<nums.length;i++){
            if(nums[i] == nums[i-1]){
                counter++;
                if(counter<k){
                    nums[current] = nums[i];
                    current++;
                }
            }else{
                counter = 1;
                nums[current] = nums[i];
                current++;
            }

        }

        return current;
    }
}
