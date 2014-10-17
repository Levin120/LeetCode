import java.util.Hashtable;

public class Solution {
    public int[] twoSum(int[] numbers, int target) {
		Hashtable<Integer, Integer> ht = new Hashtable<Integer, Integer>();
        int[] ret = new int[2];
        for(int i = 0; i < numbers.length; i++)
        {
            if ( ht.get(target - numbers[i]) != null ) {
				ret[0] = ht.get(target - numbers[i]) + 1;
				ret[1] = i + 1;
			} else {
				ht.put(numbers[i], i);
			}
        }
        //System.out.println("index1="+ret[0]+", index2="+ret[1]);
        return ret;
    }
}
