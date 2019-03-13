package working_with_autoboxing_and_unboxing;
import java.util.ArrayList;

// Autoboxing: Automatic conversion of primitive types to the object of their 
// corresponding wrapper classes is known as autoboxing. For example – conversion of 
// int to Integer, long to Long, double to Double etc.

// Unboxing: It is just the reverse process of autoboxing. 
// Automatically converting an object of a wrapper class to its corresponding primitive
// type is known as unboxing. For example – conversion of Integer to int, Long to long, 
// Double to double etc

// Primitive type	Wrapper class
// boolean	        Boolean
// byte	        	Byte
// char	        	Character
// float	        Float
// int	        	Integer
// long	        	Long
// short	        Short
// double	        Double
public class Main {
	public static void main(String [] args) {
		Integer i = new Integer(10);
        int i1 = i; 
        Integer inum = 3; //Assigning int to Integer: Autoboxing
        Long lnum = 32L; //Assigning long to Long: Autoboxing
        
        ArrayList<Integer> al = new ArrayList<Integer>();
        al.add(11); //Autoboxing - int primitive to Integer
        al.add(22); //Autoboxing
        System.out.print(al);
        System.out.print("\n"+inum+"\n");
        System.out.println(lnum+"\n");
        
        Integer num2 = new Integer(50);
        int inum2 = num2 ; //unobxing
        System.out.println(inum2+"\n");
        System.out.println(num2+"\n");
        
        
        System.out.println("Value of i: " + i); 
        System.out.println("Value of i1: " + i1);
	}

}
