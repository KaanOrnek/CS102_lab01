/*
 * CS102-Section:1  -  Lab01 Assignment
 * Mehmet Kaab �rnek 21901637 
 * 08.10.2020
 * IntBag application with a menu.
 */
import java.util.Scanner;

public class IntBagMenu {
   public static void main( String [] args ) {
      Scanner scan = new Scanner(System.in);
      IntBag a = new IntBag();
      int menuSelection = -1;
      int valueSelection2 = -1;
      int valueSelection4_1 = -1;
      int valueSelection4_2 = -1;
      int valueSelection5 = -1;
      int valueSelection6 = -1;
      
      do {
         System.out.println("\n1.Create a new empty collection.\n2.Read a set of positive values into to collection.\n3.Print the collection of values.\n4.Add a value to the collection of values at a specified location.\n5.Remove the value at a specified location from the collection of values.\n6.Remove all instances of a value within the collection.\n7.Quit the program.");
         System.out.print(" Selection :" );
         menuSelection = scan.nextInt();
         
         if( menuSelection==1 ){
            a = new IntBag();
            System.out.println( "Bag is created." );
         }
         
         else if( menuSelection==2 ){
            System.out.println( "Please enter some values to be stored." );
            valueSelection2 = scan.nextInt();
            while( valueSelection2 != 0 ){
               valueSelection2 = scan.nextInt();
               if ( valueSelection2 > 0 )
                  a.add( valueSelection2 );
            }
            valueSelection2 =-1;
         }
         
         else if( menuSelection==3 )
            System.out.println( a );
         
         else if( menuSelection==4 ){
            System.out.print("Desired value:" );
            valueSelection4_1 = scan.nextInt();
            System.out.print("Desired index of this value:" );
            valueSelection4_2 = scan.nextInt();
            a.add( valueSelection4_1, valueSelection4_2 );
         }
         
         else if( menuSelection==5 ){
            valueSelection5 = scan.nextInt();
            a.remove( valueSelection5 );
            System.out.println( "Value on the given index is removed." );
         }
         
         else if( menuSelection==6 ) {
            System.out.print("Desired value:" );
            valueSelection6 = scan.nextInt();
            a.removeAll( valueSelection6 );
            System.out.println( "Given value is removed by all its indexes" );
         }
         
      }while( menuSelection != 7 );
   }
}