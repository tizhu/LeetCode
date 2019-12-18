class Solution:
    def uniquePaths(self, m: int, n: int) -> int:
        res = [[0]*n]*m
        
        for i in range(m):
            res[i][0]=1 
            
        for j in range(n):
            res[0][j]=1 

        for i in range(1,m,1):
            for j in range(1,n,1):
                res[i][j] = res[i-1][j] + res[i][j-1]

        return res[m-1][n-1]        