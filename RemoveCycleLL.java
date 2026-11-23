public class RemoveCycleLL {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;

    public static void removeCycle() {
        Node slow = head;
        Node fast = head;

        boolean cycle = false;

        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if(slow == fast) {
                cycle = true;
                break;
            }
        }
        if(cycle == false) {
                return;
        }

        slow = head;
        Node prev = null;

        while(slow != fast) {
            prev = fast;
            slow = slow.next;
            fast = fast.next;
        }

        prev.next = null;

    }

    public static void print() {
        Node temp = head;

        while(temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }

        System.out.println("null");
    }

    public static void main(String[] args) {
        
        head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        head.next.next.next.next.next = head.next.next;


        removeCycle();
        System.out.println("Linked list after removing cycle:");
        print();
    }
}
