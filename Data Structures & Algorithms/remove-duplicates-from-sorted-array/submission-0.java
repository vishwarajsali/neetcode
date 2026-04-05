class Solution {
    public int removeDuplicates(int[] nums) {
        
      int first = 0,  second = 0, sorted = 1;

      for(int i : nums){

          if(nums[first] != nums[second]){
              first++;
              nums[first] = nums[second];
              sorted++;
          }
          second++;
      }

      return sorted;
    }
}