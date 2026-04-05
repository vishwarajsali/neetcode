class Solution {
    public int longestConsecutive(int[] nums) {

        if(nums == null  || nums.length == 0) return 0;
        int consecutive = 0;
        Arrays.sort(nums);

        int start = 1, end = nums.length;
        int prev = nums[0];
        int count = 1;
        while(start< end){
            int curr = nums[start];
            if(prev == curr) {
                start++;
                continue;
            }
            if(curr - prev != 1 ){
                consecutive = Math.max(consecutive, count);
                count = 1;
            }else {
                count++;
            }


            prev = curr;
            start++;
        }
        consecutive = Math.max(consecutive, count);

        return consecutive;
    }
}
