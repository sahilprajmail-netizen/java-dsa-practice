// AR2D4. Create a 2×3 int[][] (2 rows, 3 columns). Find and print the largest value in the entire grid, using nested loops.
public class AR2D4 {
    public static void main(String[] args) {
        int[][] grid = {
                {1,4,6},
                {3,9,5}
        };
        int largest = grid[0][0];
        for(int i = 0;i<grid.length;i++){
            for(int j = 0;j<grid[i].length;j++){
              if ( grid[i][j] > largest){
                  largest = grid[i][j];
                }
            }
        }
        System.out.println(largest);
    }
}
