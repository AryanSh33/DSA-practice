/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeElements(ListNode head, int val) {
        ListNode head1=new ListNode(0,head);// intialize new head from 0 just in case that value is on the head
        ListNode cur=head1;
      
        while(cur!=null){
            while(cur.next!=null&& cur.next.val==val){
               
                cur.next=cur.next.next;
            }
            
                 cur=cur.next;
            
        }
        return head1.next;// edge case of first position
    }
}