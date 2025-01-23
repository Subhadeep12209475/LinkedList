public class Remove{
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
     public static int size;

    public void addlast(int data){
        Node newNode= new Node(data);
        size++;
        if(head==null){
            head=tail=newNode;
            return;
        }
        tail.next=newNode;
        tail=newNode;
    }
    public void show(){
        if(head==null){
            System.out.print("Empty");
            return;
        }
        Node temp=head;
    System.out.println("elements : ");
        while(temp != null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }
    public int removeFirst(){
        if(head==null){
            return Integer.MIN_VALUE;
        }
        int val=head.data;
        head=head.next;
        size--;
        return val;
    }
    public int removeLast(){
        if(head==null){
            return Integer.MIN_VALUE;
        }
        else if(size==1){
            int val=head.data;
            head=tail=null;
            size=0;
            return val;
        }else{
        Node prev = head;
        for(int i=0;i<size-2;i++){
            prev=prev.next;
        }
        int val=prev.data;
        prev.next=null;
        tail=prev;
        size--;
        return val;
        }
    }
    public static void main(String args[]){
        Remove ll = new Remove();
        ll.addlast(2);
        ll.addlast(3);
        ll.addlast(4);
        ll.addlast(5);
        System.out.println(ll.size);
        ll.show();
        ll.removeFirst();
        System.out.println(ll.size);
        ll.show();
        ll.removeLast();
        System.out.println(ll.size);
        ll.show();
    }
}