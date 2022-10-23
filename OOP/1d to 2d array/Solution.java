class Solution {
    public int[][] construct2DArray(int[] original, int m, int n) {
        //m is row
        //n is collum
    int[][] twoDarray = new int[m][n];
        if(m*n != original.length)
            return new int[][]{};
        int z = 0;
        
            for (int x = 0; x < m; x++){
                for (int y = 0; y < n; y++)
                        twoDarray[x][y] = original[z++];
            }
 return twoDarray;
        }
   
    }
