import java.util.Scanner;
//Program which prompts for the number of students in class
//their grades
//Computes and prints average, maximum and minimum
public class GradesHistogramBins{
	public static void main(String[]args){
		int numStudents;
		int m = 0 ;
		int[] grades;
		int[] bins = new int[10];

		Scanner in = new Scanner(System.in);

		System.out.print("Enter the number of students: ");
		numStudents = in.nextInt();

		grades = new int[numStudents];

		for(int i = 0; i < grades.length; ++i){
			m = i + 1;
			System.out.print("Enter the grade for student " + m + ": ");
			grades[i] = in.nextInt();
		}

		for(int i = 0; i < grades.length; ++i){
			if (grades[i] == 100){
				++bins[9];
			}else{
				++bins[grades[i]/10]; 
			}
		}
		//Print the bins
		for(int binIdx = 0; binIdx < bins.length; ++binIdx){
			if(binIdx != 9){
				System.out.printf("%2d-%3d: ",binIdx*10, (binIdx*10)+9);
			} else{
				System.out.printf("%2d-%3d: ",binIdx*10, (binIdx*10)+10);
			}
			System.out.println(bins[binIdx]);
		}		
		in.close();
	}
}