import java.util.Scanner;
//Program which prompts for the number of students in class
//their grades
//Computes and prints average, maximum and minimum
public class GradesStatistics{
	public static void main(String[]args){
		int numStudents;
		int m = 0 ;
		int[] grades;
		double average = 0,sum = 0;
		int minimum = 0 , maximum = 0 ;

		Scanner in = new Scanner(System.in);

		System.out.print("Enter the number of students: ");
		numStudents = in.nextInt();

		grades = new int[numStudents];

		for(int i = 0; i < grades.length; ++i){
			m = i + 1;
			System.out.print("Enter the grade for student " + m + ": ");
			grades[i] = in.nextInt();	
			sum += grades[i];	 
		}
		average = sum / numStudents;
		System.out.printf("The average is: %.2f%n",average);

		for(int i = 0; i<grades.length; ++i){
			minimum = grades[0];
			if(grades[i]< minimum){
				minimum = grades[i];
			}
		}
		System.out.println("The minimum is: " + minimum);

		for (int i = 0; i < grades.length; ++i){
			maximum = grades[0];
			if(grades[i] > maximum){
				maximum = grades[i];
			}
		}
		System.out.println("The maximum is: " + maximum);
		in.close();
	}
}