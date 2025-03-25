public class RotateList61 {
//    https://leetcode.com/problems/rotate-list/description/

    /**
     * Definition for singly-linked list.
     *
     */ public class ListNode {
     int val;
    ListNode next;
    ListNode() {}
        ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    class Solution {
        public ListNode rotateRight(ListNode head, int k) {
            if(head ==null || head.next==null)return head;
            if(k==0)return head;
            ListNode tail = head;
            ListNode temp1 = head;
            int size =1;
            while(temp1.next!=null){
                size++;
                temp1 = temp1.next;
            }
            tail = temp1;
            k= k%size;
            while(k!=0){
                ListNode temp = head;
                ListNode prev = null;
                while(temp!=tail){
                    prev = temp;
                    temp = temp.next;
                }
                tail.next = head;
                head = tail;
                tail = prev;
                prev.next = null;
                k--;
            }
            return head;
        }
    }
}
