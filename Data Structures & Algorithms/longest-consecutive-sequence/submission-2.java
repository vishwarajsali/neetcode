class Solution {
    public int longestConsecutive(int[] nums) {

       
        if (nums == null || nums.length == 0) return 0;
        int consecutive = 0;

        Set<Integer> set = new HashSet<>();
        for (int n : nums) set.add(n);

        for (int n : set) {
            int count = 0;
            // if (!set.contains(n - 1)) {
                int length = 1;

                while (set.contains(n + length)){
                    length++;
                }

                consecutive = Math.max(consecutive, length);
            // }
        }

        return consecutive;
    }
}
