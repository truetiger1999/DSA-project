class Solution {
    public boolean searchMatrix(int[][] mat, int target) {
        int n = mat.length; // Number of rows
        int m = mat[0].length; // Number of columns
        // Write your code here.
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                 if (mat[i][j] == target) {
                    return true;
                }
            }
        }
        return false;
        
    }
}