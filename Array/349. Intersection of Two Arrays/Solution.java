class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        //Take an arrayList to store the results and that is to be returned
        List<Integer> list = new ArrayList<>();
        //Take a hashset
        Set<Integer> hs = new HashSet<>();
        //Put all the elements of the first array onto the HashSet
        for(int i=0; i<nums1.length; i++){
            hs.add(nums1[i]);
        }
        //Now check whether items of nums2[] is present in nums2[] or not
        for(int i=0; i<nums2.length; i++){
            if(hs.contains(nums2[i])){
                list.add(nums2[i]);
                hs.remove(nums2[i]);
            }
        }
        //Create the result array
        int[] res = new int[list.size()];
        int k=0;
        
        for(int itr: list){
            res[k++] = itr;
        }
        return res;
    }
}

//Better than 97.47% Solutions
//O(n) Approach
//Author: Samrat Mitra
