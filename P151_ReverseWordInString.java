
public class P151_ReverseWordInString{
    public String reverseWords(String s) {
        int i = s.length()-1;
        // buffer for current word
        StringBuilder sb = new StringBuilder();
        // builder for final result
        StringBuilder result = new StringBuilder();
        while(i>=0){
            char current = s.charAt(i);
            if(current==' '&&sb.length()>0){
                // current is space, but there is something in sb
                result.append(" "+sb.toString());
                sb = new StringBuilder();
            }else if(current!=' '){
                // current is not space.
                sb.insert(0,current);
            }else{
                //leading space
                //do nothing;
            }
            i--;
        }
        //if there is still something in sb.
        if(sb.length()>0){
            result.append(" "+sb.toString());
        }
        
        if(result.length()==0){
            return "";
        }
        
        return result.substring(1);
    }
}
