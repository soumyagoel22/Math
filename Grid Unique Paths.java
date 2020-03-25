public class Solution {
    public int uniquePaths(int A, int B) 
    {
        int i,j,n,m;
        m=A;
        n=B;
     if(m==0 || n==0) 
     {
        return 0;
     }
    if(m==1 || n==1) 
    {
        return 1;
    }
    int[][] ab = new int[m][n];
    //left column
    for(i=0; i<m; i++)
    {
        ab[i][0] = 1;
    }
    //top row
    for(j=0; j<n; j++)
    {
        ab[0][j] = 1;
    }
    //fill up the dp table
    for(i=1; i<m; i++)
    {
        for(j=1; j<n; j++)
        {
            ab[i][j] = ab[i-1][j] + ab[i][j-1];
        }
    }
    return ab[m-1][n-1];
    }
}
