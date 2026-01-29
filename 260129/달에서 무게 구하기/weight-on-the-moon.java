public class Main {
    public static void main(String[] args) {
        int a = 13; double b = 0.165;
        System.out.printf(a + " * " + ("%.3f",b) + " = " + ("%.5f", (a * b)));
    }
}