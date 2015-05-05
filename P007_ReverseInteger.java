
public class P007_ReverseInteger{
    public int reverse(int x) {
        //position
        boolean pos = x>=0;
        // absolute value
        int abs = x>=0?x:-x;
        int reverse = 0;

        while(abs>0){
            // old reverse value prepared for overflow check
            int oldRev = reverse;

            reverse = reverse*10+abs%10;

            // overflow check
            if((reverse-abs%10)/10!=oldRev){
                return 0;
            }

            abs = abs/10;

        }
        return pos?reverse:(-reverse);
    }

}
