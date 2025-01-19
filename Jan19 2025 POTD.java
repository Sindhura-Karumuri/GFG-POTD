Rotate a Linked List
Difficulty: MediumAccuracy: 39.95%Submissions: 264K+Points: 4
Given the head of a singly linked list, your task is to left rotate the linked list k times.

  class Solution {
    public Node rotate(Node head, int k) {
        // add code here
        if(head==null || head.next==null) 
            return head;
            Node n = head;
        int l=1;
        while(n.next!=null) {
            l++;
            n=n.next;
        }
        k%=l;
        if(k==0) return head;
        l=1;
        Node curr = head;
        while(curr.next!=null){
            if(l==k) break;
            l++;
            curr=curr.next;
        }
        n.next=head;
        head=curr.next;
        curr.next=null;
        return head;
    }
}
