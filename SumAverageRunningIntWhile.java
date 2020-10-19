public class SumAverageRunningIntWhile {   
   public static void main (String[] args) {
      // Define variables
      int sum = 0;          // The accumulated sum, init to 0
      double average;       // average in double
      int lowerbound = 1;
      int upperbound = 100;

      int number = lowerbound;        // declare and init loop index variable
      while (number <= upperbound) {  // test
         sum += number;
         ++number;                    // update
      }

      // Compute average in double. Beware that int / int produces int!
      average = sum / (upperbound - lowerbound + 1.0);
      // Print sum and average
      System.out.println("The sum of " + lowerbound + " to " + upperbound + " is " +sum);
      System.out.println("The average is " + average);
         }
}