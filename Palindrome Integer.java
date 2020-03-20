import java.util.*;

public class Solution {
    public int isPalindrome(int A) {
    String a = Integer.toString(A);
    int i,j,n;
    n=a.length();
    for(i=0,j=n-1;i<n/2 && j>=n/2; i++,j--)
    {
        if(a.charAt(i)!=a.charAt(j))
        return 0;
    }
    return 1;
    }
}
