public class Q13 {
     int[]arr;
    private int top;
    private int top2;
    public Q13(int n)
    {
        this.arr= new int[n];
        top = -1;
        top2 = n;
    }
    public boolean is_empty()
    {
        if(top==-1&&top2==arr.length)
        {
            return true;
        }
        return false;
    }
    public boolean is_full()
    {
        return(top>=top2-1);
    }
    public void push1(int n) {
        if (is_full()) {
            System.out.println("stack overflow");
            return;
        }
        top = top + 1;
        arr[top] = n;
    }
    public void push2(int n)
    {
        if(is_full())
        {
            System.out.println("stack overflow");
            return;
        }
        top2=top2-1;
        arr[top2]=n;
    }
    public int pop1()
    {
        if(top==-1)
        {
            System.out.println("stack underflow");
            return -1;
        }
        int s=arr[top--];
        return s;
    }
    public int pop2()
    {
        if(top2==arr.length)
        {
            System.out.println("stack underflow");
            return -1;
        }
        int s=arr[top2++];
        return s;
    }
    public void displayfor1()
    {
        for(int i=top;i>=0;i--)
        {
            System.out.print(arr[i]+" ");
        }
    }
    public void displayfor2()
    {
        for(int i=top2;i<=arr.length-1;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }

    public static void main(String[] args) {
        Q13 tt= new Q13(8);
        tt.push1(5);
        tt.push1(6);
        tt.push1(5);
        tt.displayfor1();
        System.out.println();
        System.out.print(tt.pop1());
        System.out.println();
        tt.displayfor1();
        System.out.println();
        tt.push2(8);
        tt.push2(5);
        tt.displayfor2();
    }
}
