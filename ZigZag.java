public class ZigZag{
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            Node next=null;
        }
    }
    public static Node head;
    public static Node tail;

    public void addLast(int data){
        Node newnode=new Node(data);
        if(head==null){
            head=tail=newnode;
            return;
        }
        tail.next=newnode;
        tail=tail.next;
    }
    public Node findmid(Node head){
        Node slow=head;
        Node fast=head.next;
        while(fast != null && fast.next != null){
            fast=fast.next.next;
            slow=slow.next;
        }
        return slow;
    }

    public void zigzag(){
        Node mid=findmid(head);
        Node prev=null;
        Node curr=mid;
        Node next;
        while(curr != null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        Node Righthead=prev;
        Node Lefthead= head;
        Node RightL , LeftL;

        while(Righthead != null  && Lefthead != null){
            LeftL=Lefthead.next;
            Lefthead.next=Righthead;
            RightL=Righthead.next;
            Righthead.next=LeftL;

            Lefthead=LeftL;
            Righthead=RightL;
        }

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
        ZigZag ll = new ZigZag();
        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(4);
        ll.addLast(5);
        ll.addLast(6);
        ll.print();
        ll.zigzag();
        ll.print();


    }
}