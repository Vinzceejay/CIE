import java.util.Scanner;

public class TestDate {
    public static void main(String... args) {
        Scanner enter = new Scanner(System.in);

        System.out.println("What is today's date \nEnter the date below ");
        System.out.print("\n\nDay what are we in: ");
        int day = enter.nextInt();
        System.out.print("Number of the particular month: ");
        int month = enter.nextInt();
        System.out.print("What year we in: ");
        int year = enter.nextInt();

        Date travel = new Date(day,month,year);
        travel.displayDate(day, month, year);
        System.out.print("Day " + day);
        System.out.print("\nWe are in the month of " + month);
        System.out.print("\nYear " + year);
        System.out.print("\n\n\t\tloading...........");
        System.out.print("\nToday's date is " + travel.getDay() + "th"+ "/" + travel.getMonth()+ "/" + travel.getYear());
    }
    }