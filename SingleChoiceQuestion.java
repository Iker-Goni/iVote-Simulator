import java.util.ArrayList;

public class SingleChoiceQuestion extends Question{
    public String prompt;
    public ArrayList<String> choices = new ArrayList<>();
    protected boolean multiChoice = false;

    //default constructor
    public SingleChoiceQuestion(String prompt){
        super(prompt);
    }

    // set the choices for question
    public void setChoices(){
        super.setChoices();
    }

    // get the choices
    public ArrayList<String> getChoices(){
        return super.getChoices();
    }

    // checks if it is multichoice question
    public boolean isMultiChoice(){
        return super.isMultiChoice();
    }

    // tostring method
    public String toString(){
        return super.toString();
    }
}
