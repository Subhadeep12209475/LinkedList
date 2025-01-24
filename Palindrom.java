Public class Palindrom{
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
    public int findmid(Node head){
        Node slow=head;
        Node fast=head;
        while(fast == null || fast.next==null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    public boolean find palindrom(){
        if(head==null || head.next== null){    // find mid
            return true;
        }
        int mid=findmid(head);

        Node prev=null;      //revese in 2nd half 
        Node curr=mid;
        Node next;

        while(curr != null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;

        }

        Node Left=head;
        Node Right= head;

        while( right != null){
            if( Left.data != Right.data){
                return false;
            }
            left=left.next;
            right=right.next;
        }
        return true;
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
        Palindrom ll=new Palindrom();
        ll.addLast(1);
        ll.addLast(1);
        ll.addLast(1);
        ll.addLast(1);
        ll.addLast(1);
    }
}