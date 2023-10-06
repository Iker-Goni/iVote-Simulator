import java.util.ArrayList;
import java.util.Random;

public class SimulationDriver {

    // method for generating random answers for multichoice question 
    public static int[] generateRandomIntArray() {
        Random rand = new Random();
        
        int size = rand.nextInt(5) + 1;

        ArrayList<Integer> uniqueIntegers = new ArrayList<>();

        while (uniqueIntegers.size() < size) {
            int randomNumber = rand.nextInt(5) + 1; 

            if (!uniqueIntegers.contains(randomNumber)) {
                uniqueIntegers.add(randomNumber);
            }
        }

        int[] randomIntArray = new int[size];
        for (int i = 0; i < size; i++) {
            randomIntArray[i] = uniqueIntegers.get(i);
        }

        return randomIntArray;
    }
    public static void main(String[] args){
        Random random = new Random();

        // single choice object
        SingleChoiceQuestion question = new SingleChoiceQuestion("Favorite Color?");
        question.setChoices();

        VotingSimulator favoriteColor = new VotingSimulator(question);
        
        favoriteColor.displayQuestion();

        Student student1 = new Student("0001");
        student1.setAnswer(question, (int) (Math.random() * 4) + 1);
        favoriteColor.recordAnswer(student1);
        
        Student student2 = new Student("0002");
        student2.setAnswer(question, (int) (Math.random() * 4) + 1);
        favoriteColor.recordAnswer(student2);
        
        Student student3 = new Student("0003");
        student3.setAnswer(question, (int) (Math.random() * 4) + 1);
        favoriteColor.recordAnswer(student3);
        
        Student student4 = new Student("0004");
        student4.setAnswer(question, (int) (Math.random() * 4) + 1);
        favoriteColor.recordAnswer(student4);
        
        Student student5 = new Student("0005");
        student5.setAnswer(question, (int) (Math.random() * 4) + 1);
        favoriteColor.recordAnswer(student5);
        
        Student student6 = new Student("0006");
        student6.setAnswer(question, (int) (Math.random() * 4) + 1);
        favoriteColor.recordAnswer(student6);
        
        Student student7 = new Student("0007");
        student7.setAnswer(question, (int) (Math.random() * 4) + 1);
        favoriteColor.recordAnswer(student7);
        
        Student student8 = new Student("0008");
        student8.setAnswer(question, (int) (Math.random() * 4) + 1);
        favoriteColor.recordAnswer(student8);
        
        Student student9 = new Student("0009");
        student9.setAnswer(question, (int) (Math.random() * 4) + 1);
        favoriteColor.recordAnswer(student9);
        
        Student student10 = new Student("0010");
        student10.setAnswer(question, (int) (Math.random() * 4) + 1);
        favoriteColor.recordAnswer(student10);
        
        Student student11 = new Student("0011");
        student11.setAnswer(question, (int) (Math.random() * 4) + 1);
        favoriteColor.recordAnswer(student11);
        
        Student student12 = new Student("0012");
        student12.setAnswer(question, (int) (Math.random() * 4) + 1);
        favoriteColor.recordAnswer(student12);
        
        Student student13 = new Student("0013");
        student13.setAnswer(question, (int) (Math.random() * 4) + 1);
        favoriteColor.recordAnswer(student13);
        
        Student student14 = new Student("0014");
        student14.setAnswer(question, (int) (Math.random() * 4) + 1);
        favoriteColor.recordAnswer(student14);
        
        Student student15 = new Student("0015");
        student15.setAnswer(question, (int) (Math.random() * 4) + 1);
        favoriteColor.recordAnswer(student15);
        
        Student student16 = new Student("0016");
        student16.setAnswer(question, (int) (Math.random() * 4) + 1);
        favoriteColor.recordAnswer(student16);
        
        Student student17 = new Student("0017");
        student17.setAnswer(question, (int) (Math.random() * 4) + 1);
        favoriteColor.recordAnswer(student17);
        
        Student student18 = new Student("0018");
        student18.setAnswer(question, (int) (Math.random() * 4) + 1);
        favoriteColor.recordAnswer(student18);
        
        Student student19 = new Student("0019");
        student19.setAnswer(question, (int) (Math.random() * 4) + 1);
        favoriteColor.recordAnswer(student19);
        
        Student student20 = new Student("0020");
        student20.setAnswer(question, (int) (Math.random() * 4) + 1);
        favoriteColor.recordAnswer(student20);

        // show the stats for each question
        favoriteColor.showStats();
        

        // multichoice question object
        MultiChoiceQuestion question2 = new MultiChoiceQuestion("Which animals do you like");
        question2.setChoices();

        VotingSimulator coolAnimals = new VotingSimulator(question2);

        coolAnimals.displayQuestion();

        Student student21 = new Student("0021");
        student21.setAnswer(question2, generateRandomIntArray());
        coolAnimals.recordAnswer(student21);
        
        Student student22 = new Student("0022");
        student22.setAnswer(question2, generateRandomIntArray());
        coolAnimals.recordAnswer(student22);
        
        Student student23 = new Student("0023");
        student23.setAnswer(question2, generateRandomIntArray());
        coolAnimals.recordAnswer(student23);
        
        Student student24 = new Student("0024");
        student24.setAnswer(question2, generateRandomIntArray());
        coolAnimals.recordAnswer(student24);
        
        Student student25 = new Student("0025");
        student25.setAnswer(question2, generateRandomIntArray());
        coolAnimals.recordAnswer(student25);
        
        Student student26 = new Student("0026");
        student26.setAnswer(question2, generateRandomIntArray());
        coolAnimals.recordAnswer(student26);
        
        Student student27 = new Student("0027");
        student27.setAnswer(question2, generateRandomIntArray());
        coolAnimals.recordAnswer(student27);
        
        Student student28 = new Student("0028");
        student28.setAnswer(question2, generateRandomIntArray());
        coolAnimals.recordAnswer(student28);
        
        Student student29 = new Student("0029");
        student29.setAnswer(question2, generateRandomIntArray());
        coolAnimals.recordAnswer(student29);
        
        Student student30 = new Student("0030");
        student30.setAnswer(question2, generateRandomIntArray());
        coolAnimals.recordAnswer(student30);
        
        Student student31 = new Student("0031");
        student31.setAnswer(question2, generateRandomIntArray());
        coolAnimals.recordAnswer(student31);
        
        Student student32 = new Student("0032");
        student32.setAnswer(question2, generateRandomIntArray());
        coolAnimals.recordAnswer(student32);
        
        Student student33 = new Student("0033");
        student33.setAnswer(question2, generateRandomIntArray());
        coolAnimals.recordAnswer(student33);
        
        Student student34 = new Student("0034");
        student34.setAnswer(question2, generateRandomIntArray());
        coolAnimals.recordAnswer(student34);
        
        Student student35 = new Student("0035");
        student35.setAnswer(question2, generateRandomIntArray());
        coolAnimals.recordAnswer(student35);
        
        Student student36 = new Student("0036");
        student36.setAnswer(question2, generateRandomIntArray());
        coolAnimals.recordAnswer(student36);
        
        Student student37 = new Student("0037");
        student37.setAnswer(question2, generateRandomIntArray());
        coolAnimals.recordAnswer(student37);
        
        Student student38 = new Student("0038");
        student38.setAnswer(question2, generateRandomIntArray());
        coolAnimals.recordAnswer(student38);
        
        Student student39 = new Student("0039");
        student39.setAnswer(question2, generateRandomIntArray());
        coolAnimals.recordAnswer(student39);
        
        Student student40 = new Student("0040");
        student40.setAnswer(question2, generateRandomIntArray());
        coolAnimals.recordAnswer(student40);
        
        // shows the stats for each answer
        coolAnimals.showStats();
    }
}
