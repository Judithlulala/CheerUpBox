import java.util.Scanner;
import java.util.ArrayList;

public class Question {


    public Question() {


        Scanner newIn = new Scanner(System.in);
        System.out.println("Please ask me a question about yourself (enter Q to end).");
        String question;
        boolean done = false;
        while (!done) {
            ArrayList<String> questions = new ArrayList<>();
            question = newIn.nextLine();
            String[] a = question.split(" ");
            for (int j = 0; j < a.length; j++) {

                questions.add(a[j]);
            }
            System.out.println(questions);


            int decider = 0;
            for (int i = 0; i < questions.size() - 1; i++) {

                if (questions.get(i).equals("love")) {
                    decider = decider + 1;
                } else if (questions.get(i).equalsIgnoreCase("can") || questions.get(i).equalsIgnoreCase("will")
                        || questions.get(i).equalsIgnoreCase("possible")) {
                    decider = decider + 2;
                }
            }
            if (decider == 1) {
                System.out.println("Instead of asking me, ask the person directly! Be brave!");

            } else if (decider >= 2) {
                System.out.println(" I will give you an “yes” as long as you are going to start, aren’t you?\n");
            } else {
                System.out.println("Wow, a complicated question beyond my knowledge. Why not have a try and" +
                        " you will know the answer. Good or not, you can get something!");

            }
            System.out.println("Please ask me a question about yourself (enter Q to end).");
            if (newIn.next().equalsIgnoreCase("Q")) {
                done = true;
                System.out.println("Life is like a box of chocolates, you never know what you are gonna get.");
            } else {
                done = false;
            }

        }

    }
}

