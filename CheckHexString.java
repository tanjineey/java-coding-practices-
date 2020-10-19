import java.util.Scanner;
public class CheckHexString{
	public static void main (String[]args){
		//Program to verify a hex string
		String inStr;
		int inStrLen;
		char inChar = 0;
		boolean isValid;
        
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a hex string: ");
        inStr = in.nextLine();
        inStrLen = inStr.length();


        isValid = true;
        for(int inCharIdx = 0; inCharIdx < inStrLen; ++inCharIdx){
        	inChar = inStr.charAt(inCharIdx);
        	if(!((inChar >= '0' && inChar <= '9') || (inChar >= 'A' && inChar <= 'F')
               || (inChar >= 'a' && inChar <= 'f'))) {
        		isValid = false;
        	    break;
        	}
        }
            if(isValid == false){
        	System.out.print("\"" + inStr + "\" is NOT a hex string");
            }
            if(isValid == true){
        	System.out.print("\"" + inStr + "\" is a hex string");
            }
	    in.close();
	}
}
