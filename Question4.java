import java.util.Scanner;

public class Question4
{
  public static void main(String[] args)
  {
    /**
     * Prints a right angle triangle with *. The base of the triangle depends on the integer given.
     *    e.g.
     *     > 5
     *     *****
     *     ****
     *     ***
     *     **
     *     *
     * 
     * Hint: 2 loops are required. System.out.print(...) to print on single line.
     */
     
    Scanner in = new Scanner(System.in);
    int base = in.nextInt();
    String row = "";
    
    while (base >= 1) {
      for (int i = 1; i > base; i++) {
        row = row + "*";
      }
      System.out.println(row);
      base -= 1;
    }
  }
}

