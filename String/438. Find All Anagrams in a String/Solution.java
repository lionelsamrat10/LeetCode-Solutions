class Solution {
public List<Integer> findAnagrams(String s, String p) {
		//list to hold answer
		List<Integer> list = new ArrayList<>();
		//if length of p is more than entire s. answer is not possible
		if (p.length() > s.length()) {
			return list;
		}
		//map to hold freq of window length
        int[] freq = new int[26];
		//preparefreq map by adding p character count and subtracting s character count
		for (int i = 0; i < p.length(); i++) {
			freq[p.charAt(i) - 'a'] += 1;
			freq[s.charAt(i) - 'a'] -= 1;
		}
		int i = 0;
		for (; i < s.length() - p.length(); i++) {
		//if freq map has all zero it means it is an anagaram
			if (checkAnagram(freq)) {
				list.add(i);
			}
			//now for next index comparison remove ith char and add i +p.length() char to freq map
			freq[s.charAt(i) - 'a'] += 1;
			freq[s.charAt(i + p.length()) - 'a'] -= 1;
		}
       //since last comparison left. check it also
	   if (checkAnagram(freq)) {
			list.add(i);
		}
		//return list
		return list;
	}
	
	private boolean checkAnagram(int[] freq) {
		for (int i = 0; i < freq.length; i++) {
			if (freq[i] != 0) {
				return false;
			}
		}
		return true;
	}    
}
