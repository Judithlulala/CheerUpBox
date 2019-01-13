import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Composition {
    private String firstName;
    private String lastName;
    private String composition1;
    private String composition2;
    private String composition3;

    // constructor
    public Composition(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.composition1 = "";
        this.composition2 = "";
        this.composition3 = "";

    }


    public void decompose() throws FileNotFoundException {

        String filename = "Composition.txt";
        File inputFile = new File(filename);
        Scanner in = new Scanner(inputFile);

        ArrayList<String> words = new ArrayList<>();
        while (in.hasNext()) {

            words.add(in.next());
        }

        // get random number
        Random generator = new Random();
        int rand1, rand2, rand3;
        rand1 = generator.nextInt(423 - firstName.length());
        rand2 = generator.nextInt(423 - lastName.length());
        while (rand1 == rand2) {
            rand2 = generator.nextInt(423 - lastName.length());
        }
        rand3 = generator.nextInt(423);
        while (rand1 == rand3 || rand2 == rand3) {
            rand3 = generator.nextInt(423);
        }

        // get composition
        composition1 = words.get(rand1);
        composition2 = words.get(rand2);
        composition3 = words.get(rand3);


    }


    public String getComposition1() {
        return composition1;
    }

    public String getComposition2() {
        return composition2;
    }

    public String getComposition3() {
        return composition3;
    }


    @Override
    public String toString() {
        String resString = firstName + " " + lastName + " is made of " +
                getComposition1() + ", " +
                getComposition2() + " and " +
                getComposition3() + ".";
        return resString;

    }

}


