import java.util.ArrayList;

public class MultiChoiceQuestion extends Question{
    public String prompt;
    public ArrayList<String> choices = new ArrayList<>();
    protected boolean multiChoice = true;

    public MultiChoiceQuestion(String prompt){
        super(prompt);
    }

    public void setChoices(){
        choices.add("Lion");
        choices.add("Tiger");
        choices.add("Dog");
        choices.add("Rabbit");
        choices.add("Turtle");
    }

    public ArrayList<String> getChoices(){
        return choices;
    }

    public boolean isMultiChoice(){
        return super.isMultiChoice();
    }

    public String toString(){
        return super.toString();
    }
}
