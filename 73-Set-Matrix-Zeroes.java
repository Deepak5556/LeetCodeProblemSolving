class Solution {
    public void setZeroes(int[][] matrix) {

        int m = matrix.length;

        int n = matrix[0].length;

        int[] rows = new int[m];
        int[] cols = new int[n];


        for (int row = 0; row < m; row ++) {
            for (int col = 0; col < n; col ++) {
                if (matrix[row][col] == 0) {
                    rows[row] = -1;
                    cols[col] = -1;
                }
            }
        }

        for (int row = 0; row < m; row ++) {
            if (rows[row] == -1) {
                for (int col = 0; col < n; col ++) {
                    matrix[row][col] = 0;
                }
            }
        }

        for (int col = 0; col < n; col ++) {
            if (cols[col] == -1) {
                for (int row = 0; row < m; row ++) {
                    matrix[row][col] = 0;
                }
            }
        }


    }
}