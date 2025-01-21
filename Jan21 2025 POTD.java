Linked List Group Reverse
Difficulty: HardAccuracy: 57.08%Submissions: 223K+Points: 8
Given the head a linked list, the task is to reverse every k node in the linked list. If the number of nodes is not a multiple of k then the left-out nodes in the end, should be considered as a group and must be reversed.

  class Solution {
    public static Node reverseKGroup(Node head, int k) {
        // code here
         if(head==null || head.next==null) return head;
        Node t=head,n=null,p=null;
        while(t!=null){
            int l=1;
            while(t.next!=null && l<k){
                t=t.next;
                l++;
            }
            if(p!=null) p.next=t;
            if(n==null){
                p=head;
                head=t;
            }
            else p=n;
            n=t.next;
            t.next=null;
            reverse(p);
            p.next=n;
            t=n;
        }
        return head;
    }
    static Node reverse(Node head){
        if(head==null || head.next==null) return head;
        Node t=head,p=null;
        while(t!=null){
            Node n =t.next;
            t.next=p;
            p=t;
            t=n;
        }
        return p;
    }
}  
