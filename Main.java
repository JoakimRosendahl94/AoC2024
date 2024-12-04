

import java.io.IOException;

public class Main {

    public static void main(String[] args) {

        Solver s = new Solver();
        Solver s2 = new Solver();

        try {

            s.readInput("data.txt");
            s2.readInput("data2.txt");

        } catch (IOException e) {

            System.err.println("Nope");

            return;

        }

        s.sortInput(s.firstList);
        s.sortInput(s.secondList);


       
        s2.sortInput(s.firstList);
        s2.sortInput(s.secondList);

        s2.similarityScore(s2.firstList, s2.secondList);
        s.similarityScore(s.firstList, s.secondList);

        System.err.println(s2.similarityScore);
        System.out.println(s.similarityScore);

    }
    
}