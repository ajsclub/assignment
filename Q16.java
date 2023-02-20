
import java.util.Stack;
import java.util.Scanner;
public class Q16 {
    static boolean check(Stack<Integer> s)
    {
        if(s.isEmpty())
        {
            return false;
        }
        while(!s.isEmpty())
        {
            int k=s.pop();
            int m=s.pop();
            if(Math.abs(k-m)!=1)
            {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Stack<Integer> stack= new Stack<>();
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter number of elements you want in the stack");
        int n= sc.nextInt();
        for(int i=0;i<n;i++)
        {
            stack.push(sc.nextInt());
        }
        if(n%2!=0)
        {
            stack.pop();
        }
        System.out.println(check(stack));

    }

}
