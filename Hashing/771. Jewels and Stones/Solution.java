// Approach-01 Using HashSet-O(n)
class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int count = 0;
        Set<Character> stoneSet = new HashSet<>();
        for(Character jewel: jewels.toCharArray()){
            stoneSet.add(jewel);
        }
        for(Character stone: stones.toCharArray()){
            if(stoneSet.contains(stone)){
                count++;
            }
        }
        return count;
    }
}

// Approach-02 Using nested loops-O(n^2) - Better than 100% submissions (I don't know how XD XD)
class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int count = 0;
        for(int i=0; i<jewels.length(); i++){
            for(int j=0; j<stones.length(); j++){
                if(stones.charAt(j) == jewels.charAt(i)){
                    count++;
                }
            }
        }
        return count;
    }
}
