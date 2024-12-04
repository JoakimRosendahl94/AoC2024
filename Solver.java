import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;



public class Solver {

    ArrayList<Integer> firstList = new ArrayList<>();
    ArrayList<Integer> secondList = new ArrayList<>();


    int solution;


    public Solver() {
        this.firstList.add(0);
        this.secondList.add(0);
        this.solution = 0;
    }


    void readInput(String fileName) throws IOException {

        BufferedReader reader = new BufferedReader(

        new FileReader(fileName));

        String line;



        while ((line = reader.readLine()) != null) {
            String[] numbers = new String[line.split(" ").length];
            int i = 0;
            for(String element : line.split(" ")) {
                if(!element.equals("")) {
                    numbers[i] = element;
                    i++;
                }
                
            }

            firstList.add(Integer.parseInt(numbers[0]));
            secondList.add(Integer.parseInt(numbers[1]));

        }



        reader.close();

    }



    public void calculateSolution(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        int temp = 0;
        for(int i = 0; i < list1.size(); i++) {
            
            temp = list1.get(i) - list2.get(i);
            
            if(temp < 0) {
                temp *= -1;
            }

            solution += temp;

        }

    }



    public void sortInput(ArrayList<Integer> list) {
        for(int i = 1; i < list.size(); i++) {
            if(list.get(i) < list.get(i - 1)) {
                Collections.swap(list, i, i - 1);
                i = 1;
            }
        }
        
    }
}
