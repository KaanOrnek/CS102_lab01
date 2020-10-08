/*
 * CS102-Section:1 -  1st Lab Assignment
 * Mehmet Kaan Örnek
 * 07.10.2020
 * A class that allows user to collect non-negative integers and to put them in a desired order.
 */ 

public class IntBag {
   
   //properties
   
   public int[] bag;
   public final int INITIAL_SIZE = 4;
   public final int SENTINAL_VALUE = -1;
   
   
   //constructor
   
   public IntBag() {
      bag = new int[INITIAL_SIZE];
      bag[0] = SENTINAL_VALUE;
   }
   
   
   //methods
   
   public int getMaxSize(){
      return bag.length;
   }
   
   
   public int getCurrentSize(){
      int currentSize = 0;
      
      for( int i = 0; i < this.getMaxSize(); i++ ){
         if( bag[i] == SENTINAL_VALUE )
            currentSize = i + 1;
      }
      return currentSize;
   }
   
   
   public int getValueOfIndex( int index ){
      return bag[index];
   }
   
   public void expand(){
      int[] expandedBag = new int[ 2 * this.getMaxSize() ];
      
      for( int i = 0; i < this.getMaxSize(); i++ ){
         expandedBag[i] = bag[i];
      }
      bag = expandedBag;
   }
   
   
   public void add( int value ) {
      int a = this.getCurrentSize();
      
      if( this.getCurrentSize() < this.getMaxSize() ){
         bag[ a-1 ] = value;
         bag[ a ] = SENTINAL_VALUE;
      }
      else {
         this.expand();
         this.add( value );
      }
   }
   
   
   public void add( int value, int index ) {
      int size = this.getCurrentSize();
      
      if( this.getCurrentSize() < this.getMaxSize() && index < this.getCurrentSize() ){
         for( int i = size; i > index; i-- ) {
            System.out.println( i + "=i" );
            bag[i] = bag[i-1];
            if( i-1 == index ){
               bag[index] = value;
            }
         }
      }
      
      else if ( this.getCurrentSize() == this.getMaxSize() && index < this.getCurrentSize() ) {
         this.expand();
         this.add( value, index );
      }
      
      else {
         System.out.println( "Desired index does not exist." );
      }
   }
   
   
   public void remove( int index ){
      int size = getCurrentSize();
      
      if( index < size-1 || this.getCurrentSize()>1){
         bag[index] = bag[size-2];
         bag[size-2] = SENTINAL_VALUE;
         bag[size-1] = bag[size];
      }
      else {
         System.out.println( "Desired index does not exist" );
      }
      
   }
   
   
   public boolean doesBagHas( int value ){
      
      for( int i = 0; i< this.getCurrentSize()-1; i++ ){
         if( bag[i] == value )
            return true;
      }
      return false;
   }
   
   
   public void removeAll( int value ){
      int size = getCurrentSize();
      
      for( int i = 0; i < size; i++ ){
         if( bag[i] == value ){
            this.remove(i);
            i--;
         }
      }
   }
   
   
   public String toString(){
      String representation = "";
      
      for( int i = 0; i < this.getCurrentSize()-1 ; i++ ){
         representation += bag[i] + ", ";
      }
      return "[ " + representation + SENTINAL_VALUE + " ]";
   }
   
}