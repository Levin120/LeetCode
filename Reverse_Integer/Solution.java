public class Solution {
    public int reverse(int x) {
		if(x == 0)
			return 0;
		int ret = 0;
		boolean isreg = false;
		if (x < 0) {
			isreg = true;
			x = -x;
		}
		int[] array = new int[33];
		int i = 0;
		int length = 0;
		while (x >= 1) {
			int digit = x % 10;
			array[i] = digit;
			x /= 10;
			i++;
			length++;
		}
		int sum = 0;
		for (int j = 0; j < length; j++) {
			sum = sum * 10 + array[j];
		}
		if (isreg) {
			ret = -sum;
		} else {
			ret = sum;
		}
		return ret;
	}
}
