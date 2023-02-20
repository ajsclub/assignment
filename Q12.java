import java.util.Scanner;
public class Q12 {
    static String newStr(String s)
    {
        char[]b=s.toCharArray();
        for(int i=0;i<b.length/2;i++)
        {
            if(b[i]!=b[b.length-i-1]){
                return "no";
            }
        }
        return "yes";
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string for which you want to check");
        String s=sc.nextLine();
        System.out.println(newStr(s));

    }
}
