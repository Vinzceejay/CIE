import java.util.Scanner;

public class NotLong {
    public static void main(String...args){
        Scanner enter = new Scanner(System.in);
        System.out.println("Please enter your name: ");
        String name = enter.nextLine();
        if (name.equals("6")){
            System.out.println(name.length());
        }
        else
            System.out.println("Too long!!!");
    }
}
