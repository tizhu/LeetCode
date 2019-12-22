class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
       int m = obstacleGrid.length;
       int n = obstacleGrid[0].length;

        int[][] res = new int[m][n];

        for (int i=0; i<m; i++){
            if (obstacleGrid[i][0]==0){
                res[i][0]=1;
            }else{break;}
        } 
        
        for (int j=0; j<n; j++){
            if (obstacleGrid[0][j]==0){
                res[0][j]=1;
            }
            else {break;}
        }

        for (int i=1; i<m; i++){
            for(int j=1;j<n;j++){
                if (obstacleGrid[i][j]==0){
                    res[i][j] = res[i-1][j] + res[i][j-1]; 
                }
                else {res[i][j]=0;}
            }       
        }
        return res[m-1][n-1];
    }
}