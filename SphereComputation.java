import java.util.Scanner;
public class SphereComputation {
   public static void main (String[]args){
     double radius, volume, surfaceArea;
     Scanner in = new Scanner(System.in);
     System.out.print("Enter the radius: ");
     radius = in.nextDouble();
     surfaceArea = 4*Math.PI*radius*radius;
     System.out.printf("Surface Area is: %.2f%n", surfaceArea);
     volume = (4 * Math.PI * radius * radius * radius)/3;
     System.out.printf("Volume is: %.2f%n", volume);
     in.close();
   }
}