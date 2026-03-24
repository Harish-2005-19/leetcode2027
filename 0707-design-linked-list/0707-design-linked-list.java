class MyLinkedList {

    class Node {
        int val;
        Node next, prev;

        Node(int val) {
            this.val = val;
            next = null;
            prev = null;
        }
    }
    Node head, tail;
    int c;
    public MyLinkedList() {
        head = null;
        tail = null;
        c = 0;
    }
    public int get(int index) {
        if (index < 0 || index >= c)
            return -1;
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp.val;
    }
    public void addAtHead(int val) {
        Node nn = new Node(val);
        if (head == null) {
            head = nn;
            tail = nn;
        } else {
            nn.next = head;
            head.prev = nn;
            head = nn;
        }
        c++;
    }

    public void addAtTail(int val) {
        Node nn = new Node(val);

        if (tail == null) {
            head = nn;
            tail = nn;
        } else {
            tail.next = nn;
            nn.prev = tail;
            tail = nn;
        }
        c++;
    }
    public void addAtIndex(int index, int val) {
        if (index < 0 || index > c)
            return;
        if (index == 0) {
            addAtHead(val);
            return;
        }
        if (index == c) {
            addAtTail(val);
            return;
        }
        Node temp = head;
        for (int i = 0; i < index - 1; i++) {
            temp = temp.next;
        }
        Node nn = new Node(val);
        nn.next = temp.next;
        nn.prev = temp;
        temp.next.prev = nn;
        temp.next = nn;
        c++;
    }
    public void deleteAtIndex(int index) {
        if (index < 0 || index >= c)
            return;
        if (index == 0) {
            head = head.next;
            if (head != null)
                head.prev = null;
            else
                tail = null;
            c--;
            return;
        }
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        if (temp.next != null)
            temp.next.prev = temp.prev;
        else
            tail = temp.prev;
        if (temp.prev != null)
            temp.prev.next = temp.next;

        c--;
    }
}