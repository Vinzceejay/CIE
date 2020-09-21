public class EmployeeTest {
    public static void main(String...args){
        Employee e1 = new Employee("Veenz", "chukz", 4500.00);
        Employee e2 = new Employee("chibundu", "omoji", 5000.00);
        System.out.println("The first employee's full name and annual salary \n" );
        System.out.println( e1.getFirstName() + " " + e1.getLastName() + " " + e1.getMonthlySalary() * 12 + "\n");
        System.out.println("The second employee's full name and annual salary \n" );
        System.out.println( e2.getFirstName() + " " + e2.getLastName() + " " + e2.getMonthlySalary() * 12 + "\n" );
        System.out.println("Showing the allocated amount after some percent rise \n ");
        System.out.println(e1.getFirstName() + " " + e1.getLastName() + " " +e1.getMonthlySalary() * 1.10 * 12 + "\n" );
        System.out.println(e2.getFirstName() + " " + e2.getLastName() + " " +e2.getMonthlySalary() * 1.10 * 12 + "\n" );

    }
}
