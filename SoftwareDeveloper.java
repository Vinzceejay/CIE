public class SoftwareDeveloper {
    private String id;
    private String dept;
    private char gender;
    private int age;

    public SoftwareDeveloper(String id, String dept, char gender, int age) {
        this.id = id;
        this.dept = dept;
        this.gender = gender;
        this.age = age;
    }

    public String getId() {
        return id;
    }

    public String getDept() {
        return dept;
    }

    public char getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    public void setId() {
        this.id = id;
    }

    public void setDept(){
        this.dept = dept;
    }

    public void setGender() {
        this.gender = gender;
    }
    public void setAge(){
        this.age = age;
    }
}

