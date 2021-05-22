// Three Different Approaches
class Solution {
    public int singleNumber(int[] nums) {
        Map<Integer, Integer> mp = new HashMap<>();
        //Loop through the array and put the elements and their counts in a hashmap
        for(int i: nums){
            mp.put(i, mp.getOrDefault(i, 0) + 1);
        }
        //Check for element with single occurance
        for(int i: nums){
            if(mp.get(i) == 1){
                return i;
            }
        }
        return 0;
    }
}
// T(n) = O(n)
// S(n) = O(n) because of one HashMap

// Mathematical Approach
class Solution {
  public int singleNumber(int[] nums) {
    int sumOfSet = 0, sumOfNums = 0;
    Set<Integer> set = new HashSet();

    for (int num : nums) {
      if (!set.contains(num)) {
        set.add(num);
        sumOfSet += num;
      }
      sumOfNums += num;
    }
    return 2 * sumOfSet - sumOfNums;
  }
}
// T(n) = O(n)
// S(n) = O(n) because of one HashSet


//Best Solution Using Bit Manipulation
class Solution {
  public int singleNumber(int[] nums) {
    int a = 0;
    for (int i : nums) {
      a ^= i;
    }
    return a;
  }
}
// T(n) = O(n)
// S(n) = O(1) 
// Concept: We can XOR all bits together to find the unique number.
