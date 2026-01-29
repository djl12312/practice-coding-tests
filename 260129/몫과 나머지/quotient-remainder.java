import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        a = sc.nextInt();
        int b;
        b = sc.nextInt();

        int divide = a / b;
        int after = a % b;

        System.out.println(divide + "..." + after);
    }
}