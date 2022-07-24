class NumMatrix {
   int [][] mymatrix;
    int length;
    int width;
    public NumMatrix(int[][] matrix) {
        mymatrix = matrix;
       
       length = matrix.length;
        width = matrix[0].length;
        
        for (int a = 0;a <= width-1; a++){
            for(int b = 0;b <= length-1; b++) {
                System.out.println(mymatrix[a][b]);
        }
    }
}
    
    
    
    public int sumRegion(int row1, int col1, int row2, int col2) {
        for(int y = 0; y < length-1; y++){
            int prev = 0;
            for(int x = 0;  x < width-1; x++){
                if(x == 0){
                    sumregion[x][y] = NumMatrix[x][y] + prev + NumMatrix[x][y-1] + prev + 0;
                    //first row summary takes all left val from NumMatrix
                }
                sumregion[x][y] = NumMatrix[x][y] + prev + NumMatrix[x][y-1];
                    //take above in sumreg and all left val from NumMatrix
                    System.out.println(sumregion[x][y]);
                prev += NumMatrix[x][y];
                
                //helps with sum of previous matrix previous
             }
        }
    }            
}

/**
 * Your NumMatrix object will be instantiated and called as such:
 * NumMatrix obj = new NumMatrix(matrix);
 * int param_1 = obj.sumRegion(row1,col1,row2,col2);
 */