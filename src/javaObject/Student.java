package javaObject;

import java.util.List;

public class Student extends Person {
    private int studentID;
    private Grade grade;
    private List<String> learningSubject;

    public Student(String username, String password) {
        super(username, password);
    }


}
