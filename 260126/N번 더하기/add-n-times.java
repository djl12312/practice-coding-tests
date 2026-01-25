import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.

        Scanner sc = new Scanner(System.in);

        int A, N;

        A = sc.nextInt();
        N = sc.nextInt();

        for (int i = 1; i <= N; i++)
        {
            A += N;
            System.out.println(A);
        }
    }
}