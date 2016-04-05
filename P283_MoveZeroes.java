
public class P283_MoveZeroes{
    public void moveZeroes(int[] nums) {
        int counter = 0;
        int i;
        for(i = 0;i<nums.length;i++){
            if(nums[i]==0){
                counter++;
            }else{
                nums[i-counter] = nums[i];
            }
        }
        i--;
        while(i>nums.length-counter-1){
            nums[i--]=0;
        }
    }
}
