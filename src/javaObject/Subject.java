package javaObject;

import java.util.List;

public abstract class Subject {
    private int subjectID;
    private String subjectName;
    private String info;
    private List<Student> studentGroup;
    private Teacher teacher;
    private List<Question> questionList;

    abstract void addQuestion();

    abstract void dropQuestion();



}
