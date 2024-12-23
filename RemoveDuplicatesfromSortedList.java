//83. Remove Duplicates from Sorted List
//Given the head of a sorted linked list, delete all duplicates such that each element appears only once. Return the linked list sorted as well.


class RemoveDuplicatesfromSortedList {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode cur=head;
        itt(cur);
        return head;
    }
    public void itt(ListNode cur){
if(cur==null||cur.next==null){
    return;
}
if(cur.val==cur.next.val){
    cur.next=cur.next.next;
}
else{
    cur=cur.next;
}
itt(cur);
    }
}
