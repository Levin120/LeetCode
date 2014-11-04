public class Solution {
    public void merge(int A[], int m, int B[], int n) {
        int pa = 0;
        int pb = 0;
        while(pa < pb + m && pb < n) {
            if(A[pa] < B[pb])
                pa++;
            else {
                for(int i = pb + m; i > pa; i--) {
                    A[i] = A[i - 1];
                }
                A[pa] = B[pb];
                pa++;
                pb++;
            }
        }
        for(;pb < n;pb++) 
            A[pb + m] = B[pb];
    }
}
