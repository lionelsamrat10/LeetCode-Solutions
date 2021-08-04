class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> solution = new ArrayList<List<Integer>>();
        dfs(solution, new ArrayList<Integer>(), nums);
        return solution;
    }
    public void dfs(List<List<Integer>> solution, List<Integer> current, int[] nums) {
        if(current.size() == nums.length) {
            solution.add(new ArrayList<>(current));
            return;
        }
        for(int i=0; i<nums.length; i++) {
            if(current.contains(nums[i])) continue;
            // Add the number to the current set of numbers i.e. permutations
            current.add(nums[i]);
            dfs(solution, current, nums);
            current.remove(current.size() - 1);
        }
    }
}
