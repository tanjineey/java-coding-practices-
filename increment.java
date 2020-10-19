import java.util.Scanner;
public class increment{
	public static void main(String[]args){
		int i=0;

		Scanner in = new Scanner(System.in);
		System.out.print("Enter number to be increased");
		i=in.nextInt();
		while(i>0){
			i=i++;
		}
		System.out.println(i);

		in.close();
	}
}