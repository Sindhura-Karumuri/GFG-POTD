Clone List with Next and Random
Difficulty: HardAccuracy: 64.8%Submissions: 103K+Points: 8
You are given a special linked list with n nodes where each node has two pointers a next pointer that points to the next node of the singly linked list, and a random pointer that points to the random node of the linked list.

Construct a copy of this linked list. The copy should consist of the same number of new nodes, where each new node has the value corresponding to its original node. Both the next and random pointer of the new nodes should point to new nodes in the copied list, such that it also represent the same list state. None of the pointers in the new list should point to nodes in the original list.

Return the head of the copied linked list

  class Solution {
    public Node cloneLinkedList(Node head) {
        // code here
        HashMap<Node,Integer> oldListMap = new HashMap<Node,Integer>();

        HashMap<Integer,Node> newListMap = new HashMap<Integer,Node>();

        Node newNodeHead = new Node(head.data);

        Node travOld = head.next;

        Node travNew=newNodeHead;

        oldListMap.put(head,1);

            newListMap.put(1,newNodeHead);

        int i= 2;

        while(travOld!=null){

            Node n = new Node(travOld.data);

            travNew.next= n;

            travNew=n;

            oldListMap.put(travOld,i);

            newListMap.put(i,n);

            i++;

            travOld=travOld.next;

        }

        travOld=head;

        travNew=newNodeHead;

        while(travOld!=null){

            if(travOld.random == null){

                travNew.random = null;

            }

            else{

                int index = oldListMap.get(travOld.random);

                Node n = newListMap.get(index);

                travNew.random=n;

            }

            travOld =travOld.next;

            travNew=travNew.next;

        }

        return newNodeHead;
    }
}
