package com.buaa.edu.compiler;

/**
 * 语法树节点
 * @author destiny
 *
 */
public class SyntaxTreeNode {
	// 节点的值，为文法中的终结符或者非终结符
	private String value;
	// 记录某些token的类型
	private String type;
	// 语义分析中记录关于token的其他一些信息，比如关键字是变量，该变量类型为int
	private String extraInfo;
	
	private SyntaxTreeNode father;
	private SyntaxTreeNode left;
	private SyntaxTreeNode right;
	private SyntaxTreeNode firstSon;
	
	public SyntaxTreeNode(String value) {
		this(value, null, null);
	}

	public SyntaxTreeNode(String value, String type, String extraInfo) {
		super();
		this.value = value;
		this.type = type;
		this.extraInfo = extraInfo;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getExtraInfo() {
		return extraInfo;
	}

	public void setExtraInfo(String extraInfo) {
		this.extraInfo = extraInfo;
	}

	public SyntaxTreeNode getFather() {
		return father;
	}

	public void setFather(SyntaxTreeNode father) {
		this.father = father;
	}

	public SyntaxTreeNode getLeft() {
		return left;
	}

	public void setLeft(SyntaxTreeNode left) {
		this.left = left;
	}

	public SyntaxTreeNode getRight() {
		return right;
	}

	public void setRight(SyntaxTreeNode right) {
		this.right = right;
	}

	public SyntaxTreeNode getFirstSon() {
		return firstSon;
	}

	public void setFirstSon(SyntaxTreeNode firstSon) {
		this.firstSon = firstSon;
	}
}
