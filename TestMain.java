public class TestMain {
   public static void main(String[] args) {
      // Test constructors and toString()
      MyTriangle t1 = new MyTriangle(
         new MyPoint(1, 2),
         new MyPoint(3, 4),
         new MyPoint(5, 6));
      System.out.println(t1);  // toString()
      MyTriangle t2 = new MyTriangle(11, 12, 13, 14, 25, 26);
      System.out.println(t2);

      // Test methods
      System.out.printf("Perimeter is: %.2f%n", t1.getPerimeter());
      System.out.printf("Perimeter is: %.2f%n", t2.getPerimeter());
      System.out.println("Type is: " + t1.getType());
      System.out.println("Type is: " + t2.getType());
   }
}