public class Addlast{
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
        public static Node head;
        public static Node tail;

    public void addFirst(int data){
        Node newnode=new Node(data);
        if(head==null){
            head=tail=newnode;
            return;
        }
        newnode.next=head;
        head=newnode;
    }
    public void addlast(int data){
        Node newnode= new Node(data);
        if(head==null){
            head=tail=newnode;
            return;
        }
        tail.next=newnode;
        tail=newnode;
    }
    public void print(){
        if(head==null){
            System.out.println("Linkedlist is empty");
            return;
        }
        Node temp=head;
        while(temp != null){
            System.out.print(temp.data+" -> ");
            temp=temp.next;
        }
        System.out.println("null");
    }
    public static void main(String args[]){
        Addlast ll = new Addlast();
        ll.print();
        ll.addFirst(10);
        ll.print();
        ll.addFirst(20);
        ll.print();
        ll.addlast(30);
        ll.print();
        ll.addlast(40);
        ll.print();
    }
}