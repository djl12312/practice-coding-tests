import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.

        Scanner sc = new Scanner(System.in);

        int A, B;

        A = sc.nextInt();
        B = sc.nextInt();

        int total = A + B;
        double average = (A + B)/2.0;


        System.out.println(total + " " + average);
    }
}