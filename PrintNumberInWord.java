import java.util.Scanner;
public class PrintNumberInWord {
   public static void main (String[]args){
     int dayNumber;
     Scanner in = new Scanner(System.in);
     System.out.print("Enter a number: ");
     dayNumber = in.nextInt();
     switch (dayNumber){
        case 0: 
        System.out.println("ZERO");
        break;
        case 1: 
        System.out.println("ONE");
        break;
        case 2: 
        System.out.println("TWO");
        break;
        case 3: 
        System.out.println("THREE");
        break;
        case 4: 
        System.out.println("FOUR");
        break;
        case 5: 
        System.out.println("FIVE");
        break;
        case 6:
        System.out.println("SIX");
        break;
        case 7:
        System.out.println("SEVEN");
        break;
        case 8:
        System.out.println("EIGHT");
        break;
        case 9:
        System.out.println("NINE");
        break;
        default:
        System.out.println("OTHER");

     }

     System.out.println("bye!");
     in.close();
   }
	
}