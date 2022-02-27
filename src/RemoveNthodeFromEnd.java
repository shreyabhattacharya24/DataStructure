public class RemoveNthodeFromEnd {
    public ListNode removeNthFromEnd(ListNode head, int n) {
      //start 1 tep before head and first reach n step thru fast pointer. Then proceed both pointers by 1 step
      //at same time. Till the time fast reaches end, slow pointer will be at the required node.
        ListNode start=new ListNode();
        start.next=head;
        ListNode fast=start;
        ListNode slow=start;
        for(int i=1;i<=n;++i)
            fast=fast.next;
        while(fast.next!=null){
            fast=fast.next;
            slow=slow.next;
        }
        slow.next=slow.next.next;
        return start.next;
    }
}
