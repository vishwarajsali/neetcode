class Solution {
    public int maxArea(int[] heights) {
        
        int res = 0,
        n = heights.length - 1,
        left = 0,
        right = n;


        while(left < right){
            int area = Math.min(heights[left], heights[right]) * (right - left);
            res = Math.max(res, area);

            if(heights[left] <= heights[right]) left++;
            else right--;

        }


        return res;
    }
}
