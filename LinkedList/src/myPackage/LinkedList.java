package myPackage;

public class LinkedList {
	protected Node start;
	protected Node end;
	public int size;
	
	// constructor
	public LinkedList(){
		start = null;
		end = null;
		size = 0;
	}
	
	public boolean isEmpty(){
		return size == 0;
	}
	
	public int getSize(){
		return size;
	}
	
	public void insertAtStart(int val){
		Node nptr = new Node(val, null);
		size++;
		if(start == null){
			start = nptr;
			end = start;
		}
		else
		{
			nptr.setLink(start);
			start = nptr;
		}
	}
	
	public void insertAtEnd(int val){
		Node nptr = new Node(val, null);
		size++;
		
		if(start == null)
		{
			start = nptr;
			end = start;
		}
		else{
			end.setLink(nptr);
			end = nptr;
		}
	}
	
	public void insertAtPos(int val, int pos){
		Node nptr = new Node(val, null);
		Node ptr = start;
		pos = pos - 1;
		
		for(int i  = 1 ; i< size ; i++){
			if(i == pos){
				Node tmp = ptr.getLink();
				ptr.setLink(nptr);
				nptr.setLink(tmp);
				break;
			}
			ptr = ptr.getLink();
		}
		size++;
	}
	
	public void deleteAtPos(int pos){
		if(pos == 1){
			start = start.getLink();
			size--;
			return;
		}
		if(pos == size){
			Node s = start;
			Node t = start;
			while(s != end)
			{
				t = s;
				s.getLink();
			}
			end = t;
			end.setLink(null);
			size--;
			return;
		}
		Node ptr = start;
		pos = pos - 1;
		for (int i = 1 ; i< size ; i++){
			if(i == pos){
				Node tmp = ptr.getLink();
				tmp = tmp.getLink();
				ptr.setLink(tmp);
				break;
			}
			ptr = ptr.getLink();
		}
		size--;
	}
	
	public void display(){
		if(size == 0){
			System.out.print("Empty");
			return;
		}
		if(start.getLink() == null){
			System.out.println(start.getData());
			return;
		}
		Node ptr = start;
		System.out.print(start.getData() + "->");
		ptr = start.getLink();
		while(ptr.getLink() != null){
			System.out.print(ptr.getData() + "->");
			ptr = ptr.getLink();
		}
		System.out.println(ptr.getData() + "\n");
	}
	
	public void reverseList(){
		Node prev = null;
		Node current = start;
		Node next = null;
		
		while(current != null){
			next = current.getLink();
			current.setLink(prev);
			prev = current;
			current = next;
		}
		start = prev;
		end = current;
	}
}
