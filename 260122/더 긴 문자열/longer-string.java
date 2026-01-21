import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.

        Scanner sc = new Scanner(System.in);

        String a, b;

        a = sc.next();
        b = sc.next();
        
        int lengthA = a.length();
        int lengthB = b.length();



        if (lengthA > lengthB) {
            System.out.println(a + " " +lengthA);
        } else if (lengthA < lengthB ) {
            System.out.println(b + " " + lengthB);
        } else if (a.length() == b.length()) {
            System.out.print("same");
        }
    }
}