class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
    }
}

public class ReverseLinkedList {
    int i = 0;
    public ListNode reverseList(ListNode head) {
        // Base case: if the list is empty or has only one node
        if (head == null || head.next == null) {
            return head;
        }

        // Recursive step: reverse the rest of the list
        ListNode reversedList = reverseList(head.next);
        System.out.println("-------" + ++i +"------" + reversedList.val +"------" +head.val);

        // Adjust pointers
        head.next.next = head; // Make the next node point back to the current node
        head.next = null;      // Break the current node's link to the next node

        return reversedList;   // Return the head of the reversed list
    }

    // Utility method to print a linked list
    public void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " -> ");
            head = head.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        ReverseLinkedList solution = new ReverseLinkedList();

        // Example: Create a linked list 1 -> 2 -> 3 -> 4 -> 5 -> null
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        System.out.println("Original List:");
        solution.printList(head);

        // Reverse the list
        ListNode reversedHead = solution.reverseList(head);

        System.out.println("Reversed List:");
        solution.printList(reversedHead);
    }
}
