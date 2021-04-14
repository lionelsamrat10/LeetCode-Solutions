class Solution {
    public int[] constructArray(int n, int k) {
        int e = 1; // even index
        int[] arr = new int[n];
        int o = k+1; // odd index
        int t = 0;
        // first start with k unique elements selecting numbers from 1...k+1 from each end.
        while(t<n){
            
            if(t%2==0){
                arr[t++] = e++;
            } else {
                arr[t++] = o--;
            }
            
            if(e>o) //once we have all the k unique numbers in the arr,
                    //we will just add the rest of the numbers
                break;
            
        }
        int i = k+1;
        while(t<n){
                arr[t++] = ++i;
            
        }
        return arr;
    }
}
