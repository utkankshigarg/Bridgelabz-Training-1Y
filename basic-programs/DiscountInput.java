import java.util.Scanner;
public class DiscountInput{
       public static void main(String[] args){
	   Scanner sc = new Scanner(System.in);
	   System.out.print("Fee");
	   int fee=sc.nextInt();
	   System.out.print("Discount");
	   Double Discount=sc.nextDouble();
	   Double discountamount=(fee*Discount)/100;
	   Double finalfee=fee-discountamount;
	   System.out.println("The discount amount is INR"+discountamount+"and final discounted fee in INR"+finalfee);
	   }
	   }