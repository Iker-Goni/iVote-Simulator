import java.util.HashMap;
import java.util.ArrayList;

public class VotingSimulator {
    public HashMap<String, ArrayList<Integer>> studentAnswers = new HashMap<>();
    public Question question;
    
    public VotingSimulator(Question question){
        this.question = question;
    }

    public void displayQuestion(){
        System.out.println(question);
    }

    public void recordAnswer(Student student){
        studentAnswers.put(student.getID(), student.getAnswer());
    }

    public void showStats(){
        HashMap<Integer, Integer> frequencyMap = new HashMap<>();

        ArrayList<String> choices = new ArrayList<>();
        choices.addAll(question.getChoices());  

        for(ArrayList<Integer> value : studentAnswers.values()){
            for(int answer : value){
                if(frequencyMap.containsKey(answer)) {
                    frequencyMap.put(answer, frequencyMap.get(answer) + 1);
                } else{
                    frequencyMap.put(answer, 1);
                }
            }
        }

        for(int choice : frequencyMap.keySet()){
            System.out.println(choices.get(choice - 1) + ": " + frequencyMap.get(choice));
        }

    }
}
