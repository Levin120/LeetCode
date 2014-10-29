public class Solution {
    public int searchInsert(int[] A, int target) {
        int lo = 0;
        int hi = A.length - 1;
        int index;
        while(lo < hi) {
            int mid = (lo + hi) / 2;
            if(target == A[mid])
                return mid;
            else if(target < A[mid])
                hi = mid - 1;
            else if(target > A[mid])
                lo = mid + 1;
        }
        if(target > A[lo])
        	index = lo + 1;
        else
        	index = lo;
        return index;
    }
}
