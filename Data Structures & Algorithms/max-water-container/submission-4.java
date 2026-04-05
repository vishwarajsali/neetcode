class Solution {

    // return maxwater 

    public int maxArea(int[] heights) {
        int maxWater = 0, start = 0, end = heights.length-1;


        while(start < end){

            int area = Math.min(heights[start], heights[end]) * (end - start);
            maxWater = Math.max(maxWater, area);
            
            if(heights[start] < heights[end]) start++;
            else end--;
        }

        return maxWater;
    }
}
