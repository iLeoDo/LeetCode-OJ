
public class P009_PalindromeNumber{
    public boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }
        int length = 0;
        // get length of integer
        for(int copy=x;copy>0;copy/=10){
            length++;
        }

        while(length>1){
            // compare front and real digits of integer
            if(x/(int)Math.pow(10,length-1) != x%10){
                return false;
            }
            // remove front and real digits
            x = x%(int)Math.pow(10,length-1)/10;
            length = length-2;
        }
        return true;
    }
}
