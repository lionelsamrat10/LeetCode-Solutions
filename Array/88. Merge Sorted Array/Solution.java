class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] temp = new int[nums1.length];
        
        // i points to the low index of the first array
        // j points to the low index of the second array
        // k points to the low index of the temporary array
        int i=0, j=0, k=0;
        
        while(i < m && j < n){
            if(nums1[i] < nums2[j]){
                temp[k++] = nums1[i++];
            }else{
                temp[k++] = nums2[j++];
            }
        }
        
        // Copy the remaining elements of the first array to the temp array if any
        while(i < m){
            temp[k++] = nums1[i++];
        }
        
        // Copy the remaining elements of the second array to the temp array if any
        while(j < n){
            temp[k++] = nums2[j++];
        }
        
        //Copy back the elements from the temporary array back to the main array
        for(int itr=0; itr<nums1.length; itr++){
            nums1[itr] = temp[itr];
        }
    }
}
