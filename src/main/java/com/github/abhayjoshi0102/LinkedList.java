package com.github.abhayjoshi0102;

/**
 * Implementation of Linked list of integers.
 */

public class LinkedList {

    // Node class is private class to define the structure of one node of link list.
    private class Node {
        // data field will store the actual data for the linked list.
        private int data;
        // next field will point to next node.
        private Node next;

        public Node() {
        }

        public Node(int data) {
            this.data = data;
        }

        public int getData() {
            return data;
        }

        public void setData(int data) {
            this.data = data;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }
    }
    private Node node;

    public void add(int data) {
        Node newNode = new Node();
        if(node == null) {
            node = new Node();
            node.setData(data);
        }
        else {
            Node node1 = node;
            while (node1.getNext()!=null) {
                node1 = node1.getNext();
            }
            newNode.setData(data);
            node1.setNext(newNode);
        }
    }

    public void removeItemWithValue(int data) {
        Node head = node;
        Node previous = null;
        while(head.getNext()!=null) {
            Node temp = head;
            head = head.getNext();
            previous = temp;

        }
    }

    @Override
    public String toString() {
        String dataInLinkedList = "[ ";
        Node node1 = node;
        if (node1 == null) {
            return "List is empty";
        }
        while (node1.getNext()!=null) {
            dataInLinkedList += node1.getData() + " ";
            node1 = node1.getNext();
        }
        dataInLinkedList += node1.getData() + " ";
        dataInLinkedList += "]";
        return dataInLinkedList;
    }

    public static void main(String [] args) {
        LinkedList listImplementation = new LinkedList();
        System.out.println(listImplementation);
        listImplementation.add(1);
        System.out.println(listImplementation);
        listImplementation.add(2);
        System.out.println(listImplementation);
        listImplementation.add(3);
        System.out.println(listImplementation);
        listImplementation.add(4);
        System.out.println(listImplementation);
    }
}
