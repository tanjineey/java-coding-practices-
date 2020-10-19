import java.util.Scanner;
public class SearchArray{
	public static void main(String[]args){
		int numItems;
		int[] items;
		Scanner in = new Scanner(System.in);
		int findKey;

		//Prompt user for number of items in array
		System.out.print("Enter the number of items: ");
		numItems = in.nextInt();
		items = new int[numItems];
		if(items.length > 0){
			System.out.print("Enter the value of all items (separated by space): ");
			for(int i = 0; i < items.length; ++i){
				items[i]= in.nextInt();
			}
		}
		System.out.print("Enter the search key: ");
		findKey = in.nextInt();
		if(search(items, findKey) == -1){
			System.out.print(findKey + " is not found");
		} else{
			System.out.print(findKey + " is found with index " + search(items,findKey));
		}
		in.close();
	}

	public static int search(int[] array, int key){
		int keyFound = -1;	
			for (int arrayIdx = 0; arrayIdx < array.length; ++arrayIdx){
			    if(array[arrayIdx] == key){
			     keyFound = arrayIdx;
			     break;
			    }	
			}	
	    return keyFound;
    }
}