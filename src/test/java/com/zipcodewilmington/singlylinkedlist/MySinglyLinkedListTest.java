package com.zipcodewilmington.singlylinkedlist;

import org.junit.Assert;
import org.junit.Test;

public class MySinglyLinkedListTest {

    @Test
    public void addMyNodeTest() {
        MySinglyLinkedList mySinglyLinkedList = new MySinglyLinkedList();


        mySinglyLinkedList.addMyNode(5);
        mySinglyLinkedList.addMyNode(4);
        mySinglyLinkedList.addMyNode(0);

        Assert.assertTrue(mySinglyLinkedList.getSize() == 3);
    }

    @Test
    public void removeMyNodeTest() {
        MySinglyLinkedList mySinglyLinkedList = new MySinglyLinkedList();


        mySinglyLinkedList.addMyNode(5);
        mySinglyLinkedList.addMyNode(4);
        mySinglyLinkedList.addMyNode(2);
        mySinglyLinkedList.addMyNode(2);

        mySinglyLinkedList.remove(2);

//        Assert.assertTrue(mySinglyLinkedList.remove(1));
        Assert.assertEquals(3, mySinglyLinkedList.getSize());
    }



    @Test
    public void containsTest() {
        MySinglyLinkedList mySinglyLinkedList = new MySinglyLinkedList();

        mySinglyLinkedList.addMyNode(5);
        mySinglyLinkedList.addMyNode(4);
        mySinglyLinkedList.addMyNode(0);

        Assert.assertTrue(mySinglyLinkedList.contains(5));
    }

    @Test
    public void findTest()  {
        MySinglyLinkedList mySinglyLinkedList = new MySinglyLinkedList();

        mySinglyLinkedList.addMyNode(5);
        mySinglyLinkedList.addMyNode(4);
        mySinglyLinkedList.addMyNode(0);



        Assert.assertEquals(1, mySinglyLinkedList.find(4));


    }
}



