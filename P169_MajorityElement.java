
public class P169_MajorityElement{
    public int majorityElement(int[] nums) {
        int current = 0;
        int count = 0;
        for(int num : nums){
            if(count == 0){
                current = num;
                count++;
            }else if(current==num){
                count++;
            }else{
                count--;
            }
        }
        return current;
    }
}
