
public class P189_RotateArray{
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k%n;
        // 1,2,3,4,5
        inverse(nums,0,n-1);
        // 5,4,3,2,1
        inverse(nums,0,k-1);
        // 4,5,3,2,1
        inverse(nums,k,n-1);
        // 4,5,1,2,3
    }
    private void inverse(int[]nums, int start, int end){
        while(start<end){
            nums[start] = nums[start]+nums[end];
            nums[end] = nums[start]-nums[end];
            nums[start] = nums[start]-nums[end];
            start++;end--;
        }
    }
}
