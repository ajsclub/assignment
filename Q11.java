public class Q11 {
   Node head;
    int size=0;
    static class Node{
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

        public boolean hasCycle(Node head) {
            Node fast=head;
            Node slow=head;
            if(head==null)
            {
                return false;
            }
            else{
                while(fast!=null&&fast.next!=null)
                {
                    slow=slow.next;
                    fast=fast.next.next;
                    if(slow==fast)
                    {
                        return true;
                    }
                }
            }
            return false;
        }
    }



