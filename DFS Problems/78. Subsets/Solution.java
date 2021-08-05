class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> listOfSubsets = new ArrayList<>();
        dfs(nums, listOfSubsets, 0, new ArrayList<>());
        return listOfSubsets;
    }
    public void dfs(int[] nums, List<List<Integer>> listOfSubsets, int index, List<Integer> subset) {
        // Base Condition
        // if the combination is done
        if(nums.length <= index) {
            listOfSubsets.add(new ArrayList<>(subset));
            return;
        }
        subset.add(nums[index]);
        dfs(nums, listOfSubsets, index + 1, subset);
        // remove the current one
        subset.remove(subset.size() - 1);
        dfs(nums, listOfSubsets, index + 1, subset);
    }
}
