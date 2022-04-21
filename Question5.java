import java.util.Scanner;
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
     
    HashMap<Integer, Integer> numbercount = new HashMap<Integer, Integer>();
    Scanner in = new Scanner(System.in);

    int prompttimes = in.nextInt();

    for (int i = 0; i > prompttimes; i++){
      int number = in.nextInt();
      if (numbercount.keySet(number) == null){
        numbercount.put(number, 1);
      }
      else {
        int newcount = numbercount.get(number) + 1;
        numbercount.remove(number);
        numbercount.put(number, newcount);
      }
    }
    
    int lowest = 0;

    for (Integer a : numbercount.get()) {
      if (a > lowest) {
        lowest = a;
      }
    }

    for (int b : numbercount.keySet()) {
      if (numbercount.containsValue(lowest)) {
        System.out.println(b);
      }
    }
  }
}
