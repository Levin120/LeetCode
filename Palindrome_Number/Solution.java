public class Solution {
    public boolean isPalindrome(int x) {
        if(x < 0)
            return false;
        if(x == 0)
            return true;
        int y = 0;
        int z = x;
        while(x >= 10) {
            int temp = x % 10;
            y = y * 10 + temp;
            x = x / 10;
        }
        y = y * 10 + x;
        if(z == y)
            return true;
        else
            return false;
    }
}
