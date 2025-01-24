public class FindCycle{
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static Node head;
    public static Node tail;

    public static boolean cycle(){
        Node fast=head;
        Node slow=head;
        while(fast != null && fast.next != null){
            fast=fast.next.next;
            slow=slow.next;
            if(fast==slow){
            return true;
        }
        }
        return false;
    }
    public static void main(String args[]){
    head = new Node(1);
    head.next = new Node(2);
    head.next.next = new Node(3);
    head.next.next.next=new Node(4);
    head.next.next.next.next=head;

    System.out.println(cycle());

    }
}