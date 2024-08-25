public class singly {
  Node head;
  class Node{
    int data;
    Node next;
    Node(int data){
      this.data=data;
      this.next=null;
    }
  }
  void insertAtFirst(int data){
    Node newnode=new Node(data);
    if(head==null){
      head=newnode;
      }
      newnode.next=head;
      head=newnode;
    }
    void show(){


    }
    void insertAtLast(int data){
      Node n=new Node(data);
      if(head==null){
        head=n;
      }
      else{
        Node temp=head;
        while(temp.next!=null){
          temp=temp.next;
        }
        temp.next=n;
      }
    }
  }
