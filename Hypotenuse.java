import java.util.Scanner;

public class Hypotenuse {
        public static void main(String...args){
            Scanner enter = new Scanner(System.in);
            System.out.print("\nEnter for side1: ");
            double a = enter.nextDouble();
            System.out.print("\nEnter for side2: ");
            double b = enter.nextDouble();
            double fi = hypotenus(a,b);
            System.out.print("\n\t\tThe numbers you chose for the both sides are:  a = " + a + " and b is " + b );
            System.out.print("\n\t\tThe final calculation is: "+fi );
        }
    public static double hypotenus(double a, double b) {
        double c;
        double d;
        c = Math.pow(a, 2) + Math.pow(b, 2);
        d = Math.sqrt(c);
        return d;
    }
}


