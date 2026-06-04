package com.linkedlist;

public class MergeTwoSortedLists {

    // Definition for singly-linked list
    static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
        }
    }

    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        // Dummy node to simplify logic
        ListNode dummy = new ListNode(-1);
        ListNode current = dummy;

        // Merge while both lists have elements
        while (list1 != null && list2 != null) {
            if (list1.val <= list2.val) {
                current.next = list1;
                list1 = list1.next;
            } else {
                current.next = list2;
                list2 = list2.next;
            }
            current = current.next;
        }

        // Attach remaining nodes
        current.next = (list1 != null) ? list1 : list2;

        return dummy.next;
    }

    // Helper method to print list
    public static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {

        // Example 1
        ListNode list1 = new ListNode(1);
        list1.next = new ListNode(2);
        list1.next.next = new ListNode(4);

        ListNode list2 = new ListNode(1);
        list2.next = new ListNode(3);
        list2.next.next = new ListNode(4);

        ListNode result = mergeTwoLists(list1, list2);
        System.out.print("Output: ");
        printList(result);   // 1 1 2 3 4 4

     
    }
}
