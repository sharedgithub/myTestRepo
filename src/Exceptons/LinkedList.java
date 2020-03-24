package main.java;

public class LL {



    public static void main(String[] args) {
        NLD list= new NLD();
        list.add(22);
        list.add(23);

        list.add(22);
        list.add(28);
        list.add(28);
        list.removeDuplicateFromUnsorted();
        NLD list2= new NLD();
        list2.add(19);
        list2.add(23);
        list2.add(25);
        list2.add(26);
        list2.add(27);
        list2.add(29);
        list2.add(30);
        list.mergeSortedList(list,list2);
        //list.findMiddle();
        ////list.del(26);
        //list.deleteAlternate();
        //NLD nl=list.reverseLinkedList(list);
        list.removeKthNodeFrmEnd(list,1);
    }

}


class Node{
    int data;
    Node next;

    Node(int data){
        this.data=data;
    }
}

class NLD{
    Node head;

    public void deleteAlternate(){
        Node currentNode=head;
        if(currentNode.next.next==null){//if only two nodes
            currentNode.next=null;
        }
        while(currentNode.next!=null){
            currentNode.next=currentNode.next.next;
            currentNode=currentNode.next;
        }
        head=null;
    }

    public void removeKthNodeFrmEnd(NLD list,int k){
        Node node=list.head;
        if(node==null) return;;
        //first move the pointer to the k th postion
        for(int i=0;i<k;i++){
            node=node.next;
            if(node==null) return;
        }

        //then move both pointers together till the end
        Node nodeToDeleted=list.head;
        while(node.next!=null){
            nodeToDeleted=nodeToDeleted.next;
            node=node.next;
        }

        nodeToDeleted.next=nodeToDeleted.next.next;

    }

    public void add(int data){
        Node n=new Node(data);
        if(head==null) {
            head=n;
            return;
        }
        Node currentNode=head;
        while(currentNode.next!=null){
            currentNode=currentNode.next;
        }
        currentNode.next=n;
    }

    public void prepend(int data){
        Node n=new Node(data);
        n.next=head;
        head=n;
    }

   public void del(int data){
        if(head==null) return;
        if(head.data==data){
            head=null;
            return;
        }

        Node currentNode=head; //head is alread compared
        while(currentNode.next !=null){
            if(currentNode.next.data==data){
                currentNode.next=currentNode.next.next;
                return;
            }
            currentNode=currentNode.next;
        }
   }

    public boolean IsCyclic(){
        if(head==null) return false;

        Node sp=head;
        Node fp=head;
        while(fp.next!=null &&  fp.next.next!=null){//note the fast pointer
            sp=sp.next;
            fp=fp.next.next;
            if(sp==fp){
                return true;
            }
        }

        return false;
    }

   public Node findMiddle(){
        if(head==null) return null;

        Node sp=head;
        Node fp=head;
        while(fp.next!=null &&  fp.next.next!=null){//note the fast pointer
            sp=sp.next;
            fp=fp.next.next;
        }

        return sp;
   }

   public NLD reverseLinkedList(NLD list){
        // to reverse linked list we need three pointers
       Node current=list.head;
       Node prev=null; Node next=null;
       //we are going to save current next to next ; change current next ptr in reverse direction to  prev; then move
       // all prev and current ptr
       while(current!=null){
            next=current.next;
            current.next=prev;
            prev=current;
            current=next;
       }
       NLD nld=new NLD();
       nld.head=prev;
       return nld;
   }

    public NLD isPallindrom(NLD list){
        Node n=findMiddle();
        return list;
    }


    public Node mergeSortedList(NLD l1, NLD l2){

        Node n1=l1.head;
        Node n2=l2.head;
        Node n=new Node(0);
        Node tail=n;
        while(true){
            if(n1==null){
                tail.next=n2;
                break;
            }
            if(n2==null){
                tail.next=n1;
                break;
            }
            if(n1.data<=n2.data){
                tail.next=n1;
                n1=n1.next;
            }else{
                tail.next=n2;
                n2=n2.next;

            }
            tail=tail.next;
        }

        return tail.next;
    }


    public void removeDuplicateFromSorted(){
        Node current=head;
        while(true){
            if(current.data==current.next.data){
                current.next=current.next.next;
            }
            if(current.next==null) break;
            current=current.next;
        }
    }

    public void removeDuplicateFromUnsorted(){

        Node dummy=new Node(0);
        dummy.next=head;
        Node ptr1=dummy;
        while(ptr1.next!=null){
            Node ptr2=ptr1.next;
            while(ptr2.next!=null){
                if(ptr1.next.data==ptr2.next.data){
                    ptr1.next=ptr1.next.next;
                }
                ptr2=ptr2.next;
            }
            ptr1=ptr1.next;
        }
    }

    public void swapalternatenodes(){

        Node dummy=new Node(0);
        dummy.next=head;
        Node ptr1=dummy;
        while(ptr1.next!=null && ptr1.next.next!=null){

            Node first=ptr1.next;
            Node temp=ptr1.next.next;
            //ptr1.next=
        }
    }

    //intersection of linked list
    //sort a linked list
    //linked list to balanced tree

    //doubly linked list
}
