package com.operr.util;

class Node {

    private int data;
    private Node nextElement;

    Node(int data) {
        this.data = data;
        this.nextElement = null;
    }

    public int getData() {
        return data;
    }

    public Node getNextElement() {
        return nextElement;
    }

    public void setNextElement(Node nextElement) {
        this.nextElement = nextElement;
    }
}