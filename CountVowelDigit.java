import java.util.Scanner;
public class CountVowelDigit{
	public static void main(String[]args){
		String inStr;
		int inStrLen;
		char inChar;
		int vowelCount = 0; 
		int digitCount = 0;
		double digitPercentage = 0, vowelPercentage = 0;

		Scanner in = new Scanner(System.in);
		System.out.print("Enter a String: ");
		inStr = in.next().toLowerCase();
		inStrLen = inStr.length();

        for(int inCharIdx = 0; inCharIdx < inStrLen; ++inCharIdx){
		    inChar = inStr.charAt(inCharIdx);
		    if (Character.isDigit(inChar)){
		      	digitCount++;
		      	digitPercentage = (digitCount*100.0) / inStrLen;
		    }else{
		      	switch(inChar){
		      		case 'a': case 'e': case 'i': case 'o': case 'u':
		      		  vowelCount++;
		      		  vowelPercentage = (vowelCount*100.0) / inStrLen;
		      		  break;
		      		default:
		      		  break;
		      	} 
		    }
		}
		System.out.printf("Number of vowels is: " + vowelCount + " (%.2f%%)%n", vowelPercentage);
		System.out.printf("Number of digits is: " + digitCount + " (%.2f%%)%n", digitPercentage);
	}
}