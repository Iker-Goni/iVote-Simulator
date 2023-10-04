import java.util.Arrays;
public abstract class Question{
    public String prompt;
    public String[] choices;
    public String[] answers;

    public Question(String prompt, String[] choices, String[] answers){
        this.prompt = prompt;
        this.choices = Arrays.copyOf(choices, choices.length);
        this.answers = Arrays.copyOf(answers, answers.length);
    }
}