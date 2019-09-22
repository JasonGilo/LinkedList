
public class Linked {
	Node head;
	
	
	class Node{
		int data;
		Node next;
		
		Node(int data){
			this.data = data;
			next=null;
		}
		
	}
	
	public void add(int data) {
		if(head==null) {
			head = new Node(data);
		}else {
			Node newNode = head;
			while(newNode.next!=null) {
				newNode=newNode.next;
			}
			newNode.next= new Node(data);
		}
		
	}
	
	public void add(int data, int position) {
		Node newNode = head;
		if(position==0) {
			Node newHead = new Node(data);
			newHead.next = head;
			head=newHead;
			return;
		}
		
		for(int i = 0; i<position-1; i++) {
			newNode=newNode.next;
		}
		Node newerNode = new Node(data);
		newerNode.next=newNode.next;
		newNode.next = newerNode;
	}
	
	public void printLinked() {
		Node newNode = head;
		while(newNode != null ) {
			System.out.println(newNode.data);
			newNode=newNode.next;
		}
	}
	
	
	public void remove() {
		Node newNode = head;
		while(newNode.next.next!=null) {
			newNode= newNode.next;
		}
		newNode.next=null;
	}
	
	public void remove(int position) {
		Node newNode = head;
		for(int i=0;i<position-1;i++) {
			newNode=newNode.next;
		}
		newNode.next=newNode.next.next;
	}
	
	
	public int size() {
		Node newNode = head;
		int counter=0;
		while(newNode!=null) {
			counter++;
			newNode=newNode.next;
		}
		return counter;
	}
	
	public boolean isEmpty() {
		return size()==0;
	}
	
	public int get(int position) {
		Node newNode = head;
		for(int i = 0; i<position;i++) {
			newNode=newNode.next;
			
		}
		return newNode.data;
	}
	
	public int getFirst() {
		return head.data;
	}
	public int getLast() {
		Node newNode = head;
		while(newNode.next!=null) {
			newNode=newNode.next;
		}
		return newNode.data;
		
	}
	
	
}
