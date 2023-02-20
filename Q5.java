public class Q5 {


 Node head;
    int size = 0;

    class Node {
        int data;
   Node next;

        public Node(int n) {
            this.data = n;
        }
    }

    public void insert_head(int n) {
       Node node = new Node(n);
        node.next = head;
        head = node;
        size++;
    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public int modular_node(int k)
    {
        Node temp=head;
        int val=0;
        int i=1;
        int count=0;
        while(temp.next!=null)
        {
            if(i%k==0)
            {
                count=1;
                val=temp.data;
            }
            i++;
            temp=temp.next;
        }
        if(count==0)
        {
            return -1;
        }
        return val;
    }

    public static void main(String[] args) {
        Q5 n= new Q5();
        n.insert_head(5);
        n.insert_head(6);
        n.insert_head(7);
        n.insert_head(8);
        n.insert_head(9);
      //  n.insert_head(10);
        n.display();
        System.out.println(n.modular_node(6));
    }

}