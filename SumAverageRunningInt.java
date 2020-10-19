public class SumAverageRunningInt {   
   public static void main (String[] args) {
      // Define variables
      int sum = 0;          // The accumulated sum, init to 0
      double average;       // average in double
      int lowerbound = 1;
      int upperbound = 100;

      // Use a for-loop to sum from lowerbound to upperbound
      for (int number = lowerbound; number <= upperbound; ++number) {
            // The loop index variable number = 1, 2, 3, ..., 99, 100
         sum += number;     // same as "sum = sum + number"
      }
      // Compute average in double. Beware that int / int produces int!
      average = sum / (upperbound - lowerbound + 1.0);
      // Print sum and average
      System.out.println("The sum of " + lowerbound + " to " + upperbound + " is " +sum);
      System.out.println("The average is " + average);
         }
}