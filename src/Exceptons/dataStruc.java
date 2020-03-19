
Queue<String> alpha =new LinkedList<>();
Deque<String> alpha =new LinkedList<>();

Queue methods: add poll remove size peek contains
Deque methods: first and last queue methods
priorityqueue methods are same as queue  .The elements of the priority queue are ordered according to the natural ordering, or by a Comparator provided at queue construction time,
poll returns null if the queue is empty but remove throws exception



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
