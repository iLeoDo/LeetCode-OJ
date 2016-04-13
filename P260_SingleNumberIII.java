/*
    Given an array of numbers nums, in which exactly two elements appear only
    once and all the other elements appear exactly twice. Find the two elements
    that appear only once.

    For example:

    Given nums = [1, 2, 1, 3, 2, 5], return [3, 5].

    Note:
    The order of the result is not important. So in the above example, [5, 3]
    is also correct.
    Your algorithm should run in linear runtime complexity. Could you implement
    it using only constant space complexity?

    @tags: Bit Manipulation
 */
public class P260_SingleNumberIII{
    public int[] singleNumber(int[] nums) {
        int xor = 0;
        for(int num : nums){
            xor ^= num;
        }
        int x = 0;
        while((xor&(1<<x))==0){
            x++;
        }

        int xor1=0, xor2=0;
        for(int num : nums){
            if((num&(1<<x))==0){
                xor1^=num;
            }else{
                xor2^=num;
            }
        }
        return new int[]{xor1,xor2};

    }
}
