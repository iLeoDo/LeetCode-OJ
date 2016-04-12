/*
	https://leetcode.com/problems/two-sum/

	Given an array of integers, return indices of the two numbers such that they
	 add up to a specific target.

	You may assume that each input would have exactly one solution.

	Example:
	Given nums = [2, 7, 11, 15], target = 9,

	Because nums[0] + nums[1] = 2 + 7 = 9,
	return [0, 1].

	UPDATE (2016/2/13):
	The return format had been changed to zero-based indices. Please read the 
	above updated description carefully.

	@tags Array, Hash Table
 */

import java.util.HashMap;

public class P001_TwoSum{
	public int[] twoSum(int[] numbers, int target) {
        HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
        for(int i=0;i<nums.length;i++){
            Integer j=hm.get(new Integer(target-nums[i]));
            if(j!=null){
                return new int[]{j,i};
            }
            hm.put(nums[i],i);
        }
        return new int[]{-1,-1};
    }
}

