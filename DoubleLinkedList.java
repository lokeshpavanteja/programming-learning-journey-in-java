
public class DoubleLinkedList {

    public class Node {
        int data;
        Node next;
        Node prev;

        public Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    // Add at beginning
    public void addFirst(int data) {
        Node newNode = new Node(data);
        size++;

        if (head == null) {
            head = tail = newNode;
            return;
        }

        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }

    // Print linked list
    public void print() {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + "<->");
            temp = temp.next;
        }

        System.out.println("null");
    }

    // Remove first node
    public int removeFirst() {

        if (head == null) {
            System.out.println("DLL is empty!");
            return Integer.MIN_VALUE;
        }

        int val = head.data;

        if (size == 1) {
            head = tail = null;
            size--;
            return val;
        }

        head = head.next;
        head.prev = null;

        size--;
        return val;
    }

    public static void main(String[] args) {

        DoubleLinkedList dll = new DoubleLinkedList();

        dll.addFirst(3);
        dll.addFirst(2);
        dll.addFirst(1);

        dll.print();

        

        int removed = dll.removeFirst();

        System.out.println("Deleted element: " + removed);

        dll.print();
        
    }
}
