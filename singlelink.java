public class singlelink {
  Node head;
	class Node{
		int data;
		Node next;
		Node(int data){
			this.data = data;
			this.next = null;
		}	
	}
void insertAtFirst(int data) {
	Node newnode = new Node(data);
	if(head == null) {
		head = newnode;
	}
	else {
	newnode.next = head;
	head = newnode;
	}
}
void show() {
	Node temp = head;
	while(temp!=null) {
		System.out.println(temp.data+"-->"+temp.next);
		temp = temp.next;
	}
}
void insertAtLast(int data) {
	Node newnode = new Node(data);
	if(head == null) {
		head = newnode;
	}
	else {
		Node temp = head;
		while(temp.next!=null) {
			temp = temp.next;
		}
		temp.next = newnode;
	}
}
void insertAtPos(int data,int pos) {
	if(pos == 0) {
		insertAtFirst(data);
		return;
	}
	Node newnode = new Node(data);
	Node temp = head;
	for(int i=1;i<pos;i++) {
		temp = temp.next;
	}
	newnode.next = temp.next;
	temp.next = newnode;
}
void deleteAtFirst() {
	if(head == null) {
		System.out.println("Empty");
		return;
	}
	head = head.next;
}
void deleteAtPos(int pos) {
	if(pos == 0) {
		deleteAtFirst();
		return;
	}
	if(head == null) {
		System.out.println("Empty");
		return;
	}
	Node temp = head;
	Node prev = null;
	for(int i=1;i<=pos;i++) {
		prev = temp;
		temp = temp.next;
	}
	prev.next = temp.next;
}
public class SinglyImplementation {

	public static void main(String[] args) {
		singlelink sm = new singlelink();
		sm.insertAtFirst(40);
		sm.insertAtFirst(30);
		sm.insertAtLast(50);
		sm.insertAtLast(60);
		sm.insertAtLast(70);
		sm.show();
		sm.deleteAtLast();
		sm.show();
	}

}
}
