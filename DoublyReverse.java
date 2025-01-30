public class DoublyReverse{
    class Node{
        int data;
        Node next;
        Node prev;
        Node(int data){
            this.data=data;
            Node prev=null;
            Node next=null;
        }
    }
    public static Node head;
    public static Node tail;

    public void addLast(int data){
        Node newnode = new Node(data);
        if(head==null){
            head=tail=newnode;
            return;
        }

        tail.next=newnode;
        newnode.prev=tail;
        tail=newnode;

    }
    public void reverse(){
        if(head==null){
            System.out.print("Empty");
        }
        Node curr=head;
        Node prev=null;
        Node next;
        while(curr != null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        head=prev;
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
        DoublyReverse ll = new DoublyReverse();
        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(4);
        ll.addLast(5);
        ll.print();
        ll.reverse();
        ll.print();
    }
    
}