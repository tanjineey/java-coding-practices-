import java.util.Scanner;
public class AverageWithInputValidation{
	public static void main(String[]args){
		final int NUM_STUDENTS = 3;
		int numberIn = 0;
		boolean isValid;
		double sum = 0;
		double average = 0;

		Scanner in = new Scanner(System.in);

		for (int studentNo = 1; studentNo <= NUM_STUDENTS; ++studentNo){
			//Prompt user for mark with input validation
			
			do{
				System.out.print("Enter the mark (0-100) for student " + studentNo + ": ");
			    numberIn = in.nextInt();
			    isValid = false;
		       //Prompt and read input 
               if (numberIn >= 0 && numberIn <= 100){
			      isValid = true;
			   } else {
				  System.out.println("Invalid input, try again...");
			   }
		    }while (!isValid);
			
			if(isValid == true){
		    sum += numberIn;
		    average = sum / NUM_STUDENTS ;
		    }	   	
	    }
	    System.out.printf("The average is: %.2f",average);
	}
}
