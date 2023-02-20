import java.util.Arrays;
import java.util.Scanner;
public class Q3 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the size of the array you want");
        int n =sc.nextInt();
        int[]a= new int[n];
        System.out.println("Enter array elemnts");
        for(int x=0;x<n;x++)
        {
            a[x]=sc.nextInt();
        }
        int m=a.length-1;
        for(int i=1;i<a.length;i=i+2)
        {
            int temp=a[m];
            for(int j=a.length-1;j>i;j--)
            {
               a[j]=a[j-1];
            }
            a[i]=temp;

        }
        System.out.println(Arrays.toString(a));
    }
}
