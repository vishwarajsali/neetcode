class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();


        for(int num : nums){
            map.put(num, map.getOrDefault(num, 0)+1);
        }
        List<Integer> res = new ArrayList<>();
 
        for(Map.Entry<Integer, Integer> entry: map.entrySet()){
            if(entry.getValue() >= k ) res.add(entry.getKey());
        }
        List<Integer> topK = map.entrySet().stream()
                .sorted(Map.Entry.<Integer, Integer>comparingByValue().reversed())
                .limit(k)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());

        return topK.stream().mapToInt(Integer::intValue).toArray();
    }
}
