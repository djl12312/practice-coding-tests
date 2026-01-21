import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scannr sc = new Scanner(System.in);

        int Age;
        int Sex;

        Age = sc.nextIn();
        Sex = sc.nextIn();

        if (Sex = 0) {
            if (Age >= 19) {
            System.out.println("MAN");
            } else{
                System.out.println("BOY");
            }
        } else if (Sex = 1) {
            if ( Age >= 19 ) {
            System.out.println("WOMAN");
            } else {
                System.out.println("GIRL");
            }
        }
    }
}