import java.util.Scanner;
public class InputValidation{
	public static void main(String[]args){
		int numberIn;
		boolean isValid;

		Scanner in = new Scanner(System.in);


		//Use a do-while loop controlled by a boolean flag 
		// to repeatably read the input until a valid input is entered 
		isValid = false;
		do{
			//Prompt and read input 
			System.out.print("Enter a number between 0-10 or 90-100: ");
			numberIn = in.nextInt();

			if (numberIn >= 0 && numberIn <=10 || numberIn >= 90 && numberIn <= 100){
				isValid = true;
			} else {
				System.out.println("Invalid input, try again...");
			}
		} while (!isValid);

		if(isValid == true){
			System.out.println("You have entered: " +numberIn);
		}
	}
}
