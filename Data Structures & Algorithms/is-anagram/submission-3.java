class Solution {
    public boolean isAnagram(String s, String t) {
        int[] sArr = new int[26];
        for(char c : s.toCharArray()){

            int a = c - 'a';
            sArr[a]++;
        }

        for(char c : t.toCharArray()){
            int a = c - 'a';
            sArr[a]--;
        }

        for(int i : sArr){
            if(i != 0) return false;
        }

        return true;

    }
}
