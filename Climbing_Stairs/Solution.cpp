class Solution {
public:
    int climbStairs(int n) {
        if (n == 1 || n == 2) {  
            return n == 1 ? 1 : 2;  
        }  
        int a = 2, b = 1, c;  
        for (int i = 0; i < n - 2; i++) {  
            c = a + b;  
            b = a;  
            a = c;   
        }  
        return a;
    }
};
