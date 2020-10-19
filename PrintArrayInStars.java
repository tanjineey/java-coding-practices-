import java.util.Scanner;
//Program prompts user for the number of items in an array
public class PrintArrayInStars{
	public static void main(String[]args){
		int numItems;
		int[] items;
		Scanner in = new Scanner(System.in);

		//Prompt user for number of items in array
		System.out.print("Enter the number of items: ");
		numItems = in.nextInt();

		items = new int[numItems];

		if(items.length > 0){
			System.out.print("Enter the value of all items (separated by space): ");
			for(int i = 0; i < items.length; ++i){
				items[i] = in.nextInt();
			}
		}
		for(int i = 0; i < items.length; ++i){
			System.out.print(i + ": ");
			for(int m = 0; m < items[i]; ++m ){
				System.out.print("*");
			}
		System.out.println("(" + items[i] + ")");
		}
		
		in.close();
	}
}