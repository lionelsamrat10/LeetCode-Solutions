class Solution {
    public List<String> commonChars(String[] words) {
        Map<Character, Integer> map = new HashMap<>();
        for(char i: words[0].toCharArray()) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        for(int i=1; i<words.length; i++) {
            char[] temp =  words[i].toCharArray();
            Map<Character, Integer> mp = new HashMap<>();
            
            for(char j: temp) {
                if(map.containsKey(j)) {
                    mp.put(j, Math.min(mp.getOrDefault(j, 0) + 1, map.get(j)));
                }
            }
            map = mp;
        }
        List<String> result = new ArrayList();
        for(char ch: map.keySet()) {
            int idx = map.get(ch);
            
            while(idx > 0) {
                result.add("" + ch);
                idx--;
            }
        }
        return result;
    }
}
