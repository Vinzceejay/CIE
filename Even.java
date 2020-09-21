import java.util.Scanner;

public class Even {
    public static void main(String...args){
        Scanner enter = new Scanner(System.in);
        System.out.println("\nInput the first three numbers: ");
        int a = enter.nextInt();
        int b = enter.nextInt();
        int c = enter.nextInt();
        int em = isEven(a,b,c);
    }
    public static int isEven(int a, int b, int c){
        int d = a + b + c;
        if ((d % 2) == 1){
            System.out.println("\n\t\tFALSE!");
    } else if ((d % 2) == 0) {
        System.out.println("\n\t\tTRUE!");
    }
        return d;
    }
}
