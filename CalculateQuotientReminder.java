import java.util.*;

class CalculateQuotientReminder{
        public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int number1 = sc.nextInt();
        System.out.print("Enter the second number: ");
        int number2 = sc.nextInt();
        int quotient = number1/number2;
        int remainder = number1%number2;
        System.out.print("The Quotient is " + quotient + " and Reminder is " + remainder + " of two numbers " + number1 + " and " + number2);
}
}
