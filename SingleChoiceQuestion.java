import java.util.ArrayList;

public class SingleChoiceQuestion extends Question{
    public String prompt;
    public ArrayList<String> choices = new ArrayList<>();
    protected boolean multiChoice = false;

    public SingleChoiceQuestion(String prompt){
        super(prompt);
    }

    public void setChoices(){
        super.setChoices();
    }

    public ArrayList<String> getChoices(){
        return super.getChoices();
    }

    public boolean isMultiChoice(){
        return super.isMultiChoice();
    }

    public String toString(){
        return super.toString();
    }
}
