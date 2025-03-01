import java.util.*;

class SideOfSquare{
        public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the perimeter of square: ");
        int perimeter = sc.nextInt();;
        int side = perimeter/4;
        System.out.print(" The length of the side is " + side + " whose perimeter is " + perimeter) ;
}
}
