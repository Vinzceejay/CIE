public class SqaCube {
    public static void main(String...args){
        int number = 0;
        int nums;
        int Square;
        int cube;
        System.out.print("\tNumber\t\t10*N\t\t100*N\t\t1000*N");
        while(number <= 4){
            number++;
            nums = number * 10;
            Square = number * 100;
            cube = number * 1000;
            System.out.print("\n\t\t" +number +"\t\t"+ nums + "\t\t\t" +Square +"\t\t\t" +cube);
        }
    }
}
