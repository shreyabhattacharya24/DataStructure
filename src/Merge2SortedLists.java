public class Merge2SortedLists {
    public ListNode mergeTwoListExtraPlace(ListNode list1, ListNode list2) {
        ListNode start=new ListNode();
        ListNode curr=start;
        while(list1!=null && list2!=null){
            if(list1.val<list2.val){
                curr.next=new ListNode(list1.val);
                curr=curr.next;
                list1=list1.next;
            }
            else if(list1.val==list2.val){
                curr.next=new ListNode(list1.val);
                curr=curr.next;
                curr.next=new ListNode(list2.val);
                curr=curr.next;
                list1=list1.next;
                list2=list2.next;
            }
            else{
                curr.next=new ListNode(list2.val);
                curr=curr.next;
                list2=list2.next;
            }
        }
        if(list1!=null){
            while(list1!=null){
                curr.next=list1;
                curr=curr.next;
                list1=list1.next;
            }
        }
        if(list2!=null){
            while(list2!=null){
                curr.next=list2;
                curr=curr.next;
                list2=list2.next;
            }
        }


        return start.next;
    }
    public ListNode mergeTwoListsInPlace(ListNode list1, ListNode list2) {
        if (lis1 == null) return list2;
        if (list2 == null) return list1;

        //To keep a reference of head
        ListNode start = new ListNode();
        ListNode curr;
        if (list2.val < list1.val) {
            //swap as we always proceed thru list1
            ListNode temp = list1;
            list1 = list2;
            list2 = temp;
        }
        while(list1!=null && list2!=null)
        {
         curr=null;
        while (list1 != null && list1.val < list2.val) {
            curr = list1;
            list1 = list1.next;
        }
        //Now point temp to list2 as that is smaller and swap the 2 lists again
        curr = list2;
        //swap
        temp = list1;
        list1 = list2;
        list2 = temp;
        }
    }
}
