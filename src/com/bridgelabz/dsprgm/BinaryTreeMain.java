package com.bridgelabz.dsprgm;

public class BinaryTreeMain {
	    public static void main(String[] args) {
	        BinaryTree<Integer> myBinaryTree = new BinaryTree<>();
	        BinaryTree.add(56);
	        BinaryTree.add(30);
	        BinaryTree.add(70);
	        BinaryTree.searchBST(30);
	        int size = BinaryTree.getSize();
	        System.out.println("Size of binary tree is: "+size);
	        System.out.println("Binary Tree is :");
	        BinaryTree.print();
	    }
}