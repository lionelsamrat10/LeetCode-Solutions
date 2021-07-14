class Solution {
    public String customSortString(String order, String str) {
        int[] map = new int[26];
        for(char c: str.toCharArray()) {
            map[c-'a']++;
        }
        StringBuilder ans = new StringBuilder();
        for(char c: order.toCharArray()) {
            while(map[c-'a']>0) {
                map[c-'a']--;
                ans.append(c);
            }
        }
        if(ans.length()<str.length()) {
            for(int i=0;i<26;i++) {
                while(map[i]>0) {
                    map[i]--;
                    ans.append((char)(i+'a'));
                }
            }
        }
        return ans.toString();
    }
}
