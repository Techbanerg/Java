package working_with_array_and_arraylist;
import java.util.ArrayList;
import java.util.ListIterator;

/* An array is an object that stores a collection of 
 * values. The fact that an array itself is an object is often overlooked.
 * An array is an object itself, it stores references to the data it stores
 * Array can store two types of data 
 * 1. A collection of primitive
 * 2. A collection of objects
 * The members of an array are defines in contiguous memory locations 
 * and hence offer improved access speed
 */

public class Main {
	public static void main(String Args[]) {
		int intArr [] = new int [] {4, 10, 16, 25, 99};
		String onjArray[] = new String [] {"Oendrila", "Jhinuk", "Sankha", "Johny"};
/*
 * In Java you can define one-dimensional and multidimensional array. A
 * one dimensional array is an object that refers to a collection of scalar
 * values. A two dimensioanl array reffered to as a mutlidimensioanl array
 * Multidimensional Arrays may or may not contain the same number of elements
 * in each row or column
 */
		//Declaration
		int intSampleArray [];
		String [] strSampleArray;
		int [] multiSampleArr [];

		//initialize
		intSampleArray = new int[2];
		strSampleArray = new String[4];
		multiSampleArr = new int[3][4];
		
// The array is an object , its allocated using keyword new
// followed by the type  of value  that it stores and the size
		for (int i=0; i<strSampleArray.length; i++) {
			strSampleArray[i] = new String("WTF" + i);
		}
		for ( String item : strSampleArray) {
			System.out.println(item);
		}
		/*
		 * When you inititlaize a two dimensioanl array. You can use nested  for loops
		 * to inititilaize it array elements
		 */
		int [] multiArr[];
		multiArr = new int [2][3];
		for (int i=0; i < multiArr.length; i++ ){
			for (int j=0; j < multiArr.length; j++){
				multiArr[i][j] = i+j;
			}
		}
		multiArr[0][0] = 100;
		multiArr[1][1] = 200;
		multiArr[0][1] = 300;
		multiArr[0][2] = 400;
		for (int f=0; f<multiArr.length; f++) {
			for(int j=0; j<multiArr.length; j++) {
				System.out.println(multiArr[f][j]);
	    System.out.println(multiArr[0][1]);
			}
		}
		/* combining array declaration allocation and initialization
		 * 
		 */
		int intarray [] = {0, 14};
		String[] strArray = {"Summer", "Winter"};
		int MultiArray[] [] = {{19, 18}, {3, 4 ,5}};
		
		int intArray2[] = new int [] {0, 1};
		// This does not compile
		//String[] strArray2 = new String[2] {"Summer", "Winter"};
		//int multiArray2[][] = new int[2] [] {0, 1}, {3, 4, 5}};
		
		int clonedArray [] =    intarray.clone();
		System.out.print(clonedArray.length + "\n" + clonedArray);
		// This is cloning an array
		/* you can compare an arraylist as a resizable array 
		 * Generaly if you create an array you cannot resize 
		 * an array , on the otherhand reiizable array  automatically increases 
		 * or decreases in size as elements are added 
		 * following propertises of an arraylist
		 * it allows null values to be added to it
		 * it implements all list operations(add, modify and delete values)
		 * it allows duplicates values to be added to it
		 * it maintains its insertion order
		 * You can use either iterator or listitereator to iterate over
		 * the items of an  ArrayList
		 */
		// missing object type on right will still compile.
		ArrayList<String> sampleArrList1 = new ArrayList<>();//<String>;
		sampleArrList1.add("sachin");
		sampleArrList1.add("dravid");
		sampleArrList1.add("sourav");
		sampleArrList1.add("sachin");
		sampleArrList1.remove("sachin");
		sampleArrList1.set(2, "Zaheer");
		for ( String item : sampleArrList1) {
			System.out.println(item+"\n");
		ListIterator<String> iterator = sampleArrList1.listIterator();
		while(iterator.hasNext()) {
			System.out.print(iterator.next());
		}
		
		ArrayList<StringBuilder> sampleArrList2 =  new ArrayList<>();
		sampleArrList2.add(new StringBuilder("One"));
		sampleArrList2.add(new StringBuilder("Two"));
		sampleArrList2.add(new StringBuilder("thirtyTwo"));
		sampleArrList2.remove(new StringBuilder("two"));
		sampleArrList2.remove(1);
		
		
		//Add all example
		
		ArrayList <String> arrl1 = new ArrayList <String>();
		arrl1.add(new String("Sunny"));
		arrl1.add(new String("Mia"));
		arrl1.add(new String("Daphine"));
		
		
		// Adding Multiple Elements to An ArrayList
		
		ArrayList <String> arrl2 = new ArrayList <String>();
		arrl2.addAll(0, arrl1);
		
		for (String element : arrl2) {
			System.out.print(element + "\n");
			
		short [] args = new short[] {50, 50};
		args[0] = 5;
		args[1] = 10;
		System.out.println("["+ args[0]+ "," +args[1]+"]");
		}
	}
		
   } 

}
