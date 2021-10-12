class Solution {
public:
    bool isPalindrome(int x) {
       long int pal=0;
        int r,n[10],i=0,cnt=0;
        r=x;
        while(r!=0)
        {
          n[i]=r%10;
          r=r/10;
          i++;
          cnt++;
        }
        for(i=0;i<cnt;i++)
        {
          pal=pal*10;
          pal=pal+n[i];
        }
   if((x>=0)&&(x==pal))
   return 1;
     return 0;
    }
};
