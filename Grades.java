import java.util.Scanner; 
public class Grades{
	public static void main(String[]args){
	Scanner in = new Scanner(System.in);
	int numStudents, sum= 0 , min,max, i;
	int[] grades;

	System.out.print("Enter the number of students: ");
	numStudents = in.nextInt();
	grades = new int[numStudents];

	if(grades.length>0){
		for (i=0; i< grades.length;++i){
			System.out.print("Enter the grade for students 1: ");
			grades[i] = in.nextInt();
			sum = sum + grades[i];
			min = grades[0];
				if(grades[i]<min){
					min = grades[i];
				}
			max = grades[0];{
				if(grades[i]>max)
						max= grades[i];
			}
		}
		double average = (double)sum/numStudents;
		System.out.printf("The average is %.2f",average);
	}
	
    }
}