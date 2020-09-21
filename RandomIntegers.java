import java.security.SecureRandom;
import java.util.Random;

public class RandomIntegers {
    public static void main(String...args){
        SecureRandom randomNumbers = new SecureRandom();
        Random random = new Random();
        for (int counter = 1; counter<= 20; counter++){
            int face = 1 + random.nextInt(6);
            System.out.printf("%d  ", face);
            if (counter % 5 == 0)
                System.out.println();
        }
    }
}
