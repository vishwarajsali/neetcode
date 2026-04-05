class Solution {
    public boolean isAnagram(String s, String t) {

       if(s.length() != t.length()) return false;
        
        char[] sChar = s.toCharArray();
        Arrays.sort(sChar);
        
        s = Arrays.toString(sChar);
        
        char[] tChar = t.toCharArray();
        Arrays.sort(tChar);
        
        t = Arrays.toString(tChar);
        
        if(!s.equals(t)) return  false;
        
        return true;
    }
}
