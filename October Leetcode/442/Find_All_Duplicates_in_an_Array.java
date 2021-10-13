class Solution {
    public List<Integer> findDuplicates(int[] nums) {
      List<Integer> result =new ArrayList<>();
      Set<Integer> unique =new HashSet<>();
      for(int num:nums)
      {
          if(unique.contains(num))
          {
              if(!result.contains(num))
                   result.add(num);
          }
          unique.add(num);
      }
    return result;
        
    }
}
