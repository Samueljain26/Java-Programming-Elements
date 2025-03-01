import java.util.*;

class AreaOfTriangle{
        public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the base of triangle: ");
        double base = sc.nextDouble();
	System.out.print("Enter the height of triangle: ");
        double height = sc.nextDouble();

        double area = 0.5*base*height;
        double inch = area/2.54;
        System.out.print(" The Area of the triangle in sq inch is " + inch + " and sq cm is " + area ) ;
}
}
