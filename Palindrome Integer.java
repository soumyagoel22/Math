public class Solution {
    public int isPalindrome(int A) {
    //     int i,n,n1,c,rem,rev,rem1,k,flag=0,r,r1;
    //     c=0;
    //     k=A;
    //     rev=0;
    //     n=A;
    //     n1=A;
    //     if(A>=0 && A<=9)
    //     {
    //         return 1;
    //     }
    //     while(n>0)
    //     {
    //         rem=n%10;
    //         c++;
    //         n=n/10;
    //     }
    //   for(i=0;i<c;i++)
    //   {
    //       rem1=n1%10;
    //       rev=rev*10+rem1;
    //       n1=n1/10;
    //   }
    //   for(i=0;i<c;i++)
    //   {
    //       r=k%10;
    //       r1=rev%10;
    //       if(r==r1)
    //       {
    //           flag=1;
    //           k=k/10;
    //           rev=rev/10;
    //       }
    //       else
    //       {
    //           flag=0;
    //           break;
    //       }
    //   }
    //   if(flag==0)
    //   return 0;
    //   else
    //   return 1;
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
