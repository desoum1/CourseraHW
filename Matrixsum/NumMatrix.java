class NumMatrix {
   int [][] mymatrix;
    public NumMatrix(int[][] matrix) {
        mymatrix = matrix;
       
        int length = matrix.length;
        int width = matrix[0].length;
        
        for (int a = 0;a <= width-1; a++){
            for(int b = 0;b <= length-1; b++) {
                System.out.println(mymatrix[a][b]);
                for()
        }
    }
        
    }
    
    
    public int sumRegion(int row1, int col1, int row2, int col2) {
        int matrixsum = 0;
        for(int y = row1; y <= row2; y++){
             for(int x = col1; x <= col2; x++){
                System.out.println(mymatrix[y][x]);
                matrixsum += mymatrix[y][x];
            }
       }
    return matrixsum;
}
}

/**
 * Your NumMatrix object will be instantiated and called as such:
 * NumMatrix obj = new NumMatrix(matrix);
 * int param_1 = obj.sumRegion(row1,col1,row2,col2);
 */