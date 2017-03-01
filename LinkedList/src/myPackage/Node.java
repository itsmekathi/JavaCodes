package myPackage;

public class Node{
	protected int data;
	protected Node link;
	
	// Constructor
	public Node() {
		link = null;
		data = 0;
	}
	
	// Constructor
	public Node(int d, Node n)
	{
		data = d;
		link = n;
	}
	
	// Function to set link to next node 
	public void setLink(Node n){
		link = n;
	}
	
	public Node getLink(){
		return link;
	}
	
	public void setData(int d){
		data = d;
	}
	public int getData(){
		return data;
	}
}