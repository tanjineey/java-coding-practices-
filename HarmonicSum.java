import java.util.Scanner;
public class HarmonicSum{
	public static void main(String[]args){
		//Declare variables 
		int maxDenominator;
		int denominator;
		double sumL2R = 0.0, sumR2L = 0.0, absDiff;
       Scanner in = new Scanner(System.in);

       //Prompt and read inputs as "int"
       System.out.print("Enter the max denominator: ");
       maxDenominator = in.nextInt();

       //compute sum from left-to-right in "double"
       for (denominator = 1; denominator <= maxDenominator; denominator++){
       	sumL2R += (1.0/denominator);
       }

       for (denominator = maxDenominator; denominator >= 1; denominator--){
       	sumR2L += (1.0/denominator);
       }

       //Compute the absolute difference in "double"
       absDiff = sumR2L - sumL2R;

       // if (absDiff < 0) absDiff = -absDiff;
       if(absDiff < 0)
       {
       	absDiff = -absDiff;
       }

       System.out.println("The sum from left-to-right is: " +sumL2R);
       System.out.println("The sum from right-to-left is: "+sumR2L);
       System.out.println("The absolute difference is: " +absDiff);

       in.close();
    }
}