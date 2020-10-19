public class ThreeFiveSevenSum {  
   public static void main(String[] args) {
      int lowerbound = 1, upperbound = 1000;  
      int sumNum3  = 0;    
      int sumNum5 = 0; 
      int sumNum7 = 0;   
      int sumNumAll ;
      int number = lowerbound;
      while (number <= upperbound) {
         if (number % 3 == 0) && (number % 15 != 0) && (number % 21 != 0) && (number % 35 != 0) && (number % 105 != 0){  // Even
            sumNum3 += number;   
         } else if (number % 5 == 0) && (number % 15 != 0) && (number % 21 != 0) && (number % 35 != 0) && (number % 105 != 0){              // Odd
            sumNum5 += number;    
         } else if (number % 7 == 0) && (number % 15 != 0) && (number % 21 != 0) && (number % 35 != 0) && (number % 105 != 0){
            sumNum7 += number;
         ++number;  // Next number
      } 
      sumNumAll = sumNum3 + sumNum5 + sumNum7 ;
      

      // Print the result
      System.out.println(" The sum of all the numbers divisible by 3, 5 or 7 is " + sumNumAll)
   }
}