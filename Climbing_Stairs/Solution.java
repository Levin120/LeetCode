public class Solution {
    public int climbStairs(int n) {
        if(n == 1 || n ==2) {
            return n == 1 ? 1 : 2;
        }
        int a = 1, b = 2, c = 0;
        for(int i = 0; i < n - 2; i++) {
            c = a + b;
            a = b;
            b = c;
        }
        return b;
    }
}
