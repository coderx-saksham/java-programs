package linked_list;

import java.util.*;

public class insert_ll {
    // Java implementation of the above approach


    static class Node {
        int data;
        Node next;
    }

    ;

    // Given a reference (pointer to pointer)
    // to the head of a list and an int,
    // appends a new node at the end
    static Node append(Node head_ref, int new_data) {
        /* 1. allocate node */
        Node new_node = new Node();

        Node last = head_ref; /* used in step 5*/

        /* 2. put in the data */
        new_node.data = new_data;

	/* 3. This new node is going to be
	the last node, so make next of
	it as null*/
        new_node.next = null;

	/* 4. If the Linked List is empty,
	then make the new node as head */
        if (head_ref == null) {
            head_ref = new_node;
            return head_ref;
        }

        /* 5. Else traverse till the last node */
        while (last.next != null) {
            last = last.next;
        }

        /* 6. Change the next of last node */
        last.next = new_node;
        return head_ref;
    }

    /*
     * Given a reference (pointer to pointer) to the head of a list
     */
    static Node mergeInBetween(Node list1, Node list2,
                               int a, int b) {
        // keeping the index count
        int cnt = 0;

        // taking a new variable for
        // iterating over the linked list1
        Node list = list1;
        // condition for checking
        // till the count reached index a
        while (cnt + 1 != a) {
            // pointing the next node
            list = list.next;
            // increasing the count value everytime
            cnt++;
        }
        // Now demo will be used
        // to iterate from (a+1)th node
        // of list1 to bth node of list1
        Node demo = list.next;
        // now we are linking
        // the ath node to the list2
        list.next = list2;
        // now we use samp
        // for iterating over the list2
        Node samp = list2;
        // we go until the last node of the list2
        while (samp.next != null)
            samp = samp.next;
        // we go until the bth node of the list1
        while (cnt + 1 != b) {
            demo = demo.next;
            cnt++;
        }
        // now we simply link disconnected
        // parts of list1 and list2
        demo = demo.next;
        samp.next = demo;
        return list1;
    }

    // This function prints contents of
    // linked list starting from head
    static void printList(Node node) {
        while (node != null) {
            System.out.print(" " + node.data);
            node = node.next;
        }
    }

    /* Driver code */
    public static void main(String[] args) {
        Node list1 = null, list2 = null;
        list1 = append(list1, 10);
        list1 = append(list1, 11);
        list1 = append(list1, 12);
        list1 = append(list1, 13);
        list1 = append(list1, 14);
        list1 = append(list1, 15);
        list2 = append(list2, 100);
        list2 = append(list2, 101);
        list2 = append(list2, 102);
        list2 = append(list2, 103);
        int a = 3, b = 4;
        list1 = mergeInBetween(list1, list2, a, b);
        printList(list1);
    }
}
