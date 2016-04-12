/*
    Given numRows, generate the first numRows of Pascal's triangle.

    For example, given numRows = 5,
    Return

    [
         [1],
        [1,1],
       [1,2,1],
      [1,3,3,1],
     [1,4,6,4,1]
    ]

    @tags Array
 */
public class P118_PascalsTriangle{
    public List<List<Integer>> generate(int numRows) {

        List<List<Integer>> result = new ArrayList<List<Integer>>();
        if(numRows==0){
            return result;
        }
        result.add(Arrays.asList(1));
        for(int r = 1; r<numRows; r++){
            List<Integer> level = new ArrayList<Integer>();
            level.add(1);
            List<Integer> last = result.get(r-1);
            for(int i = 1; i<r; i++){
                level.add(last.get(i-1) + last.get(i) );
            }
            level.add(1);
            result.add(level);

        }
        return result;
    }
}
