package com.github.abhayjoshi0102.Tree;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import java.util.List;

public class BSTreeTest extends TestCase{
    public BSTreeTest(String testCase) {
        super(testCase);
    }
    public static Test suite() {
        return new TestSuite( com.github.abhayjoshi0102.Tree.BSTreeTest.class );
    }
    public void testBSTree() {
        BSTree bsTree = new BSTree();
        assertNull(bsTree.getRoot());
        bsTree.addNode(bsTree.getRoot(),2);
        assertEquals(2,bsTree.getRoot().getData());
        assertNull(bsTree.getRoot().getLeftChild());
        bsTree.addNode(bsTree.getRoot(),1);
        assertEquals(1,bsTree.getRoot().getLeftChild().getData());
    }

    public void testInOrderTraversal() {
        BSTree bsTree = new BSTree();
        BinarySearchTreeNode root = new BinarySearchTreeNode(2);
        BinarySearchTreeNode left = new BinarySearchTreeNode(1);
        BinarySearchTreeNode right = new BinarySearchTreeNode(3);
        BinarySearchTreeNode leftLeft = new BinarySearchTreeNode(-1);
        root.setLeftChild(left );
        root.setRightChild(right);
        left.setLeftChild(leftLeft);

        bsTree.setRoot(root);
        List<Integer> elements = bsTree.inOrderTraversal(root);
        assertEquals(-1,(int) elements.get(0));
        assertEquals(1,(int) elements.get(1));
        assertEquals(2,(int) elements.get(2));
        assertEquals(3,(int) elements.get(3));
    }
}

