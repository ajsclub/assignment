import java.util.LinkedList;
import java.util.Queue;

public class Q15 {
    Queue<Integer> q1= new LinkedList<>();
    Queue<Integer> q2= new LinkedList<>();
    public void push(int n)
    {
        q1.add(n);  //push operation
    }
    public int pop()
    {
        while(q1.size()!=1)
        {
            q2.add(q1.remove());
        }
        int y=q1.remove();
        while(!q2.isEmpty())
        {
            q1.add(q2.remove());        //pop operation
        }
        return y;
    }

    public static void main(String[] args) {        //main function
        Q15 stackkk= new Q15();
        stackkk.push(1);
        stackkk.push(45);
        stackkk.push(3);
          System.out.println(stackkk.pop());
        stackkk.push(9);
        System.out.println(stackkk.pop());
    }
}
