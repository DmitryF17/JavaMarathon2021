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
        System.out.print("Преподаватель" + getName() +
        "оценил студента с именем" + student.getName() +
        "по предмету" + getSubject() +
        "на оценку " + (random.nextInt(4) + 2)
        );
    }
}
