package com.operr.util;

import java.util.StringJoiner;

class ListConverter {

    private LinkedList linkedList;

    ListConverter(LinkedList linkedList) {
        this.linkedList = linkedList;
    }

    public String toString() {
        Node currentNode = linkedList.getHead();
        StringJoiner joiner = new StringJoiner(", ");
        while (currentNode != null) {
            joiner.add(String.valueOf(currentNode.getData()));
            currentNode = currentNode.getNextElement();
        }
        return "[" + joiner.toString() + "]";
    }

}
