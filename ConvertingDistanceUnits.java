import java.util.*;

class ConvertingDistanceUnits{
        public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the distance in ft: ");
        double feet = sc.nextDouble();;
        double yard = feet/3;
        double mile = yard/1760;
        System.out.print(" The distance in yards is " + yard + " while the distance in miles is " + mile) ;
}
}
