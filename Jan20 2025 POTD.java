Merge two sorted linked lists
Difficulty: MediumAccuracy: 62.91%Submissions: 172K+Points: 4
Given the head of two sorted linked lists consisting of nodes respectively. The task is to merge both lists and return the head of the sorted merged list.

  class Solution {
    Node sortedMerge(Node head1, Node head2) {
        // code here
        Node temp1=head1;
        Node temp2=head2;
        Node dummyNode = new Node(-1);
        Node sort=dummyNode;
        while(temp1!=null && temp2!=null){
            if(temp1.data<temp2.data){
                sort.next=temp1;
                sort=temp1;
                temp1=temp1.next;
            }
            else{
                 sort.next=temp2;
                sort=temp2;
                temp2=temp2.next;
            }
        }
       if(temp1!=null){
           sort.next=temp1;
       }
       else{
           sort.next=temp2;
       }
        return dummyNode.next;
    }
}
