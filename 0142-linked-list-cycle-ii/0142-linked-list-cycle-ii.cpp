/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode(int x) : val(x), next(NULL) {}
 * };
 */
class Solution {
public:
    ListNode *detectCycle(ListNode *head) {
        if (head == NULL)
            return NULL;
        
        while (head != NULL) {
            if (head->val == INT_MAX)
                return head;
            head->val = INT_MAX;
            head = head->next;
        }
        
        return head;
    }
};

/*struct ListNode *detectCycle(struct ListNode *head) {
    if(head == NULL)
        return NULL;
    struct ListNode* tmp = head;
    while(head != NULL){
        if(head->val == 1000000)
            return head;
        head->val = 1000000;
        head = head->next;
    }
    return head;
}*/