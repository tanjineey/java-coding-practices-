import java.util.Scanner;
public class CheckerPattern{
	public static void main(String[]args){
		int size;

		Scanner in = new Scanner(System.in);

		System.out.print("Enter the size: ");
		size = in.nextInt();

		//Outer loop to print ALL the rows
		for (int row = 1; row <= size; row++){
			if(row % 2 == 0){
				System.out.print(" ");
			}
			for (int col = 1; col <= size; col++){
				System.out.print("# ");
			}
			// Print a newline after all the columns 
			System.out.println();
		}

	}
}