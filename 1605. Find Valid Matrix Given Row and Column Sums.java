class Solution {
    public int[][] restoreMatrix(int[] rowSum, int[] colSum) {
        int row = rowSum.length;
        int col = colSum.length;
        int[][] res = new int[row][col];
        int val = 0;
        for(int i=0 ; i<row ; i++){
            for(int j=0 ; j<col ; j++){
                val = Math.min(rowSum[i] , colSum[j]);
                res[i][j] = val;
                rowSum[i] -= val;
                colSum[j] -= val;
            }
        }
        return res;
    }
}