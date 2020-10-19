import java.util.Scanner;
public class ComputePIa{
	public static void main(String[]args){
		int maxDenominator;
		double sum = 0.0;
		double pi = 0.0;

		Scanner in = new Scanner(System.in);

		System.out.print("Enter the maximum denominator: ");
		maxDenominator = in.nextInt();

		for(int denominator =1 ; denominator <= maxDenominator; denominator += 2)
		{
			if (denominator % 4 == 1){
				//add into sum
				sum += (1.0/denominator);
			} else if (denominator % 4 == 3) {
				//subtract from sum
				sum -= (1.0/denominator);
			} else {
				System.out.println("impossible - error in logic");
			}
			pi = 4 * sum;
		}
		System.out.printf("The PI computed is: %.10f%n",pi);
		in.close();
	}
}