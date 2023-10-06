import java.util.ArrayList;

public class Student{
    public String id;
    public ArrayList<Integer> answer = new ArrayList<>();

    public Student(String id){
        this.id = id;
    }

    public void setAnswer(SingleChoiceQuestion question, int answer){
        if(this.answer.size() > 0){
            this.answer.remove(0);
        }
        this.answer.add(answer);
    }

    public void setAnswer(MultiChoiceQuestion question, int... answers){
        for(int i = 0; i < this.answer.size(); i++){
            this.answer.remove(i);
        }
        for(int answer : answers){
            this.answer.add(answer);
        }
    }

    public ArrayList<Integer> getAnswer(){
        return answer;
    }

    public String getID(){
        return id;
    }
}