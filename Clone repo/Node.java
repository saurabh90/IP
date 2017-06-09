package com.ip.common;

public class Node {
	private int date;
	private Node node;
	private Node left;
	private Node right;
	
	
	public Node(int date) {
		this.date = date;
		this.left=null;
		this.right=null;
	}
	public int getDate() {
		return date;
	}
	public void setDate(int date) {
		this.date = date;
	}
	public Node getNode() {
		return node;
	}
	public void setNode(Node node) {
		this.node = node;
	}
	public Node getLeft() {
		return left;
	}
	public void setLeft(Node left) {
		this.left = left;
	}
	public Node getRight() {
		return right;
	}
	public void setRight(Node right) {
		this.right = right;
	}
	
	

}
