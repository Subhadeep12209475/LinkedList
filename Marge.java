import java.util.*;
public class Marge{
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
    public Node margesort(Node head){
        if(head== null || head.next==null){
            return head;
        }
        Node mid=findmid(head);
        Node rightHead=mid.next;
        mid.next=null;
        Node left=margesort(head);
        Node right=margesort(rightHead);
        return marge(left,right);

    }
    public Node marge(Node left,Node right){
        Node newLL= new Node(-1);
        Node temp=newLL;
    while(left != null && right != null){
        if(left.data <= right.data){
            temp.next=left;
            left=left.next;
            temp=temp.next;
        }else{
            temp.next=right;
            right=right.next;
            temp=temp.next;
        }
    }
    while(left != null){
        temp.next=left;
            left=left.next;
            temp=temp.next;
    }
    while(right != null){
        temp.next=right;
        right=right.next;
        temp=temp.next;
    }
    return newLL.next;
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
        Marge ll=new Marge();
        ll.addLast(2);
        ll.addLast(5);
        ll.addLast(1);
        ll.addLast(4);
        ll.print();
        ll.head=ll.margesort(ll.head);
        ll.print();

    }
}