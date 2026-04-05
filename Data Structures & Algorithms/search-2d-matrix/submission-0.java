class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix.length == 0) return false;

        int rows = matrix.length;
        int col = matrix[0].length;

        int low = 0;
        int high = rows * col;

        while(low < high){
            int mid = (low + high) / 2; 
            if(matrix[mid/col][mid%col] == target) return true;
            else if (matrix[mid/col][mid%col] < target) low = mid + 1;
            else high = mid;
        }

        return false;
    }
}
