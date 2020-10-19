import java.util.Scanner;
public class Multiple {
   public static void main (String[]args){
     int number1, number2;
     Scanner in = new Scanner(System.in);

     System.out.print("Enter 1st integer: ");
     number1 = in.nextInt();
     System.out.print("Enter 2nd integer: ");
     number2 = in.nextInt();
     if (number1 % number2 == 0)
        System.out.println( number1 + " IS a multiple of " + number2 );
     else 
        System.out.println( number1 + " IS NOT a multiple of " + number2 );
     in.close();
   }
}