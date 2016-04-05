
public class P016_3SumClosest{
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);

        int cloest = nums[0]+nums[1]+nums[2];
        for(int first=0;first<nums.length-2;first++){
            int second = first+1, third = nums.length-1;
            while(second<third){
                int sum = nums[first]+nums[second]+nums[third];
                if(Math.abs(target-sum)<Math.abs(target-cloest)){
                    cloest = sum;
                }
                if(sum<target){
                    while(second<third&&nums[second]==nums[second+1]){
                        second++;
                    }
                    second++;
                }else if(sum>target){
                    while(second<third&&nums[third]==nums[third-1]){
                        third--;
                    }
                    third--;
                }else{
                    return target;
                }
            }
        }
        return cloest;

    }
}
