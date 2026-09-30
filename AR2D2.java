// AR2D2. Using the same or a new 3×3 grid, find and print the sum of all elements in the whole grid (one running total across every row and column).
public class AR2D2 {
    public static void main(String[] args) {
        int[][] grid= {
                {1, 4, 5},
                {2, 2, 6},
                {7, 2, 1}
        };
        int sum =0;
        for(int i = 0; i<grid.length;i++){
            for( int j = 0;j<grid[i].length;j++){
                sum = sum + grid[i][j];
            }
        }
        System.out.println(sum);
        }

}
