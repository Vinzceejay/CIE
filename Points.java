public class Points {
    private String name;
    private int score;

    public Points(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
    public String Average(){
        String grade = "";
        if (score >=70)
            grade = "A";
        else if(score>=60)
            grade = "B";
        else if(score>=50)
            grade = "C";
        else if(score>=45)
            grade = "D";
        else if (score<=44)
            grade = "F";
        return grade;
    }
}
