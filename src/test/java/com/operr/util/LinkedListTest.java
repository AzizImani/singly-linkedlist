package com.operr.util;

import org.junit.Assert;
import org.junit.Test;

public class LinkedListTest {

    @Test
    public void shouldPrintAnEmptyList(){
        LinkedList list = new LinkedList();
        Assert.assertEquals(0, list.getSize());
        Assert.assertEquals("[]", list.toString());
    }

    @Test
    public void shouldAddHead(){
        LinkedList list = new LinkedList();
        list.insert(5);
        Assert.assertEquals(1, list.getSize());
        Assert.assertEquals("[5]", list.toString());
    }

    @Test
    public void shouldAppendElements(){
        LinkedList list = new LinkedList();
        list.insertAll(5, 1);
        Assert.assertEquals(2, list.getSize());
        Assert.assertEquals("[5, 1]", list.toString());
    }

    @Test
    public void shouldNotRemoveAnything(){
        LinkedList list = new LinkedList();
        list.removeTail();
        Assert.assertEquals(0, list.getSize());
        Assert.assertEquals("[]", list.toString());
    }

    @Test
    public void shouldRemoveTail(){
        LinkedList list = new LinkedList();
        list.insertAll(5, 1);
        list.removeTail();
        Assert.assertEquals(1, list.getSize());
        Assert.assertEquals("[5]", list.toString());
    }

    @Test
    public void shouldRemoveWithCondition(){
        LinkedList list = new LinkedList();
        list.insertAll(5, 2, 6, 9, 8, 4);
        list.removeIfGreaterThan(5);
        Assert.assertEquals(3, list.getSize());
        Assert.assertEquals("[5, 2, 4]", list.toString());
    }

    @Test
    public void shouldEmptyTheList(){
        LinkedList list = new LinkedList();
        list.insertAll(5, 2, 6, 9, 8, 4);
        list.removeIfGreaterThan(1);
        Assert.assertEquals(0, list.getSize());
        Assert.assertEquals("[]", list.toString());
    }

}
