import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int MathA, EngA;
        int MathB, EngB;

        

        MathA = sc.nextInt();
        EngA = sc.nextInt();
        MathB = sc.nextInt();
        EngB = sc.nextInt();

        if ( MathA  > MathB && EngA > EngB ) {

            System.out.print("1");

        } else {
            System.out.print("0");
        }



    }
}