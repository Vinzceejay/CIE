import java.util.Scanner;
public class SoftwareDeveloperTest {
    public static void main(String...args){
        String id;
        String dept;
        char gender;
        int age;
        Scanner enter = new Scanner(System.in);


        System.out.print("Enter your name: ");
        id = enter.nextLine();
        System.out.print("Enter your department: ");
        dept = enter.nextLine();
        System.out.print("What your gender: ");
        gender = enter.nextLine().charAt(0);
        System.out.print("Enter your age: ");
        age = enter.nextInt();
        SoftwareDeveloper FirstDeveloper = new SoftwareDeveloper(id, dept, gender, age);

        enter.nextLine();
        System.out.print("Enter your name: ");
        id = enter.nextLine();
        System.out.print("Enter your department: ");
        dept = enter.nextLine();
        System.out.print("What your gender: ");
        gender = enter.next().charAt(0);
        System.out.print("Enter your age: ");
        age = enter.nextInt();
        SoftwareDeveloper SecondDeveloper = new SoftwareDeveloper(id,dept,gender,age);

        enter.nextLine();
        System.out.print("Enter your name: ");
        id = enter.nextLine();
        System.out.print("Enter your department: ");
        dept = enter.nextLine();
        System.out.print("What your gender: ");
        gender = enter.next().charAt(0);
        System.out.print("Enter your age: ");
        age = enter.nextInt();
        SoftwareDeveloper ThirdDeveloper = new SoftwareDeveloper(id,dept,gender,age);


        System.out.println("YOUR FULL DETAILS ARE \n");
        System.out.printf("FirstDeveloper %n Id: %s%n Dept:%s%n Gender: %c%n Age: %d%n%n " ,FirstDeveloper.getId(),FirstDeveloper.getDept(),FirstDeveloper.getGender(),FirstDeveloper.getAge());
        System.out.printf("SecondDeveloper %n Id: %s%n Dept:%s%n Gender: %c%n Age: %d%n%n " ,SecondDeveloper.getId(),SecondDeveloper.getDept(),SecondDeveloper.getGender(),SecondDeveloper.getAge());
        System.out.printf("ThirdDeveloper %n Id: %s%n Dept:%s%n Gender: %c%n Age: %d%n%n " ,ThirdDeveloper.getId(),ThirdDeveloper.getDept(),ThirdDeveloper.getGender(),ThirdDeveloper.getAge());

    }

}
