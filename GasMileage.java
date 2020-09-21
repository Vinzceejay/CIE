import java.util.Scanner;

public class GasMileage {
    public static void main(String...args){
        Scanner enter = new Scanner(System.in);
        int miles = 0;
        int gallons = 0;
        int gallonCounter = 0;
        double totalMPG = 0.0;

        System.out.print("Enter miles(-1 to quit): ");
        miles = enter.nextInt();
        while(miles != -1){
            gallons = gallons + miles;
            gallonCounter = gallonCounter + 1;

            System.out.print("Enter miles(-1 to quit):  ");
            miles = enter.nextInt();
            System.out.print("Enter gallon(-1 to quit):  ");
            gallons = enter.nextInt();
            }
        if (miles !=0) {
            totalMPG = (double) miles / gallons;
            System.out.print(" " + gallonCounter+ gallons);
            System.out.print(""+totalMPG);
        }
        else
            System.out.println("no miles were entered");
        }

    }
