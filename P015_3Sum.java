/*
    https://leetcode.com/problems/3sum/

    Given an array S of n integers, are there elements a, b, c in S such that 
    a + b + c = 0? Find all unique triplets in the array which gives the sum of 
    zero.

    Note:
    Elements in a triplet (a,b,c) must be in non-descending order. 
    (ie, a ≤ b ≤ c)
    The solution set must not contain duplicate triplets.
    
    For example, given array S = {-1 0 1 2 -1 -4},

        A solution set is:
        (-1, 0, 1)
        (-1, -1, 2)

    @tags: Array, Two Pointers
*/

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
