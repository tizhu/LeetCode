class Solution {
    public int[][] generateMatrix(int n) {
        int[][] res = new int[n][n];
        int rowBegin = 0;
        int rowEnd = n-1;
        int columnBegin = 0;
        int columnEnd = n-1;
        int counter=1;
        while(rowBegin<=rowEnd && columnBegin<=columnEnd){
            for (int i=columnBegin; i<=columnEnd; i++){
                res[rowBegin][i]=counter++;
            }
            rowBegin++;
            for(int j=rowBegin;j<=rowEnd;j++){
                res[j][columnEnd]=counter++;
            }
            columnEnd--;

            if (rowBegin<=rowEnd){
                for (int i=columnEnd; i>=columnBegin;i--){
                    res[rowEnd][i]=counter++;
                }
                rowEnd--;
            }

            if (columnBegin<=columnEnd){
                for (int j=rowEnd;j>=rowBegin;j--){
                    res[j][columnBegin]=counter++;
                }
                columnBegin++;
            }
        }
        return res;        
    }
}