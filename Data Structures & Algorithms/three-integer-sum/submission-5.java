class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> res = new HashSet<>();

        Arrays.sort(nums);

        for(int i = 0; i< nums.length- 2; i++){
            twoSum(i, nums, res);
        }

        return new ArrayList<>(res);
    }

    private void twoSum(int index, int[] nums, Set<List<Integer>> res){

        int start = index + 1, end = nums.length -1;
        while(start < end){
            int sum = nums[index] + nums[start] + nums[end];
            if(sum == 0) {
                res.add(Arrays.asList(nums[index], nums[start], nums[end]));
                end --; 
                start++;
            }
            else if (sum > 0) end --;
            else start++;
        }
    }
}



/*

nums = [-1,0,1,2,-1,-4]
-4, -1, -1, 0, 1, 2



*/