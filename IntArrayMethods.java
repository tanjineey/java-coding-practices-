import java.util.Scanner;
public class IntArrayMethods{
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
		System.out.print("The values are: ");
		print(items);
		System.out.println("The min is: " + min(items));
		System.out.println("The max is: " + max(items));
		System.out.println("The sum is: " + sum(items));
		System.out.printf("The average (rounded to 2 decimal places) is: %.2f%n", average(items));
		if(!isEmpty(items)){
			System.out.print("This array is not empty");
		}
		if(isEmpty(items)){
			System.out.print("This array is empty");
		}
		in.close();
	}
	public static void print(int[]array){		//print [x1, x2, ..., xn]
		System.out.print("[");
		for(int i = 0; i < array.length; ++i){
			if(i == 0 ){
				System.out.print(array[0]);
			} else
			System.out.print(", " + array[i]);
		}
		System.out.print("]");
		System.out.println("");
	}
	public static int min(int[] array){ 	//Returns the minimum
		int minimum = array[0];
		for(int i = 0; i < array.length; ++i){
			if(array[i]<minimum){
				minimum = array[i];
			}
		}
		return minimum;
	}
	public static int max(int[]array){		//Returns the maximum
		int maximum = array[0];
		for(int i = 0; i < array.length; ++i){
			if(array[i] > maximum){
				maximum = array[i];
			}
		}
		return maximum;
	}
	public static int sum(int[]array){       //Returns the sum
		int sum = 0;
		for(int item:array){
			 sum += item;
		}
		return sum;
	}
	public static double average(int[]array){		//Returns average in double
		return(double)(sum(array)) / array.length;

	}
	public static boolean isEmpty(int[]array){
		if(array.length <= 0){
			return true;
		} else{
			return false;
		}
	}

}