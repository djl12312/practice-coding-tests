import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;
    

        n = sc.nextInt();
        
        if ( n % 3 == 0 && n % 2 == 1 ) {

            System.out.print("true");

        } else if ( n % 5 && 0 || n % 2 == 0) {
            System.out.print("false");
        }

    }
}