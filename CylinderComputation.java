import java.util.Scanner;
public class CylinderComputation {
   public static void main (String[]args){
     double radius, height, baseArea, surfaceArea, volume;
     Scanner in = new Scanner(System.in);
     System.out.print("Enter the radius: ");
     radius = in.nextDouble();
     System.out.print("Enter the height: ");
     height = in.nextDouble();
     baseArea = Math.PI*radius*radius;
     System.out.printf("Base area is: %.2f%n", baseArea);
     surfaceArea = (2 * Math.PI * radius) + (2 * baseArea);
     System.out.printf("Surface area is: %.2f%n", surfaceArea);
     volume = (baseArea * height);
     System.out.printf("Volume is: %.2f%n", volume);
     in.close();
   }
}