class Solution {
    public int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>(); 
        for(int a : nums1)
            for(int b : nums2){
                int s = a+b;
                map.put( s, map.getOrDefault(s, 0)+1 ); 
            }
        
        int result=0;
        for(int c : nums3)
            for(int d : nums4){
                int s = -c-d;
                result += map.getOrDefault(s, 0);
            }
        return result; 
    }
}
