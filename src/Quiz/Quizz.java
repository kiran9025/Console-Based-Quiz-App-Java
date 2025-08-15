package Quiz;

import java.util.ArrayList;

public class Quizz {

    private String question;
    private ArrayList<String> options;
    private int correctanser;


    public ArrayList<String> getOptions() {
        return options;
    }

    public void setOptions(ArrayList<String> options) {
        this.options = options;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public int getCorrectanser() {
        return correctanser;
    }

    public void setCorrectanser(int correctanser) {
        this.correctanser = correctanser;
    }

    @Override
    public String toString() {
        return "Quizz{" +
                "question='" + question + '\'' +
                ", options=" + options +
                '}';
    }
}

