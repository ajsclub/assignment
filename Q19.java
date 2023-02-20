import java.util.*;
public class Q19 {
    static Queue<Integer> rev(  Queue<Integer> w,int k)
    {
      int z=k;
      Stack<Integer> hey= new Stack<>();
      Queue<Integer> hey2= new LinkedList<>();
      while(k>0)
      {
          hey.add(w.remove());
          k--;
      }
      while(z>0)
      {
          hey2.add(hey.pop());
          z--;
      }
      while (!w.isEmpty())
      {
          hey2.add(w.remove());
      }
      return hey2;
    }
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
		System.out.print("enter the k :");
        Scanner s = new Scanner(System.in);
        q.add(6);
        q.add(7);
        q.add(12);
        q.add(45);
        q.add(76);
        q.add(7);
        q.add(78);
        int k= s.nextInt();
        System.out.println(q);
       q=rev(q,k);
        System.out.println(q);
    }
}
