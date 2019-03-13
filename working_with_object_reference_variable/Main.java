package working_with_object_reference_variable;


class Rectangle{
	//static
	double length;
	double breadth;
	Rectangle(){
		length = 10.006;
		breadth = 15.009;
	}
}

public class Main {
	
	
	public static void main(String [] args) {
		/* What are object reference variables ?
		 * Objects are instances of classes, including both
		 * predefined and user-defined classes. For 
		 * a reference type in java, the variable name evaluates to
		 * to the address of the location 
		 * in memory where the object referenced by the variable is 
		 * stored. An object reference is in fact a memory address that points
		 * area where an objects' data is located
		 * 
		 * 
		 */
		Rectangle r1 = new Rectangle() ;
		// This is first object
		Rectangle r2 = r1 ;
		Rectangle r3 = new Rectangle();
		r1.length = 15.0002;
		System.out.println(r1.length);
		System.out.println(r2.length);
		System.out.println(r1.equals(r2));
		System.out.println(r3.equals(r1));
		
	}

}
