public class Date {
    private int day;
    private int month;
    private int year;

    public Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
    public static void displayDate(int day, int month, int year) {
        if (month == 1)
            System.out.println("January");
        else if (month == 2) {
            System.out.println("February");

        } else if (month == 3) {
            System.out.println("March");

        } else if (month == 4) {
            System.out.println("April");

        } else if (month == 5) {
            System.out.println("May");

        } else if (month == 6) {
            System.out.println("June");

        } else if (month == 7) {
            System.out.println("July");

        } else if (month == 8) {
            System.out.println("August");

        } else if (month == 9) {
            System.out.println("September");

        } else if (month == 10) {
            System.out.println("October");

        } else if (month == 11) {
            System.out.println("November");

        } else if (month == 12) {
            System.out.println("December");

        } else
            System.out.println("Month number not in calender");
    }
    }

