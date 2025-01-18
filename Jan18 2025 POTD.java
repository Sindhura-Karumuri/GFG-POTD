Reverse a linked list
Difficulty: EasyAccuracy: 73.11%Submissions: 327K+Points: 2
Given the head of a linked list, the task is to reverse this list and return the reversed head.

  class Solution {
    Node reverseList(Node head) {
        // code here
         Node curr=head;
      Node prev=null;
      while(curr!= null){
          Node currp1=curr.next;
          curr.next=prev;
          prev=curr;
          curr=currp1;
      }
      head=prev;
      return prev;
    }
}
