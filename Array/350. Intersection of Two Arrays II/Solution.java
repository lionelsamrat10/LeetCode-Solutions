class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        
        for(int i=0; i<nums1.length; i++) {
            if(hm.containsKey(nums1[i])) hm.put(nums1[i], hm.get(nums1[i]) + 1);
            else hm.put(nums1[i], 1);
        }
        
        for(int i=0; i<nums2.length; i++) {
            if(hm.containsKey(nums2[i]) && hm.get(nums2[i]) > 0) {
                hm.put(nums2[i], hm.get(nums2[i]) - 1);
                list.add(nums2[i]);
            }
        }
        
        int[] res = new int[list.size()];
        for(int i=0; i<list.size(); i++)
            res[i] = list.get(i);
        return res;
    }
}
