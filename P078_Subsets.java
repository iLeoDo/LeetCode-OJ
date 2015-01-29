
public class P078_Subsets{
	public List<List<Integer>> subsets(int[] S) {
        List<List<Integer>> result = new LinkedList<List<Integer>>();
        if(S==null){
            return null;
        }
        
        Arrays.sort(S);
        
        int size = S.length;
        for(int i = 0;i<(1<<size);i++){
            List<Integer> subset = new LinkedList<Integer>();
            for(int j=0;j<size;j++){
                int have = (i&(1<<j));
                if(have !=0){
                    subset.add(S[j]);
                }
            }
            result.add(subset);    
        }
        
        return result;
    }
}
