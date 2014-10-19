public class Solution {
    public int numTrees(int n) {
        if(n == 0)
            return 1;
        int s = 0;
        for(int i = 0; i < n; i++) 
        {
            s += numTrees(i) * numTrees(n - i - 1);
        }
        return s;
    }
}
