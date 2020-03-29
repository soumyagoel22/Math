public class Solution {
    // public int cpFact(int A, int B) {
    //     int X=1,i,j,k,flag=0;
    //     j=A;
    //     for(i=j;i>=1;i--)
    //     {
    //         if(A%i==0)
    //         {
    //             X=i;
    //             k= gcd(X,B);
    //             if(k==1)
    //             {
    //                 flag=1;
    //                 break;
    //             }
    //         }
    //     }
    //     // if(flag==0)
    //     return X;
    // while(gcd(A,B)!=1){
    //     A=A/gcd(A,B);
    // }
    // return A;
     // }
    // public int gcd(int a,int b)
    // {
    //     if(a==0 && b>0)
    //     {
    //         return b;
    //     }
    //     if(a>0 && b==0)
    //     {
    //         return a;
    //     }
    //     if(a==b)
    //     {
    //         return a;
    //     }
    //     if(a>b)
    //     return gcd((a-b),b);
    //     return gcd(a,(b-a));
    // }
    int gcd(int x,int y){
    int dividend=x>y?x:y;
    int divisor=x>y?y:x;
    while(divisor!=0){
        int rem=dividend%divisor;
        dividend=divisor;
        divisor=rem;
    }
    return dividend;
}

int cpFact(int A, int B) {
    while(gcd(A,B)!=1){
        A=A/gcd(A,B);
    }
     return A;
}
}
