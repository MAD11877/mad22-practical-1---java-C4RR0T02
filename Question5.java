import java.util.Scanner;
import java.io.Console;
import java.util.ArrayList;
import java.util.HashMap;


public class Question5
{
  public static void main(String[] args)
  {
    /**
     * Prompt the user for number. This input indicates the number of integers the user will be entering next. 
     * Print out the mode (highest occurrence) from the set of integers. 
     *    e.g.
     *     > 5
     *     > 2
     *     > 4
     *     > 1
     *     > 3
     *     > 4
     *     4
     * 
     *    e.g.
     *     > 4
     *     > 2
     *     > 2
     *     > 3
     *     > 3
     *     2
     * Hint: Use a loop to get input. Use another 2 loops to find the mode
     */
     
    Scanner in = new Scanner(System.in);

    ArrayList<Integer> chosenint = new ArrayList<>();
    ArrayList<Integer> totalrep = new ArrayList<>();

    int prompttimes = in.nextInt();

    for (int i = 0; i < prompttimes; i++) {
      int number = in.nextInt();
      chosenint.add(number);
    }
    
    for (int a = 0; a < chosenint.size(); a++) {
      int repetition = 1;
      for (int b = a + 1; b < chosenint.size(); b++) {
        if (chosenint.get(a) == chosenint.get(b)) {
          repetition++;
        }
      }
      totalrep.add(repetition);
    }

    int mostrep = -1;
    int highestrepnum = -1;

    for (int c = 0; c < totalrep.size(); c++) {
      if (totalrep.get(c) > mostrep){
        mostrep = totalrep.get(c);
        highestrepnum = chosenint.get(c);
      }
    }

    System.out.println(highestrepnum);

  }
}
