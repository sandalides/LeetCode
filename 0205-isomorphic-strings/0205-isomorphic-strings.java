class Solution {
    public boolean isIsomorphic(String s, String t) {
        char [] s_charArray = s.toCharArray();
        char [] t_charArray = t.toCharArray();
        int lengthS = s_charArray.length;
        int lengthT = t_charArray.length;
        Map<Character,Character> hashmap = new HashMap<>();

        if (lengthS != lengthT) return false;
        for (int i =0;i<lengthT;i++){
            if (hashmap.containsKey(s_charArray[i])){
                if ((hashmap.get(s_charArray[i]) != t_charArray[i])){
                    return false;
                }
            }else {
                if (hashmap.containsValue(t_charArray[i])) return false;
                else hashmap.put(s_charArray[i],t_charArray[i]);
            }
        }
        return true;
    }
}