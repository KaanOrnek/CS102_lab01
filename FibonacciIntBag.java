/*
 * CS102-Section:1  -  Lab Assignment 1
 * Mehmet Kaan Örnek 21901637
 * 07.10.2020
 * IntBag class usage with Fibonacci nums.
 */

public class FibonacciIntBag {
   
   public static void main( String[] args ){
      IntBag Fibo = new IntBag();
      int firstFibo = 0;
      int secondFibo = 1;
      int sum = 0;
      
      for( int i = 1; i < 40; i++ ){
         sum = firstFibo + secondFibo;
         Fibo.add( sum );
         firstFibo = secondFibo;
         secondFibo = sum;
      }
      System.out.println( Fibo );
   }
}