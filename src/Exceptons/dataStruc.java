
class Node{
    Node next;
    int data;
    Node( int data){
        this.data=data;
    }
}

class Quuu{
    //add to tail remove from head
    Node head;
    Node tail;
    public int remove(){
        int data= head.data;
        head=head.next;
        if(head==null){
            tail=null;
        }
        return data;
    }

    public void add(int data){
        Node node=new Node(data);
        if(tail!=null){
            tail.next=node; //adding to tail.next
        }
        tail=node;  //moving tail pointer to the node
        if(head==null) head=tail;//head will always contain pointer to the very first node
    }
}
