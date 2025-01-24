public class ReverseLL{
    static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static Node head;
    public static Node tail;

    public void addLast(int data){
        Node newnode=new Node(data);
        if(head==null){
            head=tail=newnode;
        }
        tail.next=newnode;
        tail=newnode;

    }
    public void Reverse(){
        Node prev=null;
        Node curr=head;
        Node next;

        while( curr != null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        head=prev;
    }
    public void show(){
        Node temp=head;
        while(temp != null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }
    public static void main(String args[]){
        ReverseLL ll = new ReverseLL();
        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(4);
        ll.addLast(5);
        ll.show();
        ll.Reverse();
        ll.show();
}
}