package Java24;

import java.util.Scanner;

public class PiTest2 {
public static void main(String[] args) {
   Scanner in = new Scanner(System.in);
   double n, i, j;     // Number of iterations and control variables
   double f;           // factor that repeats
   double pi = 1;
      
   System.out.printf("Approximation of the number PI through the Viete's series\n");
   System.out.printf("\nEnter the number of iterations: ");
   if (!in.hasNextDouble()) {
       String error = in.next();
       System.err.println(error + " is not a double");
       return;
   }
   n = in.nextDouble();
   System.out.printf("\nPlease wait. Running...\n");   
    
   for(i = n; i > 1; i--) {
      f = 2;
      for(j = 1; j < i; j++){
         f = 2 + Math.sqrt(f);
      }
      f = Math.sqrt(f);
      pi = pi * f / 2;
   }
   pi *= Math.sqrt(2) / 2;
   pi = 2 / pi;
   
   System.out.printf("\nAproximated value of PI = %f\n", pi);  

}
}