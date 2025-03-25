public class RemoveNodesInKGroup25 {
//    https://leetcode.com/problems/reverse-nodes-in-k-group/description/
    /**
     * Definition for singly-linked list.
     *
     */
    public class ListNode {
          int val;
          ListNode next;
          ListNode() {}
          ListNode(int val) { this.val = val; }
          ListNode(int val, ListNode next) { this.val = val; this.next = next; }
      }
    class Solution {
        public ListNode reverseKGroup(ListNode head, int k) {
            if(head == null || k<=1)return head;

            ListNode dummy = new ListNode(-1);
            dummy.next = head;
            ListNode prevEnd = dummy;

            while(true){
                ListNode temp = prevEnd;
                for(int i=0;i<k &&  temp!=null;i++){
                    temp = temp.next;
                }
                if(temp== null) break;
                ListNode start = prevEnd.next;
                ListNode nextStart = temp.next;

                ListNode curr = start;
                ListNode prev = null;

                while(curr != nextStart){
                    ListNode next = curr.next;
                    curr.next = prev;
                    prev = curr;
                    curr = next;
                }

                prevEnd.next = prev;
                start.next = nextStart;
                prevEnd = start;
            }
            return dummy.next;
        }
    }
}

