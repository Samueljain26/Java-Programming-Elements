import java.util.*;

class DistanceConversion{
        public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the distance in km: ");
	double km = sc.nextDouble();
	double mile = km*1.6;
	System.out.print(" The total miles is " + mile + " mile for the given " + km + " km") ;
}
}

