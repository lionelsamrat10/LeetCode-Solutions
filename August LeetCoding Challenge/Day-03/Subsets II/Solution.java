class Solution {
    List<List<Integer>> output;
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort( nums ); //To handle duplicate first we sort the array ( adjacent elements will be similar )
        output = new ArrayList();
        backTracking( 0, nums, new ArrayList() );
        return output;
    }
    
    public void backTracking( int index, int[] nums, List<Integer> list )
    {
        output.add( new ArrayList(list) );
        for( int i = index;i < nums.length; i++ )
        {
            if( i != index && nums[i] == nums[i-1] ) //skip the duplicates, except for the first time
                continue;
            list.add( nums[i]); //include
            backTracking(i+1,nums,list); //explore
            list.remove( list.size()-1);//backtrack, remove the element
        }
    }
}
