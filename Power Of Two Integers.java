import java.util.*;

public class Solution {
    public int isPower(int a) {
        if(a==1) return 1;
    for (int i = 2; i*i <= a; i++) {
      int p = a;
      while(p%i == 0){
        p/=i;
      }
      if(p == 1) return 1;
    }
    return 0;
        
    }
}
