import java.util.*;
public class Comparison {
    public static void main(String...args){
        Scanner enter = new Scanner(System.in);
        System.out.print("How many tyres do your vehicle have: ");
        int car = enter.nextInt();
        if(car==4){
          System.out.print("You have a car");
        }
        else if (car==3){
            System.out.print("You have a tricycle");
        }
        else if (car==2){
            System.out.print("You have a bicycle");
        }
        else if (car==1){
            System.out.print("you have a cart");
        }
        else {
            System.out.print("please input again!!! ");
        }
    }
}




