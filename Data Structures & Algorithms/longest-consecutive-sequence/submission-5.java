class Solution {
    public int longestConsecutive(int[] nums) {

        if(nums == null || nums.length == 0) return 0;
int n = nums.length;
        int maxConse = 1;
        Arrays.sort(nums);

        for(int i = 0; i < n-1; i++){

            int j = i; 
            int count = 1;
            while(j < n-1 && (nums[j+1] - nums[j] == 1 || nums[j+1] == nums[j] ) ){
                if(nums[j] != nums[j+1]) count ++;

                j++; 

            }
            maxConse = Math.max(maxConse, count);

        }

        

        return maxConse;
    }
}
