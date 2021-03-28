//Author: Samrat Mitra
class Solution {
    public int numDifferentIntegers(String word) {
        String[] str = word.split("\\D");
        Set<String> set = new HashSet<>();
        
        for(String itr: str){
            itr = itr.trim();
            if(!itr.equals("")){
                itr = itr.replaceAll("^0*", "");
                set.add(itr);
            }
        }
        return set.size();
    }
}
//T(n) = O(n)
//Runtime: 13 ms, faster than 100.00% of Java online submissions for Number of Different Integers in a String.
//Memory Usage: 39.6 MB, less than 100.00% of Java online submissions for Number of Different Integers in a String.
