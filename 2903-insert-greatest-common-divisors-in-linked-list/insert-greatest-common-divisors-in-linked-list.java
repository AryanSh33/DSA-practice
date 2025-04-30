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
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        if(head.next==null){
            return head;
        }
        ListNode cur=head;
        while(cur.next!=null){
            int value=gcd(cur.val,cur.next.val);
ListNode n= new ListNode(value);
n.next=cur.next;
cur.next=n;
cur=n.next;
            
          
        }
          return head;
    }
    public int gcd(int i,int j){
        int x=Math.min(i,j);
        while(x>0){
            if(i%x==0 && j%x==0){
                return x;
            }
            x--;
        }
        return 1;
    }
}