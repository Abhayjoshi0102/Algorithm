package com.github.abhayjoshi0102.Tree;


import java.util.ArrayList;
import java.util.List;

public class BSTree {
    private BinarySearchTreeNode root;
    List<Integer> elements = new ArrayList();

    public void addNode(BinarySearchTreeNode root,int data) {
        BinarySearchTreeNode root1 = root;

        if (isEmpty()) {
            BinarySearchTreeNode node = new BinarySearchTreeNode(data);
            setRoot(node);
        }
        else {
            if (root1 == null) {
                BinarySearchTreeNode node = new BinarySearchTreeNode(data);
                root1 = node;
            } else {
                if (root1.getData() > data) {
                    addNode(root1.getLeftChild(), data);
                }
                else {
                    addNode(root1.getRightChild(),data);
                }
            }
        }
    }

    public BinarySearchTreeNode addNode1(BinarySearchTreeNode root,int data) {
        if (root == null) {
            BinarySearchTreeNode node = new BinarySearchTreeNode(data);
            return node;
        }

        if (root.getData() > data) {
            addNode1(root.getLeftChild(), data);
            addNode1(root.getLeftChild(), data);
        }
        else {
            addNode1(root.getRightChild(),data);
        }
        return null;
    }

    public Boolean isEmpty() {
        if (root == null) {
            return true;
        }
        return false;
    }

    public BinarySearchTreeNode getRoot() {
        return root;
    }

    public void setRoot(BinarySearchTreeNode root) {
        this.root = root;
    }

    public List<Integer> inOrderTraversal(BinarySearchTreeNode root) {
        if (root == null) {
            return null;
        }
        else {
            inOrderTraversal(root.getLeftChild());
            elements.add(root.getData());
            inOrderTraversal(root.getRightChild());
            return elements;
        }
    }
}
