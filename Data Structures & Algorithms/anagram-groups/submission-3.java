class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();

        for(String str : strs){
            char[] cha = str.toCharArray();
            Arrays.sort(cha);
            String key = new String(cha);
            map.putIfAbsent(key, new ArrayList<>());
            map.get(key).add(str);
        }


        return new ArrayList<>(map.values());

    }
}
