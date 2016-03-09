import java.util.HashMap;

public class P002_LongestSubStringWRC{
	public int lengthOfLongestSubstring(String s) {
        HashMap<Character,Integer> visited = new HashMap<Character,Integer>();
        // max length tracker
        int maxLen = 0;
        // dummyHead, the char next to head is the begining of the substring
        int head = -1;
        for(int tail=0;tail<s.length();tail++){
            char c = s.charAt(tail);
            // record the index and char, retrieve previous one.
            Integer previousIndex = visited.put(c,tail);
            if(previousIndex!=null&&previousIndex>=head){
                // if this char has been seen between head and tail, move head
                head = previousIndex;
            }else{
                // haven't seen between head and tail
                maxLen = Math.max(tail-head,maxLen);
            }
        }
        return maxLen;
    }
}
