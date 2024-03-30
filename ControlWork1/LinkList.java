package ControlWork1;

public class LinkList<E> {


    class Node<E> {
        E data;
        Node next;
        public Node(E data) {
            this.data = data;
            this.next = null;
        }
    }

    Node head;

    public LinkList() {
        this.head = null;
    }

    public void add(E data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

        public void addToBeginning(E data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    public void remove(E data) {
        if (head == null) {
            return;
        }
        if (head.data == data) {
            head = head.next;//
            return;
        }
        Node current = head;
        while (current.next != null) {
            if (current.next.data == data) {
                current.next = current.next.next;
                return;
            }
            current = current.next;
        }
    }

    public int get(int index) {
        Node current = head;
        for (int i = 0; i < index; i++) {
            if (current == null) {
                throw new IndexOutOfBoundsException();
            }
            current = current.next;
        }
        if (current == null) {
            throw new IndexOutOfBoundsException();
        }
        return (int)current.data;
    }



    public boolean isEmpty() {
        return head == null;
    }

    public void print() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public void clear() {
        head = null;
    }
    public void addAtIndex(int index, E data) {
        if (index < 0) {
            throw new IndexOutOfBoundsException("Отрицательный индекс");
        }

        Node newNode = new Node(data);

        if (index == 0) {
            newNode.next = head;
            head = newNode;
            return;
        }

        Node current = head;
        for (int i = 0; i < index - 1; i++) {
            if (current == null) {
                throw new IndexOutOfBoundsException("Index out of bounds");
            }
            current = current.next;
        }

        if (current == null) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }

        newNode.next = current.next;
        current.next = newNode;
    }

    public int size() {
        int count = 0;
        Node current = head;
        while (current != null) {
            count++;
            current = current.next;
        }
        return count;
    }

    public void removeByIndex(int index) {
        if (head == null || index < 0) {
            return;
        }
        if (index == 0) {
            head = head.next;
            return;
        }
        Node current = head;
        int count = 0;
        while (current.next != null && count < index - 1) {
            current = current.next;
            count++;
        }
        if (current.next != null) {
            current.next = current.next.next;
        }
    }

}






