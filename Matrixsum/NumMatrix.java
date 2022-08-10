class NumMatrix {
   int [][] matrix;

    public NumMatrix(int[][] matrix) {
        for(int i=0; i<matrix.length;i++){
            for(int x=1; x<matrix[0].length; x++){
                matrix[i][x] += matrix[i][x-1];
                //above addition
                //out of bounds issue (fixed with setting j and i to 1)
            }
        }
        for(int i=1; i<matrix.length;i++){
            for(int x=0; x<matrix[0].length; x++){
                matrix[i][x] += matrix[i-1][x];
                //side  addition
            }
        }
            this.matrix = matrix;
        //constructor
    }
    public int sumRegion(int row1, int col1, int row2, int col2){
        int total = matrix[row2][col2];
        int extra = (col1!=0?matrix[row2][col1-1]:0) + (row1!=0?matrix[row1-1][col2]:0) - ((row1!=0 && col1!=0)?matrix[row1-1][col1-1]:0);
            //fixes out of bounds
 return total - extra;
    }
}
//i did use youtube to help