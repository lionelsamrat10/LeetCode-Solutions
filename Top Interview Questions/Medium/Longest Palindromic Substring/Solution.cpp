string expand(string k, int l, int r){
    int s = k.size();
    while(l >= 0 && r<s && k[l]==k[r]){
        l--;
        r++;
    }
    return k.substr(l+1, r-l-1);
}

class Solution {
public:
    string longestPalindrome(string s) {
        string m, c;
        int maxl = 0, l;
        
        for(int i=0;i<s.size();i++){
            c = expand(s, i, i);
            if(maxl<c.size()){
                m = c;
                maxl = c.size();
            }
        }
        for(int i=0;i<s.size();i++){
            c = expand(s, i, i+1);
            if(maxl<c.size()){
                m = c;
                maxl = c.size();
            }
        }
        return m;
    }
};
