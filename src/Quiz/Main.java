package Quiz;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    static int count;
    public static void main(String[] args) {

        ArrayList<Quizz> quizList = new ArrayList<>();

        Quizz q1 = new Quizz();
        q1.setQuestion("What is the capital of Karnataka?");
        q1.setOptions(new ArrayList<>(List.of("Mysuru", "Bengaluru", "Mangaluru", "Hubballi")));
        q1.setCorrectanser(1);
        quizList.add(q1);

        Quizz q2 = new Quizz();
        q2.setQuestion("Which is the state flower of Karnataka?");
        q2.setOptions(new ArrayList<>(List.of("Lotus", "Jasmine", "Sunflower", "Rose")));
        q2.setCorrectanser(0);
        quizList.add(q2);

        Quizz q3 = new Quizz();
        q3.setQuestion("Which river flows through Hampi?");
        q3.setOptions(new ArrayList<>(List.of("Krishna", "Cauvery", "Tungabhadra", "Sharavathi")));
        q3.setCorrectanser(2);
        quizList.add(q3);

        Quizz q4 = new Quizz();
        q4.setQuestion("Who was the founder of Bengaluru?");
        q4.setOptions(new ArrayList<>(List.of("Kempegowda", "Tipu Sultan", "Krishnadevaraya", "Hyder Ali")));
        q4.setCorrectanser(0);
        quizList.add(q4);

        Quizz q5 = new Quizz();
        q5.setQuestion("Which district is famous for the Chitra Santhe art fair?");
        q5.setOptions(new ArrayList<>(List.of("Mysuru", "Bengaluru", "Chitradurga", "Hubballi")));
        q5.setCorrectanser(1);
        quizList.add(q5);

        Quizz q6 = new Quizz();
        q6.setQuestion("Which is the state bird of Karnataka?");
        q6.setOptions(new ArrayList<>(List.of("Ganda Berunda", "Peacock", "Koel", "Hornbill")));
        q6.setCorrectanser(0);
        quizList.add(q6);

        Quizz q7 = new Quizz();
        q7.setQuestion("What is the official language of Karnataka?");
        q7.setOptions(new ArrayList<>(List.of("Kannada", "Telugu", "Tamil", "Hindi")));
        q7.setCorrectanser(0);
        quizList.add(q7);

        Quizz q8 = new Quizz();
        q8.setQuestion("Where is the Jog Falls located?");
        q8.setOptions(new ArrayList<>(List.of("Kodagu", "Shivamogga", "Udupi", "Belagavi")));
        q8.setCorrectanser(1);
        quizList.add(q8);

        Quizz q9 = new Quizz();
        q9.setQuestion("Which place is known as the 'Silicon Valley of India'?");
        q9.setOptions(new ArrayList<>(List.of("Bengaluru", "Mysuru", "Mangaluru", "Hubballi")));
        q9.setCorrectanser(0);
        quizList.add(q9);

        Quizz q10 = new Quizz();
        q10.setQuestion("Which famous king built the Mysore Palace?");
        q10.setOptions(new ArrayList<>(List.of("Tipu Sultan", "Krishnaraja Wodeyar IV", "Hyder Ali", "Kempegowda")));
        q10.setCorrectanser(1);
        quizList.add(q10);

        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the Java Console based Quiz \n");
        int i = 0;

        while(i < quizList.size()){
            System.out.println(quizList.get(i).getQuestion());

            ArrayList<String> list = quizList.get(i).getOptions();
            for(int j = 0 ; j < list.size(); j++){
                System.out.println((j+1) + " : " + list.get(j));
            }

            System.out.println("Enter choice 1 2 3 4");
            int res = sc.nextInt();

            if(res > 0 && res < 5){
                res -= 1;
                if(res == quizList.get(i).getCorrectanser()){
                    count++;
                    System.out.println("Correct answer! ");
                }else{
                    System.out.println("Wrong! Correct answer is: " + list.get(quizList.get(i).getCorrectanser()));
                }
            }else{
                System.out.println("Invalid choice Please enter the choice between 1 -4");

            }
            System.out.println();
            i++;
        }
        System.out.println("Your Total score is " + count + " / " + quizList.size());

        double avg = (double) count/quizList.size();
        System.out.printf("Average: %.2f%%\n", avg * 100);


    }
}