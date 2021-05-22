class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int max = 0;
        List<Integer> ans = new ArrayList<>();
        Map<Integer, Integer> hm = new HashMap<>();
        //Put the elements in the array
        for(int num: nums){
            hm.put(num, hm.getOrDefault(num, 0) + 1);
        }
        // Create a list from elements of HashMap
        List<Map.Entry<Integer, Integer>> list = new ArrayList<Map.Entry<Integer,Integer> >(hm.entrySet());
        // Sort the list
        Collections.sort(list, new Comparator<Map.Entry<Integer,Integer>>(){
            public int compare(
                Map.Entry<Integer, Integer> o1,
                Map.Entry<Integer, Integer> o2){
                    if (o1.getValue() == o2.getValue())
                        return o2.getKey() - o1.getKey();
                    else
                        return o2.getValue() - o1.getValue();
                }
        });
        for (int i = 0; i < k; i++)
            ans.add(list.get(i).getKey());
        return ans.stream().mapToInt(i -> i).toArray();
    }
}
