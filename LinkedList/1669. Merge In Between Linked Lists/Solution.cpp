//  Author: Vaibhav Singh
//  Time Complexity - O(n)

/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode() : val(0), next(nullptr) {}
 *     ListNode(int x) : val(x), next(nullptr) {}
 *     ListNode(int x, ListNode *next) : val(x), next(next) {}
 * };
 */

class Solution {
public:
    ListNode* mergeInBetween(ListNode* list1, int a, int b, ListNode* list2) {
        ListNode* newList = new ListNode(0);
        ListNode* last1 = newList;
        
        while(a > 0) {
            a--;
            b--;
            last1->next = list1;
            last1 = last1->next;
            list1 = list1->next;
        }
        
        last1->next = list2;
        
        while(b > 0) {
            b--;
            list1 = list1->next;
        }
        
        while(list2->next != NULL) {
            list2 = list2->next;
        }
        
        list2->next = list1->next;
        
        newList = newList->next;
        
        return newList;
    }
};