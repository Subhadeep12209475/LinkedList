public class Basic{
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
        public static Node head;
        public static Node tail;
        
        }
        public void addNode(int data){
            Node newNode = new Node(data);
            newNode.next=head;
            head=newNode;

    }
    public static Node head;
    public static Node tail;
    public static void main(String args[]){
        Basic ll = new Basic();
        ll.addNode(10);
        ll.addNode(20);
    }
}