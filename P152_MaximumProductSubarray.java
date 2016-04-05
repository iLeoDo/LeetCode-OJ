
public class P152_MaximumProductSubarray{
    public int maxProduct(int[] nums) {
        int maxEndingHere = nums[0];
        int minEndingHere = nums[0];
        int maxSoFar = nums[0];

        for(int i = 1;i<nums.length; i++){
            int maxEndingHereCopy = maxEndingHere;
            int minEndingHereCopy = minEndingHere;

            maxEndingHere = Math.max(nums[i],Math.max(maxEndingHereCopy*nums[i],minEndingHereCopy*nums[i]));
            minEndingHere = Math.min(nums[i],Math.min(maxEndingHereCopy*nums[i],minEndingHereCopy*nums[i]));

            maxSoFar = Math.max(maxEndingHere,maxSoFar);
        }
        return maxSoFar;
    }
}
