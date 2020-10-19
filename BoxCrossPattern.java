import java.util.Scanner;
public class BoxCrossPattern{
	public static void main(String[]args){
		int size;

		Scanner in = new Scanner(System.in);

		System.out.print("Enter the size: ");
		size = in.nextInt();

		for(int row = 1; row <= size; row++){
		    for(int col = 1; col <= size; col++){
		    	if(row == 1 || row == size || col == 1 || col == size){
		    		System.out.print("*");
		    	}
		    	else if(row == col || (row + col) == (size + 1)){
		    		System.out.print("+");
		    	}
		    	else{
		    		System.out.print(" ");
		    	}
		    }
		    System.out.println("");
		}
	}
}