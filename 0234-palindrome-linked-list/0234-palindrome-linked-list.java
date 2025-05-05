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
    public boolean isPalindrome(ListNode head) {
       ListNode cur=head;
       int count=0;
       while(cur!=null){
        count++;
        cur=cur.next;
        
       }
       int []arr=new int[count];
       cur=head;
       int i=0;
       while(cur!=null){
        arr[i++]=cur.val;
        cur=cur.next;
        
       }int k=arr.length-1;
       for(int j=0;j<arr.length;j++){
if(arr[k]!=arr[j]){
    return false;
}k--;
       }
       return true;
    }
}