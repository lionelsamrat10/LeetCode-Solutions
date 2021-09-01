class Solution {
    public List<Integer> majorityElement(int[] nums) {
        HashMap <Integer, Integer> map = new HashMap<>();
        List <Integer> res = new ArrayList<>();
        // Create the map with array elements and their respective counts
        for(int i=0; i<nums.length; i++) {
            if(!map.containsKey(nums[i])) map.put(nums[i], 1);
            else map.replace(nums[i], map.get(nums[i]) + 1);
        }
        // Find the majority elements i.e. those appear more than n/3 times in the array
        for(Integer num: map.keySet()) {
            if(map.get(num) > nums.length / 3) res.add(num);
        }
        return res;
    }
}
