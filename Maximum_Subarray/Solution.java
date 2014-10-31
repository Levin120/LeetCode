public class Solution {
    public int maxSubArray(int[] A) {
        if(A.length == 0)
            return 0;
        int sum = A[0];
        int max = A[0];
        for(int i = 1; i < A.length; i++) {
            int temp = sum + A[i];
            if(temp > A[i])
                sum = temp;
            else
                sum = A[i];
            max = Math.max(sum, max);
        }
        return max;
    }
}
