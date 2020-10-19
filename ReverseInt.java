import java.util.Scanner;
public class ReverseInt{
	public static void main(String[]args){
		//Declare variables
		int inNumber;
		int inDigit;

		Scanner in = new Scanner(System.in);

		//Prompt and read inputs as int
		System.out.print("Enter a positive integer: ");
		inNumber = in.nextInt();

		System.out.print("The reverse is: ");

		//Extract and drop the "last" digit repeatably using a while loop wiht modulus/divide operations
		while (inNumber > 0){
			inDigit = inNumber % 10;
            //Print this digit (which is extracted in reverse order)
            System.out.print(+inDigit);
            inNumber /= 10;
		}

		System.out.println("");
		in.close();
	}
}
