package javaObject;

import java.util.List;
import java.util.Objects;

public abstract class Student extends Person {
    private int studentID;
    private Grade grade;
    private List<String> learningSubject;

    public Student(String username, String password) {
        super(username, password);
    }

    public Student() {
    }

    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public Grade getGrade() {
        return grade;
    }

    public void setGrade(Grade grade) {
        this.grade = grade;
    }

    public List<String> getLearningSubject() {
        return learningSubject;
    }

    public void setLearningSubject(List<String> learningSubject) {
        this.learningSubject = learningSubject;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Student student = (Student) o;
        return studentID == student.studentID && Objects.equals(grade, student.grade) && Objects.equals(learningSubject, student.learningSubject);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), studentID, grade, learningSubject);
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentID=" + studentID +
                ", grade=" + grade +
                ", learningSubject=" + learningSubject +
                '}';
    }

    abstract void addSubject();

    abstract void dropSubject();

    //grade related methods

    abstract void queryAvg();

    abstract void queryScoreByExam(String examName);

    abstract Integer addEntry(String name, Integer score);

    abstract Integer deleteEntry();

    abstract void modifyEntry();

    abstract void emptyAll();
}
