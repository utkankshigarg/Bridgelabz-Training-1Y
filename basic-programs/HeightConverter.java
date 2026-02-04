import java.util.Scanner;
public class HeightConverter{
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	System.out.print("Height in cm");
	double Heightincm=sc.nextDouble();
	double Heightininches=Heightincm*2.54;
	double Heightinfeet=Heightininches*12;
	System.out.println("Your Height in cm is "+Heightincm+"while in feet is "+Heightinfeet+"and inches is"+Heightininches);
	}
	}