class Solution {
    public int equalPairs(int[][] grid) {
        int [] row_sum = new int[grid.length];
        int [] column_sum = new int[grid.length];
        int total_count = 0;


        for (int i = 0; i < grid.length; i++){
            int each_row_sum = 0;
            for (int j = 0; j < grid[i].length;j++){
                int prev_column_value = column_sum[j];
                each_row_sum = each_row_sum +  grid[i][j];
                column_sum[j] = prev_column_value + grid[i][j];
            }
            row_sum[i] = each_row_sum;
        }

        for (int i = 0 ; i< row_sum.length; i++){
            for (int j = 0; j< column_sum.length; j++){
                if(row_sum[i] == column_sum[j]){
                    int column = i;
                    int row = j ;
                    if(checkElements(grid, column, row) == true){
                        total_count++;
                    };
                }
            }
        }


        return  total_count;
    }

    private static boolean checkElements(int[][] grid, int column, int row) {
        boolean check = true;
        for (int i = 0 ; i< grid.length; i ++ ){
            if(grid[column][i] != grid[i][row]){
                return false;
            }
        }
        return check;
    }
}
