package ua.ithlillel.dnipro.Cherednychenko;

import java.util.Iterator;


public class TwoWayList<T> implements Iterable<T> {
    private Node head;
    private Node tail;
    private int size = 0;

    @Override
    public Iterator<T> iterator() {
        return new ListIterator();
    }

    private class ListIterator<T> implements Iterator<T> {
        Node cur = head;

        @Override
        public boolean hasNext() {
            return cur != null;
        }

        @Override
        public T next() {
            T val = (T) cur.value;
            cur = cur.next;
            return val;
        }
    }

    public ListBackIterator reverseIterator() {
        return new ListBackIterator();
    }


    public class ListBackIterator {
        Node curTail = tail;

        public boolean hasPrev() {
            return curTail != null;
        }

        public T prev() {
            T val = (T) curTail.value;
            curTail = curTail.prev;
            return val;
        }
    }


    private class Node {
        T value;
        Node next;
        Node prev;

        public Node(T value) {
            this.value = value;
        }

        public Object getValue() {
            return value;
        }

        public void setValue(T value) {
            this.value = value;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }


        public Node getPrev() {
            return prev;
        }

        public void setPrev(Node prev) {
            this.prev = prev;

        }
    }

    public int size() {
        return size;
    }

    public void add(T value) {
        Node n = new Node(value);
        if (head == null) {
            head = tail = n;
        } else {
            n.prev = tail;
            tail.next = n;
            tail = n;
        }
        size++;
    }

    private Node getNodeByIndex(int index) {
        Node cur=null;
        int i = 0;
        if (index < (int) (size / 2)) {
            cur = head;
            while (iterator().hasNext()) {
                if (i == index) {
                   break;
                }
                cur = cur.next;
                ++i;
            }
        } else {
            cur = tail;
            i = size - 1;
            while (iterator().hasNext()) {
                if (i == index) {
                   break;
                }
                cur = cur.prev;
                --i;
            }
        }
        return cur;
            /*if (index < (int) (size / 2)) {
            Node cur = head;
            for (int i = 0; i < index; i++) {
                cur = cur.next;
            }
            return cur;
        } else {
            Node cur = tail;
            for (int i = (size-1); i > index; i--) {
                cur = cur.prev;
            }
            return cur;}*/
    }

        public T get ( int index){
            checkIndex(index);
            Node cur = getNodeByIndex(index);
            return (T) cur.value;
        }

        public void set ( int index, T value){
            checkIndex(index);
            Node cur = getNodeByIndex(index);
            cur.value = value;
        }

        private void checkIndex ( int index){
            if (index < 0 || index >= size) throw new IndexOutOfBoundsException();
        }

        public void removeByIndex ( int index){
            checkIndex(index);
            Node cur = getNodeByIndex(index);
            if (cur == head) {
                head.next.prev = null;
                head = head.next;
            } else if (cur == tail) {
                tail.prev.next = null;
                tail = tail.prev;
            } else {
                cur.prev.next = cur.next;
                cur.next.prev = cur.prev;
                cur = null;

            }
            --size;
        }

        public void removeByIndex ( int index, Node cur){
            checkIndex(index);
            if (cur == head) {
                head.next.prev = null;
                head = head.next;
            } else if (cur == tail) {
                tail.prev.next = null;
                tail = tail.prev;
            } else {
                cur.prev.next = cur.next;
                cur.next.prev = cur.prev;

            }
            --size;
        }

        public void removeByValue (T value){
            int i = 0;
            Node cur = head;
            while (iterator().hasNext()) {
                if (cur.value == value) {
                    removeByIndex(i, cur);
                    break;
                }
                cur = cur.next;
                ++i;
            }
        }

 /*   @Override
    public void forEach (Consumer<? super T> consumer){
        for (Node cur=head; cur!=null; cur=cur.next){
            consumer.accept((T)cur.value);
        }
    }*/
    }
