import java.util.Scanner;
//Program prompts user for the number of items in an array
public class PrintArray{
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
		System.out.print("The values are: [");
		for(int i = 0; i < items.length; ++i){
			if(i == 0 ){
				System.out.print(items[0]);
			} else
			System.out.print(", " + items[i]);
		}
		System.out.print("]");
		in.close();
	}
}