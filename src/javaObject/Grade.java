package javaObject;

import java.util.Map;
import java.util.Objects;

//grade for a certain student
public abstract class Grade {
    private double avg; // all tests
    private Map<String, Integer> examsScore; // <examName, score>

    public Grade() {
    }

    public Grade(double avg, Map<String, Integer> examsScore) {
        this.avg = avg;
        this.examsScore = examsScore;
    }

    public double getAvg() {
        return avg;
    }

    public void setAvg(double avg) {
        this.avg = avg;
    }

    public Map<String, Integer> getExamsScore() {
        return examsScore;
    }

    public void setExamsScore(Map<String, Integer> examsScore) {
        this.examsScore = examsScore;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Grade grade = (Grade) o;
        return Double.compare(grade.avg, avg) == 0 && Objects.equals(examsScore, grade.examsScore);
    }

    @Override
    public int hashCode() {
        return Objects.hash(avg, examsScore);
    }

    @Override
    public String toString() {
        return "Grade{" +
                "avg=" + avg +
                ", examsScore=" + examsScore +
                '}';
    }

    abstract double calculateAvg();

    private Integer addEntry(String name, Integer score){
        return examsScore.put(name, score);
    }

    abstract Integer deleteEntry();

    abstract void modifyEntry();

    abstract Integer getScore(String examName);

    abstract void emptyAll();

}
