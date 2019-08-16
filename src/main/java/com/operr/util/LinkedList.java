package com.operr.util;

import java.util.function.Predicate;

public class LinkedList {

    private Node head;
    private int size;

    public void insertAll(int ... data){
        for (int value : data) {
            insert(value);
        }
    }

    public void insert(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node lastNode = head;
            while (lastNode.getNextElement() != null) {
                lastNode = lastNode.getNextElement();
            }
            lastNode.setNextElement(newNode);
        }
        size++;
    }

    public void removeTail() {
        if (head == null) {
            return;
        }
        Node lastNode = head;
        Node previous = null;
        while (lastNode.getNextElement() != null) {
            previous = lastNode;
            lastNode = lastNode.getNextElement();
        }
        if (previous == null) {
            head = null;
        } else {
            previous.setNextElement(null);
        }
        size--;
    }

    /* Deletes all occurrence if the condition is met.*/
    public void removeIf(Predicate<Node> predicate) {
        Node current = head;
        Node previous = null;

        /* If head node itself met the condition */
        while (current != null && predicate.test(current))
        {
            head = current.getNextElement();
            current = head;
            size--;
        }

        // Delete other occurrences
        while (current != null)
        {
            // Search for the node to be deleted
            while (current != null && !predicate.test(current)){
                previous = current;
                current = current.getNextElement();
            }

            // If no nodes to be deleted from the linked list
            if (current == null) return;

            // Remove the node from the linked list
            previous.setNextElement(current.getNextElement());

            current = previous.getNextElement();
            size--;
        }
    }

    public void removeIfGreaterThan(int value) {
        removeIf((e) -> e.getData() > value);
    }

    public String toString() {
        ListConverter converter = new ListConverter(this);
        return converter.toString();
    }

    public int getSize() {
        return size;
    }

    Node getHead() {
        return head;
    }
}