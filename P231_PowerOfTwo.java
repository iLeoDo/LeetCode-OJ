/*
    Given an integer, write a function to determine if it is a power of two.

    @tags: Math, Bit Manipulation
 */
public class P231_PowerOfTwo{
    public boolean isPowerOfTwo(int n) {
        if(n<0){
            return false;
        }
        int countOf1 = 0;
        for(int i=0;i<32;i++){
            if((n&(1<<i))>0){
                countOf1++;
            }
        }
        return countOf1==1;
        //return !(n&(n-1));
    }
}
