
public class P008_StringToInteger{

    public int myAtoi(String str) {
        str = str.trim();
        if(str.length()==0){
            return 0; //error
        }

        int result = 0;
        boolean flag = true;

        char ch = str.charAt(0);
        if(ch=='-'){
            flag = false;
        }else if(ch=='+'){
            flag = true;
        }else if(ch>='0'&&ch<='9'){
            result = ch-'0';
        }else{
            return 0; //error
        }

        for(int i=1;i<str.length();i++){
            ch = str.charAt(i);
            if(ch<'0'||ch>'9'){
                break;
            }

            int original = result;
            //condition of overflow
            if(Integer.MAX_VALUE/10 < original||(Integer.MAX_VALUE/10 == original && ch-'0'>Integer.MAX_VALUE%10)){
                return flag?Integer.MAX_VALUE:Integer.MIN_VALUE;
            }

            result = original*10 + (ch-'0');

        }
        return flag?result:-result;
    }
}
