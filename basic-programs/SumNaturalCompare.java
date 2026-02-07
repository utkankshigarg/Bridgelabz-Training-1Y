import java.util.Scanner;

public class SumNaturalCompare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        if (n <= 0) {
        System.out.println("Not a natural number");
        return;
        }
        int sumFormula = n*(n + 1)/2;
        int sumWhile = 0, i = 1;
        while (i <= n) {
        sumWhile += i;
        i++;
        }
        System.out.println("Sum using formula: " + sumFormula);
        System.out.println("Sum using while loop: " + sumWhile);
        if (sumFormula == sumWhile)
        System.out.println("Both results are correct");
        else
            System.out.println("Results are different");
    }
}