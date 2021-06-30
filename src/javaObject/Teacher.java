package javaObject;

import java.util.List;

public abstract class Teacher {
    private int teacherID;
    private List<Subject> teachingSubject;



    abstract void addSubject();

    abstract void dropSubject();




}
