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

