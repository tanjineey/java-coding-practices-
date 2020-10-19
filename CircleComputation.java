import java.util.Scanner;
public class CircleComputation {
   public static void main (String[]args){
     double radius, circumference, area, diameter;
     Scanner in = new Scanner(System.in);

     System.out.print("Enter the radius: ");
     radius = in.nextDouble();
     diameter = 2*radius;
     System.out.printf("Diameter is: %.2f%n", diameter);
     circumference = Math.PI*2*radius;
     System.out.printf("Circumference is: %.2f%n", circumference);
     area = Math.PI*radius*radius;
     System.out.printf("Area is: %.2f%n", area);
     in.close();
   }
}