import java.util.Scanner;

public class Minimum {
    public static void main(String...args){
        Scanner enter = new Scanner(System.in);
        System.out.println("\nEnter the three integer \nnumbers of your choice: ");
        int a = enter.nextInt();
        int b = enter.nextInt();
        int c = enter.nextInt();
        int mm = minimum3(a,b,c);
    }
       public static int minimum3(int a, int b, int c){
         int d = Math.min(a, Math.min(b, c));
           System.out.println("The minimum value is: "+d);
        return d;
       }
}

