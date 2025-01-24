public class RemoveFromLast{
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
    public void remove(int n){
        int size=0;
        Node temp=head;
        while(temp != null){
            temp=temp.next;
            size++;
        }
        if(size == n){
            head=head.next; //remove 1st
            return;
        }

         int i=1;
         int index= size-n;
        Node prev = head;
         while(i< index){
            prev=prev.next;
            i++;
         }
         prev.next=prev.next.next;
         return;

    }
    public int find(int key){
        int size=0;
        int index =0;
        Node temp=head;
        while(temp != null){
            temp=temp.next;
            size++;
        }
        Node prev = head;
        int i=1;
        while(prev != null){
            if(prev.data==key){
                index= size - i +1;
            }
            prev=prev.next;
            i++;
        }
        return index;

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
        RemoveFromLast ll = new RemoveFromLast();
        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(4);
        ll.addLast(5);
        ll.show();
        ll.remove(3);
        ll.show();
        ll.find(4);
        System.out.println(ll.find(4));


    }
}