import java.util.Scanner;
public class Bin2DecRepeat{
	public static void main(String[]args){
		final String SENTINEL = "-1";
		//Declare variables 
		String inBinStr;
		int binStrLen;
		int power;
		char binChar;
		int dec = 0;

		//Prompt and Read input as "string"
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a binary string: ");
		inBinStr = in.next();
		binStrLen = inBinStr.length();


		while (!inBinStr.equals(SENTINEL)){
		//continue ...
		  for(int exp = 0; exp < binStrLen ; ++exp){
			 binChar = inBinStr.charAt(exp);
			 power = binStrLen - exp -1;
			 if(binChar == '1'){
			   dec += Math.pow(2, power);
		     } 
	        }
		System.out.printf("The decimal equivalent is: %d%n", dec);
		System.out.println("");
		System.out.print("Enter a binary string: ");
		inBinStr = in.next();
		binStrLen = inBinStr.length();
		dec = 0;

		}
		if(inBinStr.equals(SENTINEL)){
		System.out.println("bye");		    
        }
        in.close();
        return;
    }
}