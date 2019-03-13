package working_with_data_types;

public class Main {

/* Imagine that you have purchased a new home. you will like lt
 * need to buy different sized containers to store different types for food items
 * because one size can't fit all.
 * Different data types
 * Primitive data types in java
 * Literal values of primitive in Java
 * valid and invalid identifiers
 * Usage of Java operators
 * Modification of default operator precedence
 * via parentheses
 * Primitive Two Types Numeric and Boolean
 * Numeric two types Signed and Unsigned 
 * Signed two types Integer and Floating point
 * Integer of four types( byte, short, int, long)
 * Floating-point of two types (float, double)
 * Unsigned is of type character or Char
 * Boolean is of type Boolean
 * 
 * byte = 8bits(-128 to 127)
 * short = 16bits(-32768 to 32768)
 * int = 32bits(-2147483648 to 2147,483,647)
 * long = 64 bit( - 9223,372,036,854,775,808 to 9223,372,036,854,775,808)
 * 
 * short =2bytes
 * char  =2bytes
 * float =4bytes
 * int   =4bytes
 * long  =4bytes
 * byte  =1byte
 * double =8bytes
 * 
 * keeping small value in big contained (Widening or Upcasting)
 * No loss of information in implicit type casting
 * Smaller to Bigger Compiler will perform implicit type casting.
 * BSI LFD
 * Byte-> Short ->Int -> Long -> Float -> Double
 * 		  Char-> Short -> Int -> Long ->Float ->Double
 * 
 * smaller data type value to bigger 
 * data type variable
 *  compiler does implicit type casting
 *  
 *  In Java you can use the float and double 
 *  primitive data types to store decimal numbers. float requires
 *  less space than double but it can store a smaller
 *  range of values than double . float is less precise than double.
 *  float can't represent accurately some
 *  numbers even if they are in range 
 *  
 *  Explicit Type Casting:
 *  There might be a loss of information
 *  So complier  will throw compile time exception
 *  found int but required byte
 *  int x = 130;
 *  byte b = x;
 *  byte b = byte(x);
 *  
 *  Keeping Big value in small variable is
 *  called narrowing or Downcasting
 *  
 *  if you move from left to right implicit
 *  if you move from right to left
 *  Byte-> Short ->Int -> Long -> Float -> Double
 * 	Char-> Short ->Int -> Long -> Float -> Double
 * 
 */
	public static void main (String[] a) {
	
		float average = 20.129F;
		float orbit = 178.65F;
		
		double inclination2 = 1.20191799e2;
		char c1 = 122;
		char c2 = 'd'; // always use single quotes
	    char c3 = '\u0122';
	    System.out.println("C3 = "+ c3);
	    
	    int x = 130;
	    byte b = (byte)x;
	    System.out.println(1);
	    //char c5 = -122; // As mentioned earlier , char values are 
	    //unsigned integer values, so if you try to assign
	    //a negative number to one, the code wont compile.
	   
	    // What is Casting ?
	    /* Casting is  the forceful conversion of one data type to another data type
	     *  You can cast only compatible data types
	     *  for example you can cast a char to an int
	     *  and vice versa. but you cant cast an into to a boolean 
	     *  value or vice versa.
	     */  
	     //int exam-total = 1090; Hyphens arent allowed in the name of
	     // a java identifier.
	     int v = 20;
	     int var = v++;
	     int var1 = v--;
	     int var2 = --v;
	     int var3 = ++v;
	     int var6 = +v;
	     int var5 = --v * v++ + v-- - --v;
	     Boolean b1  = new Boolean("False");
	     System.out.println(b1);
	     System.out.println(var +" "+var1+" "+var2+" "+var3+" "+var6);
	     System.out.println(var5);
	}
	
	
	
}
