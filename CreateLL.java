public class CreateLL{
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

    public int search(int key){
        Node temp=head;
        int i=0;
        while(temp != null){
            if(temp.data==key){
                return i;
            }
            temp=temp.next;
            i++;
        }
        return -1;
    }
    public int healper(Node head ,int key){
        if(head==null){
            return -1;
        }
        if(head.data==key){
            return 0;
        }
        int index= healper(head.next,key);

        if(index==-1){
            return -1;
        }
        return index+1;
    }
    public int recSearch(int key){
        return healper (head,key);
    }
    public static void main(String args[]){
        CreateLL ll = new CreateLL();
        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(4);
        ll.addLast(5);
        System.out.println (ll.search(3));
        System.out.println (ll.recSearch(3));









        //Node head=null;
        // for(int i=1;i<=5;i++){
        //     Node newnode=new Node(i);
        //     if(head==null){
        //         head=newnode;
        //     }else{
        //         Node temp=head;
        //         while(temp.next != null){
        //             temp=temp.next;
        //         }
        //         temp.next=newnode;
        //     }
        // }

        // Node temp= head;
        // while(temp != null){
        //     System.out.print(temp.data+" ");
        //     temp=temp.next;
        // }
        // System.out.println();

        // System.out.print(search(3));
    }
}