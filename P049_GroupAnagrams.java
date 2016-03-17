
public class P049_GroupAnagrams{
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> map = new HashMap();
        for(String s: strs){
            char[] chars = s.toCharArray();
            Arrays.sort(chars); // n l

            if(!map.containsKey(String.valueOf(chars))){
                map.put(String.valueOf(chars),new ArrayList<String>());
            }
            map.get(String.valueOf(chars)).add(s);
        }
        for(List<String> list : map.values()){
            Collections.sort(list);
        }
        return new ArrayList<List<String>>(map.values());

    }

}
