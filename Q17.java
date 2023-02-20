import java.util.Scanner;
public class Q17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of thr array you want");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter array elements");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter window size");
        int w = sc.nextInt();
        int max = 0;
        for (int i = 0; i < n - w + 1; i++) {
            max = arr[i];
            for (int j = i + 1; j < i + w; j++) {
                if (arr[j] > max) {
                    max = arr[j];
                }
            }
            System.out.println(max);

        }

    }

}

