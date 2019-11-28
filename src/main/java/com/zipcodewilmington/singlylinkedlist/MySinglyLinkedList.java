package com.zipcodewilmington.singlylinkedlist;

/**
 * Created by leon on 1/10/18.
 */
public class MySinglyLinkedList {
    //Each node has three sections: current, next, and temp. Think of curre
    //When a new node is added to the linkedlist, if head == null, head == value of new node.
    //If head != null, a temp node == value of new node, and the current node is assigned to the head node.
    //We then go through a while loop starting from the head while getData() == null.
    // We call current.getnext() to and change the value o


    private MyNode head;
    private Object data;
    private int counter;


    public MySinglyLinkedList() {
        head = new MyNode(null);
    }

    public void addMyNode(Object data) {
        if (head.getData() == null)
            head = new MyNode(data);

        else {
            MyNode temp = new MyNode(data);
            MyNode current = head;

            if (current.getData() != null) {
                while (current.getNext() != null)
                    current = current.getNext();

                current.setNext(temp);
            }
        }

        counter++;
    }


    public boolean remove(int index) {
        if (index < 0 || index > getSize() || head.getData() == null)
            return false;


        if (index == 0)
            head = head.getNext();

        else if (index == getSize() - 1)
            get(index - 1).setNext(null);

        else {
            MyNode current = get(index - 1);
            current.setNext(current.getNext().getNext());
        }

        counter--;
        return true;
    }

    public MyNode get(int index) {

        if (index < 0) {
            return null;
        }
        MyNode current = head;
        if (current.getData() != null) {
            for (int i = 0; i < index; i++) {
                if (current.getNext() == null) {
                    return null;
                }
                current = current.getNext();
            }
            return current;
        }
        return null;
    }

    public int getSize() {
        return counter;
    }

    public int find(Object object) {
        MyNode current = head;

        if (current.getNext() != null) {
            for (int i = 0; i < counter; i++) {
                if (current.getData() == object) {
                    return i;
                }
                    current = current.getNext();
                }

            }
            return -1;

        }


        public MySinglyLinkedList copy () {
            MySinglyLinkedList copy;
            copy = this;
            return copy;
        }

        public boolean contains (Object object){
            if (find(object) != -1) {
                return true;
            }
            return false;
        }


    }



