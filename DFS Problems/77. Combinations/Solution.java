class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> solution = new ArrayList<>();
        dfs(solution, n, k, 0, new ArrayList<Integer>());
        return solution;
    }
    public void dfs(List<List<Integer>> solution, int n, int k, int index, List<Integer> current) {
        if(current.size() == k) {
            solution.add(new ArrayList<>(current));
            return;
        }
        for(int i = index + 1; i <= n; i++) {
            current.add(i);
            dfs(solution, n, k, i, current);
            // Backtracking
            current.remove(current.size() - 1);
        }
    }
}
