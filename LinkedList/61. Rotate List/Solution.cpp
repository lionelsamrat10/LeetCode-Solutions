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
    void append(ListNode** head_ref, int new_data) { 
        // ListNode* new_node = ListNode(new_data);
        ListNode* new_node = new ListNode(new_data);
        // new_node->val = new_data;
        // new_node->next = NULL;
        
        ListNode *last = *head_ref;
        if (*head_ref == NULL) 
        { 
            *head_ref = new_node; 
            return; 
        } 
        while (last->next != NULL) 
            last = last->next; 

        last->next = new_node; 
        return; 
    } 
    
    int findSize(ListNode* node){
        int count = 0;
        while(node!=NULL){
            count++;
            node = node->next;
        }
        return count;
    }
    
    void removeBeg(ListNode** head_ptr){
        ListNode* temp = *head_ptr;
        *head_ptr = (*head_ptr)->next;
        delete temp;
        return;
    }
    
    ListNode* rotateRight(ListNode* head, int k) {
        int size = findSize(head);
        if(size>0) k%=size;
        int travLen = size-k;

        if(travLen>0){
            for(int i=0; i<travLen; i++){
                append(&head,head->val);
                removeBeg(&head);
            }
        }
        
        return head;
    }
};