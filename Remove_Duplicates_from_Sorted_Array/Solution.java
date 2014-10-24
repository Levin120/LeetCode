public class Solution {
    public int removeDuplicates(int[] A) {
        int len = 0;
        for(int i = 0; i < A.length; i++) {
            if((i + 1) < A.length && (A[i] == A[i+1]))
                continue;
            A[len++] = A[i];
        }
        return len;
    }
}
