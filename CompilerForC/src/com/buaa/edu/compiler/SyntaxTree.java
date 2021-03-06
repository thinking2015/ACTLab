package com.buaa.edu.compiler;

public class SyntaxTree {
	private SyntaxTreeNode root;		// 树的根节点
	private SyntaxTreeNode current;		// 现在遍历到的节点
	
	public SyntaxTree() {
		super();
	}
	
	public SyntaxTreeNode getRoot() {
		return root;
	}

	public void setRoot(SyntaxTreeNode root) {
		this.root = root;
	}

	public SyntaxTreeNode getCurrent() {
		return current;
	}

	public void setCurrent(SyntaxTreeNode current) {
		this.current = current;
	}
	
	// 添加一个子节点，必须确定father在该树中
	public void addChildNode(SyntaxTreeNode newNode, SyntaxTreeNode father) {
		if(null == father) father = current;
		
		// 认祖归宗
		newNode.setFather(father);
		// 如果father节点没有儿子，则将其赋值为其第一个儿子
		if(null == father.getFirstSon()) father.setFirstSon(newNode);
		else {
			SyntaxTreeNode currentNode = father.getFirstSon();
			while(null != currentNode.getRight()) {
				currentNode = currentNode.getRight();
			}
			currentNode.setRight(newNode);
			newNode.setLeft(currentNode);
		}
		current = newNode;
	}
	
	// 交换相邻的两棵兄弟子树
	public void switchTwoSubTree(SyntaxTreeNode left, SyntaxTreeNode right) {
		SyntaxTreeNode left_left = left.getLeft();
		SyntaxTreeNode right_right = right.getRight();
		left.setLeft(right);
		left.setRight(right_right);
		right.setLeft(left_left);
		right.setRight(left);
		
		if(left_left != null) left_left.setRight(right);
		if(right_right != null) right_right.setLeft(left);
	}
}
