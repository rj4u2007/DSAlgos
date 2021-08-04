package com.practice.leetcode.problems;

class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
class Solution {
    public Node copyRandomList(Node head) {
        if(head == null) {
            return head;
        }
        
        Node curr = head;
        // Add dupe nodes and modify the original list
        while(curr != null) {
            Node dup = new Node(curr.val);
            Node next = curr.next;
            curr.next = dup;
            dup.next = next;
            curr = next;
        }
        
        curr = head;
        // Copy over the random pointers to dup list
        while(curr != null) {
            if(curr.next != null && curr.random!= null)
            curr.next.random = curr.random.next;
            curr = curr.next.next;
        }
        
        curr = head;
        Node dupHead = curr.next;
        Node dupCurr = dupHead;
        // Seperate out original and duplicate list
        while(curr != null) {
            Node origNext = curr.next.next;
            Node dupNext = null;
            if(dupCurr.next != null)
            dupNext = dupCurr.next.next;
            curr.next = origNext;
            curr= origNext;
            dupCurr.next = dupNext;
            dupCurr = dupNext;
        }
        return dupHead;
    }
}
public class CloneLinkedListRandomPointers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
