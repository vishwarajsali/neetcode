class Solution {
    public int lengthOfLongestSubstring(String s) {

                
        int maxLen = 0, n = s.length();

        if( n == 0|| n == 1) return n;

        for(int i = 0; i < n-1;i++){
            int len = 1 ;
            Set<Character> set = new HashSet<>();
            set.add(s.charAt(i));
            for(int j = i+1; j < n; j++){
                if(set.contains(s.charAt(j))){
                    set = new HashSet<>();
                    break;
                }
                set.add(s.charAt(j));
                len++;
            }
            
            
            maxLen = Math.max(maxLen, len);
        }
        
        return maxLen;
    }
}
