import java.util.*;

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
