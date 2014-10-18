public class Solution2 {
    public int climbStairs(int n) {
        int[] step = new int[Math.max(3, n + 1)];
	
	step[0] = 0;
	step[1] = 1;
	step[2] = 2;

	for(int i = 3; i <= n; i++) {
		step[i] = step[i - 1] + step[i - 2];
	}
	return step[n];
    }
}
