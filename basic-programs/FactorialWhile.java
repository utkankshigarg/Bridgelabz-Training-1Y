import java.util.Scanner;

public class FactorialWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        if (n < 0) {
            System.out.println("Factorial not defined");
            return;
        }
        int fact = 1;
        int i = n;
        while (i > 0) {
            fact*=i;
            i--;
        }
       System.out.println("Factorial = " + fact);
    }
}