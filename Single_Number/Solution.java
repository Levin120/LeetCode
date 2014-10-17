public class Solution {
    public int singleNumber(int[] A) {
        if(A == null || A.length == 0) {
			return 0;
		}
		int ret = A[0];
		for (int i = 1; i < A.length; i++) {
			ret = ret ^ A[i];
		}
		return ret;
    }
}
