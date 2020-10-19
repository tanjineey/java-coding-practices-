import java.util.Scanner;
public class SwapArrays{
	public static void main(String[]args){
		int numItems1, numItems2;
		int[] items1;
		int[] items2;
		Scanner in = new Scanner(System.in);

		//Prompt user for number of items in array
		System.out.print("Enter the number of items for array 1: ");
		numItems1 = in.nextInt();
		items1 = new int[numItems1];
		if(items1.length > 0){
			System.out.print("Enter the value of all items for array 1 (separated by space): ");
			for(int i = 0; i < items1.length; ++i){
				items1[i]= in.nextInt();
			}
		}
		System.out.print("Enter the number of items for array 2: ");
		numItems2 = in.nextInt();
		items2 = new int[numItems2];
		if(items2.length > 0){
			System.out.print("Enter the value of all items for array 2 (separated by space): ");
			for(int i = 0; i < items2.length; ++i){
				items2[i]= in.nextInt();
			}
		}
		if(swap(items1,items2)){
			System.out.print("Array 1 is: [");
				for(int i = 0; i < items1.length; ++i){
					if(i == 0 ){
						System.out.print(items1[0]);
					} else
				System.out.print(", " + items1[i]);
				}
			System.out.print("],");
			System.out.print(" Array 2 is: [");
				for(int i = 0; i < items2.length; ++i){
					if(i == 0 ){
						System.out.print(items2[0]);
					} else
			System.out.print(", " + items2[i]);
			}
			System.out.print("]");
		}
		else{
			System.out.print("No swap");
		}
	}
	public static boolean swap(int[]array1, int[]array2){
		int[]temp;
		temp = new int[array2.length];
		if(array1.length == array2.length){
			for(int i = 0; i < array2.length; ++i){
				temp[i]= array2[i];
			}
			for(int j = 0; j < array2.length; ++j){
				array2[j]= array1[j];
			}
			for(int m = 0; m < array1.length; ++m){
				array1[m]= temp[m];
			}
			return true;
		} 
		return false;
	}
}





