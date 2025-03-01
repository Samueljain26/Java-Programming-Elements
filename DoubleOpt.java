import java.util.*;

class DoubleOpt{
        public static void main (String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the first number: ");
        double a =sc.nextDouble();
        System.out.print("Enter the second number: ");
        double b =sc.nextDouble();
        System.out.print("Enter the third number: ");
        double c =sc.nextDouble();
        double result1 =a + b *c;
        double result2 =a * b + c;
        double result3 = c + a / b;
        double result4 = a % b + c;

        System.out.print("The results of Double Operations are " + result1 +" , "  + result2 +" , " + result3 +" and "  + result4 );
}
}
