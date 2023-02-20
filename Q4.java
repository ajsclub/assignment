public class Q4 {
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

    public int root()
    {
       Node temp=head;
       int n=0;
       while(temp!=null)
       {
           n++;
           temp=temp.next;
       }
       temp=head;
       double x=Math.sqrt((double)n);
       int y=(int)x;
       int i=1;
      while(i<x)
       {
           temp=temp.next;
           i++;

       }
      return temp.data;

    }
}
