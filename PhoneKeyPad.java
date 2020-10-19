import java.util.Scanner;
public class PhoneKeyPad{
	public static void main(String[]args){
		String inStr;
		int inStrLen;
		char inChar;

		Scanner in = new Scanner(System.in);
		System.out.print("Enter a String: ");
		inStr = in.next().toLowerCase();
		inStrLen = inStr.length();

		System.out.print("The phone number is: ");


		for(int inCharIdx = 0; inCharIdx < inStrLen; ++inCharIdx){
			inChar = inStr.charAt(inCharIdx);

			  switch(inChar) {
			  	  case '1':
			  	    System.out.print(1); break;
				  case 'a': case 'b' : case 'c': case'2':
				    System.out.print(2); break;
				  case 'd': case 'e' : case 'f': case'3':
				    System.out.print(3); break;
				  case 'g': case 'h' : case 'i': case '4':
				    System.out.print(4); break;
				  case 'j': case 'k' : case 'l': case '5':
				    System.out.print(5); break;
				  case 'm': case 'n' : case 'o': case '6':
				    System.out.print(6); break;
			      case 'p': case 'q' : case 'r': case 's': case '7': 
				    System.out.print(7); break;
				  case 't': case 'u' : case 'v': case '8':
				    System.out.print(8); break;  
				  case 'w': case 'x' : case 'y': case 'z': case '9': 
				    System.out.print(9); break;  
				  case '0':
				    System.out.print(0);break;
				  default: 
				    System.out.print("error in input");
			    }			
		
		}

        
	}
}