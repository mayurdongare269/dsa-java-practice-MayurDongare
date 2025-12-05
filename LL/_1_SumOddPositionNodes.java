import java.util.*; // que in CodeFri Contest Level1

class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}

public class _1_SumOddPositionNodes {

    public static int sumOddPositions(Node head) {
        int sum = 0;
        int pos = 1; // 1-based indexing
        Node curr = head;

        while (curr != null) {
            if (pos % 2 == 1) { // odd position
                sum += curr.data;
            }
            curr = curr.next;
            pos++;
        }

        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input number of nodes
        int n = sc.nextInt();

        // Create linked list
        Node head = null, tail = null;

        for (int i = 0; i < n; i++) {
            int val = sc.nextInt();
            Node newNode = new Node(val);

            if (head == null) {
                head = newNode;
                tail = newNode;
            } else {
                tail.next = newNode;
                tail = newNode;
            }
        }

        // Call function
        int result = sumOddPositions(head);

        // Output result
        System.out.println(result);

        sc.close();
    }
}
