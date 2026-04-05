class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix == null || matrix.length == 0) return false;
        int row = matrix.length,  
        col = matrix[0].length;

        int left = 0, 
        right = col * row;

        while(left < right){
            int mid = (left + right) / 2;
            if(matrix[mid/col][mid%col] == target) return true;

            if(matrix[mid/col][mid%col] < target) left = mid + 1;
            else right = mid;


        }

        return false;
    }
}
