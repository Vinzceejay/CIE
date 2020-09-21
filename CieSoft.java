public class CieSoft {


    private String name;
    private char gender;
    private int age;
    public static String school = "CIE";

    public CieSoft(String name, char gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public char getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setChar(char gender){
        this.gender = gender;
    }
    public void setAge(int age) {
        this.age = age;
    }
}