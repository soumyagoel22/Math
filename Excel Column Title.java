public class Solution {
    public String convertToTitle(int A) {
        int n=A;
         String name = "";
    while (n > 0) {
        n--;
        name = (char)('A' + n%26) + name;
        n /= 26;
    }
    return name;
    }
}
