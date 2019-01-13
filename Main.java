//import java.util.ArrayList;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        System.out.println("what is your first name?");
        String firstName = input.nextLine();
        System.out.println("what is your last name?");
        String lastName = input.nextLine();


        Composition c1 = new Composition(firstName, lastName);

        try {
            c1.decompose();
        } catch (Exception e) {
            System.out.println("File does not exist.");
            e.printStackTrace();
        }

        System.out.println(c1);
        System.out.println("Shall we go to the second part? (enter Yes or No)");
        if (input.next().equalsIgnoreCase("Yes")) {
            Question q1 = new Question();
            System.out.println(q1);

        } else if (input.next().equalsIgnoreCase("No")) {
            System.out.println("OK, have a good day!");
        } else {
            System.out.println("Sorry, I cant read your answer, please refresh and try again!");
        }

        Text t1 = new Text(60, 40, c1.toString());
        t1.setColor(Color.BLACK);
        t1.grow(20, 10);
        t1.draw();
        Text t2 = new Text(10, 110, "Life is like a box of chocolates, you never know what you are gonna get.");
        t2.setColor(Color.PINK);
        t2.draw();
        Flower f1 = new Flower(50, 150);
        f1.draw();
        Flower f2 = new Flower(210, 155);
        f2.draw();
        Flower f3 = new Flower(130, 160);
        f3.draw();
        Flower f4 = new Flower(300, 150);
        f4.draw();
        Flower f5 = new Flower(380, 160);
        f5.draw();


    }

    public void draw() {
    }


}


