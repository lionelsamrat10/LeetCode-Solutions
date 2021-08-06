class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> solution = new ArrayList<>();
        
        // First element is always 1
        solution.add(new ArrayList<>());
        solution.get(0).add(1);
        
        for(int i=1; i<numRows; i++) {
            List<Integer> row = new ArrayList<>();
            List<Integer> previousRow = solution.get(i-1);
            row.add(1); // First element is always 1
             
            for(int j=1; j<i; j++) {
                row.add(previousRow.get(j) +  previousRow.get(j - 1));
            }
            row.add(1); // Last element is always 1
            solution.add(row);
        }
        return solution;
    }
}
