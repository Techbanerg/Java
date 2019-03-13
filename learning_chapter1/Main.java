package learning_chapter1;
import java.io.*;
import java.util.*;
import java.lang.Math;

/* This tutorial is about Constructor, Initializer, overloaded methods, overloading constructors*/


public class Main {
	public static void main(String[] args)
	              throws IOException
	{
		
		/* This tutorial is about arraylist
		ArrayList in Java , ArrayList is a part of collection framework and is present in java.util package.
		It provides us dynamic arrays in Java. Though, it may be slower than standard arrays but can be helpful
		in programs where lots of manipulation in the array is needed.ArrayList inherits AbstractList class and 
		implements List interface.ArrayList is initialized by a size, however the size can increase if collection 
		grows or shrunk if objects are removed from the collection. Java ArrayList allows us to randomly access the list.
		ArrayList can not be used for primitive types, like int, char, etc. We need a wrapper class for such cases (see this for details).
		ArrayList in Java can be seen as similar to vector in C++.
		Now primarily the Java ArrayList can constitute of both Constructors and Methods. 
		Below mentioned is a list of few constructors and methods along with there use and functions.
		Constructors in Java ArrayList:
		ArrayList(): This constructor is used to build an empty array list
		ArrayList(Collection c): This constructor is used to build an array list initialized with the elements from collection c
		ArrayList(int capacity): This constructor is used to build an array list with initial capacity being specified
		*/
		ArrayList<String> state = new ArrayList<String>();
		state.add("Statefull");
		state.add("Stateless");
		System.out.println("list of cars:" + state.toString());
	    
		/* Type Casting in Java
		   Type casting is used to convert an object or variable of one type into another.
	    */
		Integer integer = new Integer(10);
        Float floatt = new Float(20F);
        System.out.println(floatt);

        /* this is not a cast - error
           integer = float; //compiler error - incompatible types
           integer = (Integer) float;//compiler error - inconvertible types
           upcast - widening conversion
        */
        Object obj = (float)integer; //no explicit cast required
        System.out.println(obj);

        //downcast - narrowing conversion
        Integer in = Math.round(floatt); //only subtype
        System.out.println(in);
        
        //Creating object emp1 with default constructor
        
        employee emp1 = new employee();
        System.out.println(emp1.age);
        
        //Creating object with overloaded constructor
        
		employee emp2 = new employee("podmarani", "ghosh", 45, 156, 90);
        
		// Accessing class methods
		employee emp3 = new employee ();
        emp3.setName("Dhamna");
	}
	
}
