//AR2D5. Create a 3×3 grid of numbers. Count and print how many values in the whole grid are even, using nested loops.
public class AR2D5 {
    public static void main(String[] args) {
        int[][] grid = {
                {2,4,3},
                {5,7,6},
                {8,6,9}
        };
        int count = 0;
        for(int i = 0;i<grid.length;i++){
            for(int j=0;j<grid[i].length;j++){
                if(grid[i][j] % 2 ==0){
                    count ++;
                }
            }
        }
        System.out.println(count);
    }
}
