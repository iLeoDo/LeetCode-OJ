/*
    Given an array of integers, every element appears twice except for one. Find
    that single one.

    Note:
    Your algorithm should have a linear runtime complexity. Could you implement
    it without using extra memory?

    @tags: Hash Table, Bit Manipulation
 */
public class P136_SingleNumber{
    public int singleNumber(int[] nums) {
        int x = 0;
        for(int num : nums){
            x^=num;
        }
        return x;
    }
}
