import java.util.*;
class Solution {
    public void duplicateZeros(int[] arr) {
        //In Place Solution
        int j;
        for(int i=0; i<arr.length; i++){
            if(arr[i] == 0){
                for(j=arr.length - 2; j >= i+1; j--){
                    //Shift by one place
                    arr[j+1] = arr[j];
                }
                arr[j+1] = 0;
                i++;
            }
        }
    }
}
