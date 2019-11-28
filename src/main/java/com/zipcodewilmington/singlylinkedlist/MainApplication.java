package com.zipcodewilmington.singlylinkedlist;

/**
 * Created by leon on 1/10/18.
 */
public class MainApplication {


    class Node {

        private int value;
        private Node pointer;
        private int index = 0;


        public Node(int value) {
            this.value = value;
        }

    }


    private Node head = null;
    private Node tail = null;



    public void addNode(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail = newNode;
            tail.pointer = newNode;
        }
        if (head != null) {
            tail.index++;
        }
    }

    public void removeNode(int index) {

        int i = 0;
        if(index == 0)
        while(i != index)   {


        }


    }









}













