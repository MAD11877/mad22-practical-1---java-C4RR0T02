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
    
    int numshapetoprint = base;

    while (numshapetoprint >= 1) {
      for (int count = 0; count < numshapetoprint; count++) {
        System.out.print("*");
      }
      System.out.println();
      numshapetoprint -= 1;
    }
  }
}

