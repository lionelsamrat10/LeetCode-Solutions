class Solution {
    public int findDuplicate(int[] nums) {
        Set<Integer> hs = new HashSet<>();
        for(int num: nums){
            if(hs.contains(num)){
                return num;
            }
            hs.add(num);
        }
        return -1;
    }
}
