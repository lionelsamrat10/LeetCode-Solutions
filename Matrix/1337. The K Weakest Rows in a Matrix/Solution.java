class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        int numOfSoldiers[] = new int[mat.length];
        ArrayList<Integer> indices = new ArrayList<>();
        
        // Add the number of soldiers
        for(int i=0; i<mat.length; i++) {
            int numSoldiers = 0;
            for(int j=0; j<mat[i].length; j++) {
                if(mat[i][j] == 1) numSoldiers++;
                else break;
            }
            numOfSoldiers[i] = numSoldiers;
            indices.add(i);
        }
        
        // Logic for custom sorting
        for(int i=1; i<indices.size(); i++) {
            int counter = i;
            for(int j=i-1; j>=0; j--) {
                if(numOfSoldiers[i] < numOfSoldiers[j]) counter--;
            }
            indices.remove(i);
            indices.add(counter, i);
        }
        
        // Create the solution array
        int ans[] = new int[k];
        for(int i=0; i<ans.length; i++) {
            ans[i] = indices.get(i);
        }
        return ans;
    }
}
