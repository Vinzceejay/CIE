import java.util.Scanner;
public class Exercise5 {
    public static void main(String...args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the radius of the circle: ");
        int r = input.nextInt();
        int d = 2 * r;
        double c = 2 * 3.1412 * r;
        double a = 3.1412 * r * r;
        System.out.println("the calculations for the circle are \n");
        System.out.println("the diameter of a circle is: " +d );
        System.out.println("the circumference of a circle is: " +c );
        System.out.println("the area of a circle is: " +a );
    }
}
