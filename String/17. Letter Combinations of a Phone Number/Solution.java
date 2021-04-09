class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> solution = new ArrayList<>();
        if(digits == null || digits.length() == 0){
            return solution;
        }
        solution.add("");
        String[] mappingArray = new String[] {"0", "1", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"}; 
        for(int i=0; i<digits.length(); i++){
            List<String> list = new ArrayList<>();
            char[] array = mappingArray[digits.charAt(i) - '0'].toCharArray();
            
            for(String str: solution){
                for(char ch: array){
                    list.add(new String(str + ch));
                }
            }
            solution = list;
        }
        return solution;
    }
}
