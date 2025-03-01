import java.util.*;

class IntOperation{
        public static void main (String[] args){
	Scanner sc =new Scanner(System.in);
	System.out.print("Enter the first number: ");
        int a =sc.nextInt();
	System.out.print("Enter the second number: ");
        int b =sc.nextInt();
	System.out.print("Enter the third number: ");
        int c =sc.nextInt();
        int result1 =a + b *c;
        int result2 =a * b + c;
        int result3 = c + a / b;
	int result4 = a % b + c;

        System.out.print("The results of Int Operations are " + result1 +" , "  + result2 +" , " + result3 +" and "  + result4 );
}
}
