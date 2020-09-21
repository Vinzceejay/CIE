import java.util.Scanner;

public class Circle {
    public static void main(String...args){
        Scanner enter = new Scanner(System.in);
        System.out.print("\ninput the radius of \nthe required circle: ");
        int r = enter.nextInt();
        int b = circleArea(r);
        System.out.println("\n\t\tThe area of the circle is " + b);
    }
    public static int circleArea(int r){
        int a = 22/7 * (int)Math.pow(r,2);
        return a;
    }
}
