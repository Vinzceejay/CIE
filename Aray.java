import java.util.Arrays;

public class Aray {
    public static void main(String...args){
        int[][] numbers = new int[3][3];
        numbers[0][1]=4;
        numbers[1][2]=5;
        System.out.println(Arrays.deepToString(numbers));
    }
}
