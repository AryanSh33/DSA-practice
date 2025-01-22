//LEET 1765. Map of Highest Peak

class highestPeak {
    public int[][] highestPeak(int[][] isWater) {
        int m=isWater.length,n=isWater[0].length;
        int [][]res=new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                res[i][j]=m+n;
            }
        }
for(int i=0;i<m;i++){
    for(int j=0;j<n;j++){
        if(isWater[i][j]==0){
if(i>0){
    res[i][j]=Math.min(res[i][j],res[i-1][j]+1);
}
if(j>0){
   res[i][j]=Math.min(res[i][j],res[i][j-1]+1);
}
        }
        else{
            res[i][j]=0;
        }
    }
}
for(int i=m-1;i>=0;i--){
    for(int j=n-1;j>=0;j--){
        if(i<m-1){
            res[i][j]=Math.min(res[i][j],res[i+1][j]+1);
        }
        if(j<n-1){
   res[i][j]=Math.min(res[i][j],res[i][j+1]+1);
}
    }
}
return res;
    }
}
