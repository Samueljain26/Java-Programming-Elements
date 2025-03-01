import java.util.*;

class HeightConversion{
        public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the height in cm: ");
        double cm = sc.nextDouble();;
        double inch = cm/2.54;
	double feet = inch/12;
        System.out.print(" Your Height in cm is " + cm + " cm while in feet is " + feet + " feet and inches is " + inch + " inch") ;
}
}

