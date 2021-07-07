class Solution {
    public int minSetSize(int[] arr) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int i=0; i<arr.length; i++){
            hm.put(arr[i], hm.getOrDefault(arr[i], 0) + 1);
        }
        PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());
        for(int key: hm.keySet()){
            queue.add(hm.get(key));
        }
        int size = arr.length, count = 0;
        while(size > arr.length / 2){
            size -= queue.remove();
            count++;
        }
        return count;
    }
}
