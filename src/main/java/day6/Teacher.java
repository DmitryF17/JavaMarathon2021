package day6;

import java.util.Random;

public class Teacher {
    private String name;
    private String subject;

    public Teacher(String name, String subject) {
        this.name = name;
        this.subject = subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getName() {
        return name;
    }

    public String getSubject() {
        return subject;
    }

    void evaluate(Student student) {
        Random random = new Random();
        int randomValue = random.nextInt(4) + 2;
        String evalution = "";
        switch (randomValue) {
            case 2:
                evalution = "неудовлетворительно";
                    break;
            case 3:
                evalution = "удовлетворительно";
                break;
            case 4:
                evalution = "хорошо";
                break;
            case 5:
                evalution = "отлично";
                break;
        }
        System.out.print("Преподаватель" + this.name +
        "оценил студента с именем" + student.getName() +
        "по предмету" + this.subject +
        "на оценку " + evalution
        );
    }
}
