public class DoublyLL{
    public class Node{
        int data;
        Node next;
        Node prev;
        Node(int data){
            this.data=data;
            Node next=null;
            Node prev=null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;

    public void addFirst(int data){
        Node newNode=new Node(data);
        size++;
        if(head==null){
            head=tail=newNode;
            return;
        }
        newNode.next=head;
        head.prev=newNode;
        head=newNode;
    }
    public int removeFirst(){
        if(head==null){
            return Integer.MIN_VALUE;
        }
        if(head.next==null){
            head=tail=null;
            size--;
        }
        int val=head.data;
        head=head.next;
        head.prev=null;
        size--;
        return val;
    }
    public void removeLast(){
        if(head==null){
            System.out.print("EMpty");
        }
        if(head.next==null){
            head=tail=null;
            size--;
        }
        // Node temp=head;
        // for(int i=0;i<size-2;i++){
        //     temp=temp.next;
        // }
        // int val=temp.data;
        // temp.next=null;
        // tail=temp;
        // size--;
        // return val;

        tail=tail.prev;
        tail.next=null;
    }
    public void print(){
        Node temp=head;
        while(temp != null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }
    public static void main(String args[]){
        DoublyLL ll=  new DoublyLL();
        ll.addFirst(5);
        ll.addFirst(4);
        ll.addFirst(3);
        ll.addFirst(2);
        ll.addFirst(1);
        ll.print();
        //ll.removeFirst();
        ll.removeLast();
         ll.print();







    }
}