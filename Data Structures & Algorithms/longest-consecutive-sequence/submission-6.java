class Solution {
    public int longestConsecutive(int[] nums) {

        if(nums == null || nums.length == 0) return 0;
        int n = nums.length;
        int maxConse = 1;

        Set<Integer> set = new HashSet<>();

        for(int num : nums){
            set.add(num);
        } 

        for(int i : set){
            int num = i;
            int count = 0;
            while(set.contains(num++)){
                count++;
            }

            maxConse = Math.max(maxConse, count);
        }

        return maxConse;
    }
}
