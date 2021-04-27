class Solution {
    public int furthestBuilding(int[] heights, int bricks, int ladders) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int size = 0;
        int needed = 0;
        for(int i = 1; i < heights.length; i++){
            int jump = heights[i] - heights[i - 1];
            if(jump > 0){
                pq.add(jump);
                size = pq.size();
                if(size > ladders){
                    int longest = pq.remove();
                    needed += longest;
                }
                if(needed > bricks){
                    return i - 1;
                }
            }
        }
        
        return heights.length - 1;
    }
}
