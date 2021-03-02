package VarunPlayground.Chapter16Proj;

import java.util.NoSuchElementException;

public class NameLinkedList {
    public NameNode header;
    public int size;

    public NameLinkedList() {
        header = new NameNode();
    }

    public NameLinkedList(NameNode header) {
        this.header = header;
        size = 1;
    }
    public NameNode getIndex(int index) {
        if (index >= size || index < 0) {
            throw new IndexOutOfBoundsException();
        }
        if (index == 0) {
            return header;
        } else {
            NameNode copy = header;
            for (int i = 0; i < index-1; i++) {
                copy = copy.next;
            }
            return copy.next;
        }
    }
    public NameNode removeIndex(int index) {
        if (index >= size || index < 0) {
            throw new IndexOutOfBoundsException();
        }
        if (index == 0) {
            NameNode n = header;
            getIndex(size-1).next = header.next;
            header = header.next;
            size--;
            return n;
        } else {
            NameNode copy = header;
            for (int i = 0; i < index-1; i++) {
                copy = copy.next;
            }
            NameNode n = copy.next;
            copy.next = n.next;
            size--;
            return n;
        }
    }
    public NameNode removeName(String name) {
        NameNode copy = header;
        if(header.data.equals(name)) {
            size--;
            return removeIndex(0);
        }
        while(copy.next != null) {
            if(copy.next.data.equals(name)) {
                NameNode n = copy.next;
                copy.next = copy.next.next;
                size--;
                return n;
            }
            copy = copy.next;
        }
        throw new NoSuchElementException();
    }
    public void addAtIndex(NameNode n, int index) {
        if (index >= size || index < 0) {
            throw new IndexOutOfBoundsException();
        }
        if (index == 0) {
            n.next = header;
        } else {
            NameNode copy = header;
            for (int i = 0; i < index-1; i++) {
                copy = copy.next;
            }
            NameNode temp = copy.next;
            copy.next = n;
            while (copy.next != null) {
                copy = copy.next;
            }
            copy.next = temp;
        }
        size++;
    }
    public void addAtEnd(NameNode n) {
        if(size == 0) {
            header = n;
        } else {
            NameNode copy = header;
            while(copy.next != null) {
                copy = copy.next;
            }
            copy.next = n;
        }
        size++;
    }
    public String toString() {
        NameNode copy = header;
        String ret_val = "[";
        while(copy != null) {
            ret_val += copy.data + ", ";
            copy = copy.next;
        }
        return ret_val.substring(0, ret_val.length()-2) + "]";
    }
    static class NameNode {
        public String data;
        public NameNode next;

        public NameNode() {
            this.data = null;
            this.next = null;
        }

        public NameNode(String data) {
            this.data = data;
        }

        public NameNode(String data, NameNode next) {
            this.data = data;
            this.next = next;
        }
    }
}
