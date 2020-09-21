import java.util.Scanner;

public class MaxMin {
    public static void main(String...args){
        Scanner enter = new Scanner(System.in);
        System.out.print("\t\tComparing three integers");
        System.out.print("\nInput your three int values");
        System.out.print("\n\nEnter for num1: ");
        int a = enter.nextInt();
        System.out.print("\nEnter for num2: ");
        int b = enter.nextInt();
        System.out.print("\nEnter for num3: ");
        int c = enter.nextInt();
        int d = Math.max(a,b);
        int lar = Math.max(d,c);
        int e = Math.min(a,b);
        int sma = Math.min(e,d);
        System.out.print("\n\t\t"+ lar +" is the largest");
        System.out.print("\n\t\t"+ sma +" is the smallest");

    }
}
