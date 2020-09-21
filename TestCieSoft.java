public class TestCieSoft {
    public static void main(String... args) {
        CieSoft Developer1 = new CieSoft("Veenz", 'M', 23);
        CieSoft Developer2 = new CieSoft("Marvins", 'M', 25);
        CieSoft Developer3 = new CieSoft("Bundu", 'M', 23);
        CieSoft Developer4 = new CieSoft("Akudo", 'F', 25);
        CieSoft Developer5 = new CieSoft("Calvin", 'M', 23);
        CieSoft Developer6 = new CieSoft("Pascal", 'F', 25);

        System.out.println("the class of people involved in software development\n");

        System.out.printf("Developer 1%n Name: %s%n Gender: %c%n Age: %d%n%n School:%s%n " , Developer1.getName(), Developer1.getGender(), Developer1.getAge(),CieSoft.school);
        System.out.printf("Developer 2%n Name: %s%n Gender: %c%n Age: %d%n%n School:%s%n " , Developer2.getName(), Developer2.getGender(), Developer2.getAge(),CieSoft.school);
        System.out.printf("Developer 3%n Name: %s%n Gender: %c%n Age: %d%n%n School:%s%n ", Developer3.getName(), Developer3.getGender(), Developer3.getAge(),CieSoft.school);
        System.out.printf("Developer 4%n Name: %s%n Gender: %c%n Age: %d%n%n School:%s%n ", Developer4.getName(), Developer4.getGender(), Developer4.getAge(),CieSoft.school);
        System.out.printf("Developer 5%n Name: %s%n Gender: %c%n Age: %d%n%n School:%s%n ", Developer5.getName(), Developer5.getGender(), Developer5.getAge(),CieSoft.school);
        System.out.printf("Developer 6%n Name: %s%n Gender: %c%n Age: %d%n%n School:%s%n ", Developer6.getName(), Developer6.getGender(), Developer6.getAge(),CieSoft.school);
    }
}