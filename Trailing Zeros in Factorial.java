public class Solution {
    public int trailingZeroes(int A) {
        int i,c,n;
        n=A;
        c=0;
        for (i = 5; n / i >= 1; i *= 5)
        {
            c+= n / i;
        }
        return c;
    }
}
