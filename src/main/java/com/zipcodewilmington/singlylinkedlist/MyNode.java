package com.zipcodewilmington.singlylinkedlist;

public class MyNode <T>{
    private Object data;
    private MyNode next;



    MyNode(Object dataValue)    {
        next = null;
        this.data = dataValue;
    }


    public MyNode getNext() {
        return this.next;
    }

    public Object getData() {
        return this.data;
    }

    public void setNext(MyNode NodeValue)   {
        this.next = NodeValue;
    }







}
