
public class P131_PalindromePartitioning{
    public List<List<String>> partition(String s) {
        int n = s.length();
        List<List<String>> res = new ArrayList<List<String>>();
        List<String> list = new ArrayList<String>();

        dfs(s,0,list,res);
        return res;
    }
    public void dfs(String s, int pos, List<String> list, List<List<String>> res){
        if(pos==s.length() && list.size()>0 ){
            res.add(new ArrayList<String>(list));
        }else{
            for(int i=pos;i<s.length();i++){
                if(isPal(s,pos,i)){ // check palindrome s[pos]=>s[i]
                    list.add(s.substring(pos,i+1));
                    dfs(s,i+1,list,res); // recursion to next substring
                    list.remove(list.size()-1);
                }
            }
        }
    }
    public boolean isPal(String s, int low, int high){
        while(low<high){
            if(s.charAt(low++) != s.charAt(high--)) return false;
        }
        return true;

    }
}
