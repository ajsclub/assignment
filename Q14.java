import java.util.Stack;

public class Q14 {
    static class Queue
        {
            static Stack<Integer> s1 = new Stack<Integer>();
            static Stack<Integer> s2 = new Stack<Integer>();

            static void enQueue(int x)
            {
                while (!s1.isEmpty())
                {
                    s2.push(s1.pop());
                    //s1.pop();
                }

                // Push item into s1
                s1.push(x);
                while (!s2.isEmpty())
                {
                    s1.push(s2.pop());
                    //s2.pop();
                }
            }

            // Dequueue an item from the quueue
            static int deQueue()
            {
                // if first stack is empty
                if (s1.isEmpty())
                {
                    System.out.println("Q is Empty");
                    System.exit(0);
                }

                // Return top of s1
                int x = s1.peek();
                s1.pop();
                return x;
            }
        }

        // Driver code
        public static void main(String[] args)
        {
            Queue qu = new Queue();
            qu.enQueue(1);
            qu.enQueue(8);
            qu.enQueue(5);

            System.out.println(qu.deQueue());
            System.out.println(qu.deQueue());
            System.out.println(qu.deQueue());
        }
    }

