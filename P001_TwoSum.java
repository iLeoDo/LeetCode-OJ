import java.util.HashMap;

public class P001_TwoSum{
	public int[] twoSum(int[] numbers, int target) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i=0;i<numbers.length;i++){
            map.put(numbers[i],i);
        }
        for(int i=0;i<numbers.length;i++){
            int t = target-numbers[i];
            Integer j=map.get(t);
            if(j!=null&&j!=i){
                if(i>j){
                    t = i;
                    i = j;
                    j = t;
                }
                return new int[]{i+1,j+1};
            }
        }
        return null;
    }
}

public class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> indexTable = new HashMap<Integer,Integer>();
        for(int index2=0;index2<nums.length;index2++){
            // the number to find
            int toFind = target-nums[index2];
            // find the remainder in the indexTable
            Integer index1 = indexTable.get(toFind);
            if(index1!=null){
                return new int[]{index1+1, index2+1};
            }else{
                indexTable.put(nums[index2],index2);
            }
        }
        return null;
        //unreachable;
    }
}
