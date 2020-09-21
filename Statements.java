public class Statements{
    public static void main(String...args){
        double a = Math.abs(7.5);
        double b = Math.floor(7.5);
        double c = Math.abs(0.0);
        double d = Math.ceil(0.0);
        double e = Math.abs(-6.4);
        double f = Math.ceil(-6.4);
        double g = Math.ceil(-Math.abs(-8 + Math.floor(-5.5)));

        System.out.println("the answer is "+ a);
        System.out.println("the answer is "+ b);
        System.out.println("the answer is "+ c);
        System.out.println("the answer is "+ d);
        System.out.println("the answer is "+ e);
        System.out.println("the answer is "+ f);
        System.out.println("the answer is "+ g);
    }
}
