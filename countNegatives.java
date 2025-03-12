//2529. Maximum Count of Positive Integer and Negative Integer
class countNegatives {
    public int countNegatives(int[][] grid) {
        int count=0;
        int m=grid.length;
        int n=grid[0].length;
        for(int i=0;i<m;i++){
            for(int j=n-1;j>=0;j--){
                if(grid[i][j]<0){
count++;
                }
                else{
                    break;
                }
            }
        }
        return count;
    }
}
