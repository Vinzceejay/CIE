import java.util.Scanner;
public class Input {
    public static void main(String...args){

        Scanner input = new Scanner(System.in);
        System.out.print("The first developer\n\n");
        System.out.println("please enter your name: ");
        String name = input.nextLine();
        System.out.println("please enter your department: ");
        String dept = input.nextLine();
        System.out.println("please enter your age: ");
        int age = input.nextInt();
        System.out.printf("%nYour name is:  %s%n " ,name);
        System.out.printf("%nYour age is:  %d%n " ,age);
        System.out.printf("%nAnd your department is:  %s%n " ,dept);

    }
}