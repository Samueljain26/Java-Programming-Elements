import java.util.*;

class CalculatingDiscountForUser{
        public static void main (String[] args){
	Scanner sc = new Scanner(System.in);
 	System.out.print("Enter the fees: ");
        double fees =sc.nextDouble();
	System.out.print("Enter the Discount Percentage: ");
        double discountPercent =sc.nextDouble();
        double discount = (fees*discountPercent)/100;
        double discountedFees = fees-discount;


        System.out.print("The discount amount is INR " + discount + " and final discounted fee is INR " +discountedFees);
}
}
