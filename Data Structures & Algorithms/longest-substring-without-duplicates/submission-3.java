class Solution {
    public int lengthOfLongestSubstring(String s) {

        int maxLen = 1, n = s.length();

        if( n == 0|| n == 1) return n;

        for(int i = 0; i < n-1;i++){
            for(int j = i+1; j < n; j++){

                if(repeatingChar(s, i, j)){
                    maxLen = Math.max(maxLen, j - i+1);
                }else break;
            }
        }

        return maxLen;
    }

    private boolean repeatingChar(String s, int start, int end){
        Set<Character> set = new HashSet<>();

        for(int i = start; i <= end; i++){
            if(set.contains(s.charAt(i))) return false;
            set.add(s.charAt(i));
        }

        return true;
    }
}
