class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
           Set<List<Integer>> res = new HashSet<>();

        Arrays.sort(nums);

        for(int i = 0 ; i< nums.length; i++ ){

            int start = i +1, end = nums.length-1;

            while (start < end){
                int sum = nums[i] + nums[start] + nums[end];
                if(sum == 0) {
                    res.add(Arrays.asList(nums[i], nums[start], nums[end]));
                }
                if(sum < 0){
                    start ++;
                }else end --;
            }
        }

        return new ArrayList<>(res);
    }

    
}
