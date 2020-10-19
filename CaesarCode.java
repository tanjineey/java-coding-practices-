import java.util.Scanner;
public class CaesarCode{
	public static void main(String[]args){
		String inStr;
		int inStrLen;
		char inChar, cipherText = 0;

		Scanner in = new Scanner(System.in);
		System.out.print("Enter a plaintext string: ");
		inStr = in.next().toUpperCase();
		inStrLen = inStr.length();

		System.out.printf("The ciphertext string is: ");
		for(int inCharIdx = 0; inCharIdx < inStrLen; ++inCharIdx){
		    inChar = inStr.charAt(inCharIdx);
		    
		    switch(inChar){
		    	case 'X': System.out.print("A"); break;
		    	case 'Y': System.out.print("B"); break;
		    	case 'Z': System.out.print("C"); break;
		    	default: inChar += 3; System.out.print(inChar);
		    }
		}
	}
}