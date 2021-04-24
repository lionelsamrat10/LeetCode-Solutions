class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        traverse(triangle, triangle.size() - 1);
        return triangle.get(0).get(0);
    }
    
    private void traverse(List<List<Integer>> triangle, int level) {
        if (level == 0) {
            return;
        }
        
        List<Integer> row = triangle.get(level);
        List<Integer> upperRow = triangle.get(level - 1);
        for (int i = 0; i < upperRow.size(); i++) {
            upperRow.set(i, upperRow.get(i) + Math.min(row.get(i), row.get(i + 1)));
        }
        traverse(triangle, level - 1);
    }
}
