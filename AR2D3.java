// AR2D3. Create a 3×3 grid. Print only the values on the main diagonal — that's grid[0][0], grid[1][1], grid[2][2].
public class AR2D3 {
    public static void main(String[] args) {
        int[][] grid = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        // int j = grid[i].length;
        for(int i=0; i<grid.length;i++){
                System.out.println(grid[i][i]);
        }

    }
}
