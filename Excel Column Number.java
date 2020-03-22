import java.util.*;

public class Solution {
    public int titleToNumber(String A) {
    //     int i,n,j1,k,k1,sum;
    //     char j;
    //     k1=65;
    //     sum=0;
    //     n=A.length();
    //     for(i=0;i<n;i++)
    //     {
    //         j=A.charAt(i);
    //         k=Integer.parseInt(String.valueOf(j));
    //         for(j1=1;j1<27;j1++)
    //         {
    //             if(k==k1)
    //             {
    //                 sum=sum+j1;
    //                 break;
    //             }
    //             k1++;
    //         }
    //     }
    //     return sum;
         int result = 0;
        for (int i = 0; i < A.length(); i++) {
            // result *= 26;
            result += A.charAt(i) - 'A' + 1;
        }
        return result;
    }
}
