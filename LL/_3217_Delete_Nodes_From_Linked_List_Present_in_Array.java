import java.util.*;

// Definition for singly-linked list
class ListNode {
    int val;
    ListNode next;

    ListNode() {}
    ListNode(int val) { 
        this.val = val; 
    }
    ListNode(int val, ListNode next) { 
        this.val = val; 
        this.next = next; 
    }
}

class Solution {
    public ListNode modifiedList(int[] nums, ListNode head) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }

        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode curr = dummy;

        while (curr.next != null) {
            if (set.contains(curr.next.val)) {
                curr.next = curr.next.next; // skip node
            } else {
                curr = curr.next; // move forward
            }
        }

        return dummy.next;
    }
}

public class _3217_Delete_Nodes_From_Linked_List_Present_in_Array {
    // Helper to build a linked list from array
    public static ListNode buildList(int[] arr) {
        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;
        for (int num : arr) {
            curr.next = new ListNode(num);
            curr = curr.next;
        }
        return dummy.next;
    }

    // Helper to print a linked list
    public static void printList(ListNode head) {
        ListNode curr = head;
        while (curr != null) {
            System.out.print(curr.val);
            if (curr.next != null) System.out.print(" -> ");
            curr = curr.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Solution sol = new Solution();

        // Example 1
        int[] nums1 = {1, 2, 3};
        int[] list1 = {1, 2, 3, 4, 5};
        ListNode head1 = buildList(list1);
        System.out.print("Original List: ");
        printList(head1);
        ListNode res1 = sol.modifiedList(nums1, head1);
        System.out.print("Modified List: ");
        printList(res1);

        // Example 2
        int[] nums2 = {1};
        int[] list2 = {1, 2, 1, 2, 1, 2};
        ListNode head2 = buildList(list2);
        System.out.print("\nOriginal List: ");
        printList(head2);
        ListNode res2 = sol.modifiedList(nums2, head2);
        System.out.print("Modified List: ");
        printList(res2);

        // Example 3
        int[] nums3 = {5};
        int[] list3 = {1, 2, 3, 4};
        ListNode head3 = buildList(list3);
        System.out.print("\nOriginal List: ");
        printList(head3);
        ListNode res3 = sol.modifiedList(nums3, head3);
        System.out.print("Modified List: ");
        printList(res3);
    }
}
