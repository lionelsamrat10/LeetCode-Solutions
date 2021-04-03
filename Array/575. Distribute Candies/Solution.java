//O(n) Time complexity using HashSet
class Solution {
    public int distributeCandies(int[] candyType) {
        Set<Integer> set = new HashSet<>();
        //Add all the unique elements to the set
        for(int itr: candyType){
            set.add(itr);
        }
        return Math.min(set.size(), candyType.length / 2);
    }
}
