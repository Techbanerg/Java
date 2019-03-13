package working_with_string_and_stringbuffer_string_builder;

public class Main {

	
/*
 * The  class string is a immutable.
 * The JVM creates a pool of strings objects 
 * that can be referenced by multiple variables across
 * the JVM. THe reference variable str1 and str2 refer
 *  to the same object  value "Java"
 *  Methods of a class string
 *  charAt
 *  indexOf
 *  substring
 *  trim
 *  replace
 *  length
 *  startsWith
 *  endsWith
 * 
 */
	public static void main(String[] args) {
		String name = new String("Paul");
		System.out.println(name.charAt(0));
		System.out.println(name.charAt(2));
		String something = new String("WHAT THE FISH IS THAT");
		System.out.println(something.indexOf("T"));
		System.out.println(something.indexOf("HT", 1));
		System.out.println(something.indexOf("A", 2));
		
		System.out.println(something.indexOf("F"));
		System.out.println(something.substring(4, 9));
		String sample1 = " FCUK ME ";
		System.out.print(sample1.trim());
		
	}

}


