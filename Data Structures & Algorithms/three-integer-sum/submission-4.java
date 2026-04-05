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

        for(int i = index+1; i < nums.length -1; i++){

            for(int j = i+1; j < nums.length; j++){
                int sum = nums[index] + nums[i] + nums[j];
                if(sum == 0) {
                    res.add(Arrays.asList(nums[index], nums[i], nums[j]));
                    
                }
            }
        }
    }
}



/*

nums = [-1,0,1,2,-1,-4]
-4, -1, -1, 0, 1, 2



*/