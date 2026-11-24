public class RemoveNthNode {
    public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int count = 0;

    public static void add(int data){
        Node newNode = new Node(data);

        if(head == null) {
            head = tail = newNode;
            return;
        }

        Node temp = head;
        while(temp.next != null) {
            temp = temp.next;
        }

        temp.next = newNode;
    }

    //Find and remove the nth node from the end

    public static Node removeNth(int n) {
        Node dummy = new Node(0);
        dummy.next = head;

        Node slow = dummy;
        Node fast = dummy;

        for(int i = 0; i <= n; i++) {
            fast = fast.next;
        }

        while(fast != null) {
            slow = slow.next;
            fast = fast.next;
        }

        slow.next = slow.next.next;

        return dummy.next;
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

        add(1);
        add(2);
        add(3);
        add(4);
        add(5);
        print();

        removeNth( 2);
        print();
    }

}
