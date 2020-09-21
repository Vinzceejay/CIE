public class Multi {
    public static void main(String...args){

        for (int i = 1; i > 0; i *=2){
            System.out.print("\n "+i);
            if (i % 10 == 0)
                System.out.println();
        }
    }
}
