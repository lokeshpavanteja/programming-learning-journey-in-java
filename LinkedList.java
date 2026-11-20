public class LinkedList {
    public static class Node {
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;                //Creating head
    public static Node tail;                //Creating tail
    public static int size;                 //size

    //Adding node at first

    public void addFirst(int data){
        //Create new node
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head = tail = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
    }

    //Adding node at last

    public void addLast(int data){
        //Create new node
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head = tail = newNode;
            return;
        }

        //tail.next = newNode
        tail.next = newNode;

        //tail = newNode
        tail = newNode;
    }

    // Displaying the linked list

    public void display(){
        if(head == null){
            System.out.println("linked list is empty!");
            return;
        }
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("Null");
    }

    // Adding node at middle

    public void add(int idx, int data){
        if(idx == 0){
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);
        size++;
        Node temp = head;
        int i = 0;

        if(i < idx - 1){
            temp = temp.next;
            i++;
        }

        //i = idx-1; temp ->Prev
        newNode.next = temp.next;
        temp.next = newNode;
    }

    // Remove node at first

    public int removeFirst() {
        if(size == 0){
            System.out.println("Linked list is empty!");
            return Integer.MIN_VALUE;
        }
        else if (size == 1){
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        int val = head.data;
        head = head.next;
        size--;
        return val;
    }

    //Remove node at last

    public int removeLast() {
        if(size == 0){
            System.out.println("Linked list is empty!");
        }
        else if(size == 1){
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        //prev : i = size - 2;
        Node prev = head;
        for(int i = 0; i < size - 2; i++){
            prev = prev.next;
        }

        int val = prev.next.data;
        prev.next = null;
        tail = prev;
        size--;
        return val;
    }

    //Main class
    
    public static void main(String[] args){
        LinkedList ll = new LinkedList();
        ll.addFirst(2);
        ll.addFirst(1);
        ll.addLast(4);
        ll.addLast(5);
        ll.add(2,3);

        ll.display();
        System.out.println("Size of the linked list is : " + size);

        System.out.println("After removing first node");
        ll.removeFirst();
        ll.display();

        System.out.println("After removing last node");
        ll.removeLast();
        ll.display();

        System.out.println("Size of linked list : " + size);
    }
}