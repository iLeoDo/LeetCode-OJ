
public class P015_3Sum{
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList();
        for(int i=0;i<nums.length-2;i++){
            if(i>0&&nums[i]==nums[i-1]){
                continue;
            }
            int firstVal = nums[i];
            int second = i+1, third= nums.length-1;
            while(second<third){
                int sum = nums[second] + firstVal + nums[third];
                if(sum==0){
                    result.add(Arrays.asList(firstVal,nums[second],nums[third]));
                    while(second<third&&nums[second]==nums[second+1]) second++;
                    while(second<third&&nums[third]==nums[third-1]) third--;
                    third--;
                    second++;
                }else if(sum>0){
                    third--;
                }else{
                    second++;
                }
            }
        }
        return result;
    }
}
