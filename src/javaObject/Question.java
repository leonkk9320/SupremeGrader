package javaObject;

import java.util.List;
import java.util.Objects;

public class Question {
    private String description;
    private List<String> options;
    private String answer;

    public Question() {
    }

    public Question(String description, List<String> options, String answer) {
        this.description = description;
        this.options = options;
        this.answer = answer;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<String> getOptions() {
        return options;
    }

    public void setOptions(List<String> options) {
        this.options = options;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Question question = (Question) o;
        return Objects.equals(description, question.description) && Objects.equals(options, question.options) && Objects.equals(answer, question.answer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(description, options, answer);
    }

    @Override
    public String toString() {
        return "Question{" +
                "description='" + description + '\'' +
                ", options=" + options +
                ", answer='" + answer + '\'' +
                '}';
    }
}
