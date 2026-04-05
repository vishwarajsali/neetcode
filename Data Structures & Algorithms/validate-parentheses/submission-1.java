class Solution {
    public boolean isValid(String s) {
        Map<Character, Character> map = new HashMap<>() {
            {
                put(']', '[');
                put(')', '(');
                put('}', '{');
            }
        };

        Stack<Character> stack = new Stack<>();

        for(char c : s.toCharArray()){
            if(!stack.isEmpty() && map.containsKey(c)) {
                if(stack.peek() == map.get(c)) stack.pop();
                else return false;
            }else stack.add(c);

        }

        return stack.isEmpty();
    }
}
