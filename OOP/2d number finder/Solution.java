class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == target)
                    return true;
            }
        }
        return false;
    }
}
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int x = matrix.length - 1;
        int y = 0;
        int ycounter = 0;
        while (x < matrix.length && y < matrix[0].length && x >= 0){
           
            if(target == matrix[x][y]){
                return true;
            }
            if (target > matrix[x][y]){
                y += 1;
            }
            else{
                x -= 1;
            }
            
        }
        return false;
        }
        
    }