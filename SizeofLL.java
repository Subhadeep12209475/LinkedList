public class SizeofLL{
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

    public void addLast(int data){
        Node newNode = new Node(data);
        size++;
        if(head== null){
            head=tail=newNode;
            return;
        }
        tail.next=newNode;
        tail=newNode;
    // }
    // public void add(int data,int index){
    //     Node newnode = new Node(data);
    //     size++;
    //     int i=0;
    //     Node temp=head;
    //     while(i<index-1){
    //         temp=temp.next;
    //         i++;
    //     }
    //     newnode.next=temp.next;
    //     temp.next=newnode;
    // }


    // public void show(){
        if(head==null){
            System.out.println("LL is empty");
            return;
        }
        Node temp=head;
        while(temp !=null ){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }
    public static void main(String args[]){
        SizeofLL ll= new SizeofLL();
        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(4);
        //ll.add(6,2);
        //ll.show();
        //ll.add(7,3);
        //ll.show();
        System.out.println(ll.size);
    }

}