
public class P139_WordBreak{
    //value t t
    //flags 0 1 2 3
    //index   0 1 2
    //string  a b c
    public boolean wordBreak(String s, Set<String> wordDict) {
        // flags[i] => s[0,i-1]
        boolean[] flags = new boolean [s.length()+1];
        flags[0] = true;
        for(int i=1;i<flags.length;i++){
            // for s[0,i-1] => flags[i]
            for(int j=0;j<i;j++){
                if(flags[j]==true && wordDict.contains(s.substring(j,i))){
                    flags[i] = true;
                    break;
                }
            }
        }
        return flags[s.length()];
    }
}
