class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
         Map<String, List<String>> map = new HashMap<>();

        for(String s : strs){
            char[] chars = s.toCharArray();
            Arrays.sort(chars);
            String str = Arrays.toString(chars);
            if(!map.containsKey(str)){
                map.put(str, new ArrayList<>());
            }

            char[] keyChar = s.toCharArray();
            Arrays.sort(keyChar);

            map.get(Arrays.toString(chars)).add(s) ;
        }

        return map.values().stream().toList();
    }
}
