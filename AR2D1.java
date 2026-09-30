// AR2D1. Create a 3×3 int[][] using the {} shortcut with any 9 numbers. Loop through it with two nested loops and print every value as a grid (numbers on the same row, new line before the next row).
public class AR2D1 {
    public static void main(String[] args) {
        int[][] grid = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
               };
        for(int i = 0; i<grid.length;i++){
            for(int j = 0; j< grid[i].length;j++){
                System.out.print(grid[i][j] + " ");
            }
            System.out.println();
        }

    }
}
