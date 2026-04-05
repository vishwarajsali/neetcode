class Solution {

    // return maxwater 

    public int maxArea(int[] heights) {
         int maxWater = 0, start = 0, end = heights.length-1;
        
        for(int i =  0; i < heights.length; i++){
            for(int j = i+1; j< heights.length; j++){
                int area = Math.min(heights[i], heights[j]) * (j - i);
                maxWater = Math.max(maxWater, area);
            }
        }

        return maxWater;
    }
}
