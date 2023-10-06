import java.util.ArrayList;

public class MultiChoiceQuestion extends Question{
    public String prompt;
    public ArrayList<String> choices = new ArrayList<>();
    protected boolean multiChoice = true;

    // default constructor
    public MultiChoiceQuestion(String prompt){
        super(prompt);
    }

    //  set the choices for the question
    public void setChoices(){
        choices.add("Lion");
        choices.add("Tiger");
        choices.add("Dog");
        choices.add("Rabbit");
        choices.add("Turtle");
    }

    // return the questions (ArrayList)
    public ArrayList<String> getChoices(){
        return choices;
    }

    // return if it is multi choice question
    public boolean isMultiChoice(){
        return super.isMultiChoice();
    }

    // tostring method
    public String toString(){
        return super.toString();
    }
}
