class Solution {
    public boolean isAnagram(String s, String t) {
   if(s.length() != t.length()) return false;
        Map<Character, Integer> sMap = new HashMap<>();
        for( char c : s.toCharArray()){
            sMap.put(c, sMap.getOrDefault(c, 0)+1);
        }
        
        for( char c : t.toCharArray()){
           if(! sMap.containsKey(c)) return false;
           if(sMap.get(c) < 0) return false;

           sMap.put(c, sMap.get(c)-1);
        }

        for(Integer value : sMap.values()) {
            if(value != 0) return false;
        }
        
        return true;
    }
}
