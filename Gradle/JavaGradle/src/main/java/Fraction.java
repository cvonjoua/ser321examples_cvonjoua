import java.io.*;
/**
 * Purpose: demonstrate simple Java Fraction class with command line,
 * jdb debugging, and Ant build file.
 *
 * Ser321 Foundations of Distributed Applications
 * see http://pooh.poly.asu.edu/Ser321
 * @author Tim Lindquist Tim.Lindquist@asu.edu
 *         Software Engineering, CIDSE, IAFSE, ASU Poly
 * @version January 2020
 */
public class Fraction {

   private int numerator, denominator;

   public Fraction(){
      numerator = denominator = 0;
   }

   public void print() {
    System.out.print(numerator + "/" + denominator );
   }

   public void setNumerator (int n ){
      numerator = n;
   }

   public void setDenominator (int d) {
      denominator = d;
   }

   public int getDenominator() {
      return denominator;
   }

   public int getNumerator() {
      return numerator;
   }

   public static void main (String args[]) {
       if (args.length == 2) {
           int pDenom = 1;
           int pNum = 1;
           try {
                  // create a new instance
                  // Fraction *frac = [[Fraction alloc] init];
                  Fraction frac = new Fraction();
                  
                  pDenom = Integer.parseInt(args[0]);
                  pNum = Integer.parseInt(args[1]);
                  
                  // set the values
                  frac.setNumerator(pNum);
                  frac.setDenominator(pDenom);

           } catch (Exception e) {
                 System.out.println("Improper arguments, please ensure that arguments are of correct type.");
                 System.exit(1);
             } else {
             argX = 1;
             argY = 2;
         }
         
         frac.setNumerator(argx);
         frac.setDenominator(argY);

         // print it
         System.out.print("The fraction is: ");
         frac.print();
         System.out.println("");

      }catch(Exception e) {
         e.printStackTrace();
      }
   }
}

