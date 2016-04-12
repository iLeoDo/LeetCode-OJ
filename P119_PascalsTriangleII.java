/*
    Given an index k, return the kth row of the Pascal's triangle.

    For example, given k = 3,
    Return [1,3,3,1].

    Note:
    Could you optimize your algorithm to use only O(k) extra space?
 */
public class P119_PascalsTriangleII{
    public List<Integer> getRow(int rowIndex) {
        List<Integer> table = new ArrayList<Integer>(rowIndex+1);
        table.add(1);
        for(int i=1; i<=rowIndex; i++){
            int j = i;
            table.add(1);
            for(j = i-1;j>=1 ;j--){
                table.set(j,table.get(j)+table.get(j-1));
            }
        }
        return table;
    }
}
