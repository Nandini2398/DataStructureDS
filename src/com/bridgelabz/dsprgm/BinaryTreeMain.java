package com.bridgelabz.dsprgm;

public class BinaryTreeMain {
	    public static void main(String[] args) {
	        BinaryTree<Integer> myBinaryTree = new BinaryTree<>();
	        BinaryTree.add(56);
	        BinaryTree.add(30);
	        BinaryTree.add(70);
	        System.out.println("Binary Tree is :");
	        BinaryTree.print();
	    }
}