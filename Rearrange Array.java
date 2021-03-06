import java.util.*;

public class Solution {
    public void arrange(ArrayList<Integer> A) {
         int N = A.size();
        for (int i = 0; i < N; i++) {
            int num = A.get(i);
            int B = num;
            int C = A.get(num);
            if (C >= N) {
                C = A.get(num) % N;
            }
            int encode = B + C * N;
            A.set(i, encode);
        }
        for (int i = 0; i < N; i++) {
            A.set(i, A.get(i) / N);
        }
    }
}
