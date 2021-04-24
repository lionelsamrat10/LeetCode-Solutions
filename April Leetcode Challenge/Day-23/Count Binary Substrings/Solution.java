class Solution {
     public int countBinarySubstrings(String s) {
        int[] group=new int[s.length()];   
        group[0]=1;
        int t=0;
        
        for(int i=1;i<s.length();i++){
            if(s.charAt(i)!=s.charAt(i-1)){
                group[++t]=1;
            }else{
                group[t]++;
            }
        }
      
        int ans=0;
        for(int i=1;i<s.length();i++){     // for(int i=1;i<=t;i++) this is also correct
            ans+=Math.min(group[i-1],group[i]);
        }
        return ans;
    }  
}
