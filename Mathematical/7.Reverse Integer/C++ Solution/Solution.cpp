/*
7. Reverse Integer

Link: https://leetcode.com/problems/reverse-integer/

Given a signed 32-bit integer x, return x with its digits reversed. If reversing x causes the value to go outside the signed 32-bit integer range [-231, 231 - 1], then return 0.

Assume the environment does not allow you to store 64-bit integers (signed or unsigned).

 

Example 1:

Input: x = 123
Output: 321
Example 2:

Input: x = -123
Output: -321
Example 3:

Input: x = 120
Output: 21
Example 4:

Input: x = 0
Output: 0
 

Constraints:

-231 <= x <= 231 - 1 

*/


class Solution {
public:
int reverse(int x) 
{      
    int r,i=0,n[10],count=0;
    long int rev=0;
    while(x!=0)
    {
      n[i]=x%10;
      x=x/10;
      i++;
      count++;
    }
    for(i=0;i<count;i++)
    {
     rev *= 10;
     rev+= n[i];
    }
if(rev>INT_MAX || rev<INT_MIN)  
{ 
     return 0;
}
    return rev;
    }
};
