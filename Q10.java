import java.util.*;
public class Q10 {

    Node head;
    int size=0;
    class Node{
        int data;
        Node next;
        public Node(int n)
        {
            this.data=n;
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

    public Node getInsert(Node headA, Node headB) {
        Node temp1=headA;
        Node temp2=headB;
        Set<Node> h= new HashSet<>();
        while(temp1!=null)
        {
            h.add(temp1);
            temp1=temp1.next;
        }
        while(temp2!=null)
        {
            if(h.contains(temp2))
            {
                return temp2;
            }
            temp2=temp2.next;
        }
        return null;
    }
}
