import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

     int n;
        
        
        n = sc.nextInt();
        
        
        if(n < 0)
            {System.out.println("ice");
            } else if (n >= 0 )
            System.out.println("water");
    }
}
