import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number");
        int a =scanner.nextInt();
        System.out.println(a + " Enter the first number");
        System.out.println("Enter the next number");
        int b = scanner.nextInt();
        int c = a + b;
        System.out.println("Solution: " + c);
    }
}
