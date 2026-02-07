import java.util.Scanner;

public class StudentGrade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Physics: ");
        int p = sc.nextInt();
        System.out.print("Chemistry: ");
        int c = sc.nextInt();
        System.out.print("Maths: ");
        int m = sc.nextInt();

        double avg = (p + c + m) / 3.0;

        System.out.println("Average = " + avg);

        if (avg >= 80)
            System.out.println("Grade A");
        else if (avg >= 70)
            System.out.println("Grade B");
        else if (avg >= 60)
            System.out.println("Grade C");
        else if (avg >= 50)
            System.out.println("Grade D");
        else
            System.out.println("Fail");
    }
}