QUESTION LINK:88. Merge Sorted Array
https://leetcode.com/problems/merge-sorted-array/
class Solution {
public:
    void merge(vector<int>& nums1, int m, vector<int>& nums2, int n) {
        //we have to enter the largest no at the end of the array
        int p1=m-1,p2=n-1,i=m+n-1;
        while(p2>=0)
        {
            if(p1>=0 && nums1[p1]>nums2[p2])
            {
                nums1[i]=nums1[p1];
                p1--;
                i--;
            }
            
                else
                {
                nums1[i]=nums2[p2];
                p2--;
                i--;
                }
            
        }
        
    }
};
