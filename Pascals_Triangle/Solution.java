public class Solution {
    public List<List<Integer>> generate(int numRows) {
        ArrayList<List<Integer>> rt = new ArrayList<List<Integer>>();
        Integer[] prev = null;
        for(int i = 1; i <= numRows; i++) {
            Integer[] row = new Integer[i];
            row[0] = 1;
            row[i - 1] = 1;
            for(int j = 1; j < i - 1; j++) {
                row[j] = prev[j - 1] + prev[j];
            }
            rt.add(new ArrayList<Integer>(Arrays.asList(row)));
            prev = row;
        }
        return rt;
    }
}
