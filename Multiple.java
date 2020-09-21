import java.util.Scanner;
public class Multiple {
    public static void main(String... args) {
        Scanner enter = new Scanner(System.in);
        System.out.print("\nEnter the first int number: ");
        int x = enter.nextInt();
        System.out.print("\nEnter the second int number: ");
        int y = enter.nextInt();
        boolean multiple = isMultiple(x, y);
        if(multiple = true){
            System.out.print("\n\t"+x+" Is a multiple of "+multiple);
        }
        else{
            System.out.print("\n\t"+y+" Is not a multiple of "+x);
        }
    }

    public static boolean isMultiple(int x, int y) {
       int remainder = x % y;
       boolean multiple;
       if( remainder != 0){
           multiple = true;
       }
       else{
           multiple = false;
       }
        return multiple;
    }
}

