import java.util.Scanner;
public class SwapIntegers {
   public static void main (String[]args){
     int number1, number2, temp;
     Scanner in = new Scanner(System.in);

     System.out.print("Enter first integer: ");
     number1 = in.nextInt();
     System.out.print("Enter second integer: ");
     number2 = in.nextInt();
     
     temp = number1;
     number1 = number2;
     number2 = temp;

     System.out.println("After the swap, first integer is: " + number1 + ", second integer is: " + number2);
     in.close();
   }
}