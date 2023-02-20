

public class Q9 {
    Node head;
    int size=0;
    class Node{
        int data;
        Node next;
        Node(int d)
        {
            this.data=d;
        }
    }
    public void insert_head(int n)
    {
        Node node= new Node(n);
        node.next=head;
        head=node;
        size++;
    }
    public void display()
    {
        Node temp=head;
        while(temp!=null)
        {
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("null");
    }
    public Node Reverse(Node head, int k) {
        int count=1;
        int Swap=0;
        Node temp=head;
        while(temp!=null) {
            temp=temp.next;
            count++;
        }
        Swap=count/2;
        Node dummyHead=new Node(-1);
        Node start=dummyHead;
        Node end=dummyHead;

        Node currStart=head;
        Node currEnd=head;

        while(Swap>0) {

            for(int i=0;i<k-1 && currEnd!=null;i++) {

                currEnd=currEnd.next;
            }
            if(currEnd!=null) {
                Node nxt=currEnd.next;
                currEnd.next=null;

                Node rev =  reverse(currStart);

                start.next=rev;

                while(end.next!= null) {
                    end=end.next;
                }

                end.next=nxt;
                start=end;
                currStart=end.next;
                currEnd=end.next;

            }

            Swap--;
        }
        return dummyHead.next;

    }

    public Node reverse(Node head) {
        Node prev=null;
        Node next;
        while(head!=null) {
            next=head.next;
            head.next=prev;
            prev=head;
            head=next;
        }
        System.out.println(prev);
        return prev;
    }
}
