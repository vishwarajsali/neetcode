class Solution {
    public boolean isPalindrome(String s) {
        int start = 0, end = s.length()-1;

        while(start <= end){
            char rightChar = s.charAt(start);
            char leftChar = s.charAt(end);
            
            if(!Character.isLetterOrDigit(s.charAt(start))) {
                start++;
                continue;
            }

            if(!Character.isLetterOrDigit(s.charAt(end))) {
                end--;
                continue;
            }
    
            if(Character.toLowerCase(leftChar)  != Character.toLowerCase(rightChar) ) return false;
            start++;
            end --;
        }


        return true;
    }
}
