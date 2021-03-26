//Author: Samrat Mitra
//T(n) = O(n)
class Solution {
    public int[] runningSum(int[] res) {
    int temp = res[0];
    
	if(res.length == 0){
        return new int[res.length];
    }
            
    for(int i = 1; i < res.length; i++){
        res[i] = res[i] + temp;
        temp = res[i];
    }
    
    return res;    
    }
}
