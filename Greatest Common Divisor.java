public class Solution {
    public int gcd(int a, int b) {
        if((a>0 && b==0))
            {
                return a;
            }
            if((a==0 && b>0))
            {
                return b;
            }
        // if(a==1 || b==1)
        // {
        // return 1;
        // }
        // if (a == 0 || b == 0)
        //  {
        //   return 0;
        //  }
        if (a == b)
        {
            return a;
        }
        if (a > b)
        {
            return gcd(a-b, b);
        }
        return gcd(a, b-a);
    }
}
