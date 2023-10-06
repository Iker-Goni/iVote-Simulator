import java.util.ArrayList;
import java.util.Scanner;
public abstract class Question{
    public String prompt;
    public ArrayList<String> choices = new ArrayList<>();
    protected boolean multiChoice;

    public Question(String prompt){
        this.prompt = prompt;
    }

    public void setChoices(){
        // METHOD FOR ALLOWING USER TO INPUT CHOICES< NOT USING DURING SIMULATION PROCESS
        /*
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter each choice for the question, end the process by entering nothing...");
        while(true){
            System.out.print("Option: ");
            String input = sc.nextLine();
            if(input.equals("")){
                break;
            }
            choices.add(input);
        }
        */
        choices.add("Red");
        choices.add("Blue");
        choices.add("Green");
        choices.add("Orange");
    }

    public ArrayList<String> getChoices(){
        return choices;
    }

    public boolean isMultiChoice(){
        return multiChoice;
    }

    public String toString(){
        String displayChoices = "";
        for(int i = 0; i < choices.size(); i++){
            displayChoices += i + 1 + ". " + choices.get(i) + "\n";
        }
        return "\nQ: " + prompt + "\n" + displayChoices;
    }
}