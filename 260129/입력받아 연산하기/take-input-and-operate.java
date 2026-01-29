import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        a = sc.nextInt();
        int b;
        b = sc.nextInt();

        int longer = a + 87;
        int divide = b % 10;

        System.out.println(longer);
        System.out.println(divide);
    }
}