public class Discount{
   public static void main(String[] args){
   int fee=125000;
   int discount=10;
   double discountedamount=(fee*discount)/100;
   double finalfee=fee-discountedamount;
   System.out.println("The discount amount is INR"+discountedamount+"and final discount fee is INR"+finalfee);
   }
   }