import java.util.Scanner;
/**
 * Print the horizontal and vertical histograms of grades.
 */
public class GradesHistogramVertical{
   public static void main(String[] args) {
      // Declare variables
      int numStudents;
      int[] grades;  // Declare array name, to be allocated after numStudents is known
      int[] bins = new int[10];  // int array of 10 histogram bins for 0-9, 10-19, ..., 90-100
      Scanner in = new Scanner(System.in);

      // Prompt and read the number of students as "int"
      System.out.print("Enter the number of students: ");
      numStudents = in.nextInt();

      // Allocate the array
      grades = new int[numStudents];

      // Prompt and read the grades into the int array "grades"
      for (int i = 0; i < grades.length; ++i) {
         System.out.print("Enter the grade for student " + (i + 1) + ": ");
         grades[i] = in.nextInt();
      }
      // Populate the histogram bins
      for (int grade : grades) {
         if (grade == 100) {   // Need to handle 90-100 separately as it has 11 items.
            ++bins[9];
         } else {
            ++bins[grade/10];
         }
      }

      // Find the max value among the bins
      int binMax = bins[0];
      for (int binIdx = 1; binIdx < bins.length; ++binIdx) {
         if (binMax < bins[binIdx]) binMax = bins[binIdx];
      }

      // Print the Vertical histogram
      // Columns are the histogram bins[0] to bins[9]
      // Rows are the levels from binMax down to 1
      for (int level = binMax; level > 0; --level) {
         for (int binIdx = 0; binIdx < bins.length; ++binIdx) {
            if (bins[binIdx] >= level) {
               System.out.print("   *   ");
            } else {
               System.out.print("       ");
            }
         }
         System.out.println();
      }
      // Print label
      for (int binIdx = 0; binIdx < bins.length; ++binIdx) {
         System.out.printf("%3d-%-3d", binIdx*10, (binIdx != 9) ? binIdx * 10 + 9 : 100);
            // Use '-' flag for left-aligned
      }
      System.out.println();

      in.close();  // Close the Scanner
   }
}