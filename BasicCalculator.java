import java.util.*;

class BasicCalculator{
	public static void main(String[] args){
	Scanner sc =new Scanner(System.in);
	System.out.print("Enter the first number: ");
	double number1 =sc.nextDouble();
	System.out.print("Enter the second number: ");
	double number2 =sc.nextDouble();
	double add = number1 +number2;
	double sub= number1-number2;
	double mul= number1*number2;
	double div = number1/number2;

	System.out.print("The addition, subtraction, multiplication, and division value of 2 numbers " +number1 +" and " + number2 + " is " + add + ", " +sub + ", " +mul +" and " +div);
}
}

