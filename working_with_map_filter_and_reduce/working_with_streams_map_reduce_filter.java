package working_with_map_filter_and_reduce;

import java.util.Collection;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.*;

public class working_with_streams_map_reduce_filter {
/*
 * A Stream is just a sequence of items . Although there are
 * lot of approaches to stream creation for now, well be focusing
 * only on generating streams from lists and arrays .Java8 every class
 * which allows you to convert its instance  into Streams objects
 * Therefore its trivially easy to convert any list into streams
 * .Convert an Arraylist of Integer objects into Stream.
 */
	public static void main(String args []) {
		List<Integer> list1 = new ArrayList <Integer>();
		list1.add(1);
		list1.add(2);
		list1.add(3);
		
		//convert to stream
		Stream<Integer> stream1 = list1.stream();
		
		System.out.println(stream1);
		System.out.println(list1);
		
		// if you prefer array over lists , you can use the stream
		// method available in the Arrays.
		
		Integer [] array1 = {7, 8, 9};
		Stream<Integer> stream2 = Arrays.stream(array1);
		System.out.println(stream2);
		
		//the map method
		//Once you have a Stream object you can use a
		//variety of methods to transform it into
		//map takes lambda expression as its only arguement
		// and uses it to change every individual in the stream
		// its return value is a new stream object
		
		String[] arr4 = {"kartik", "Neha", "arindam", "kris", "vinay"};
		Stream<String> str4 = Arrays.stream(arr4);
		Stream<String> str5 = str4.map(e -> e.replace("k", "K"));
			

	    // use a forEach loop to print stream
		str5.forEach(System.out::println);
		
		// Stream object needs to be converted to Array
		// to Array method does that for us
		
		//String [] myNewArray = str5.toArray(String[]::new);
		//Arrays.stream(myNewArray).forEach(System.out::println);
		
		
		// in the previous section you saw that the map method processes
		// every single element in a stream object . you might not
		// always want that . Sometimes you might work with ony a
		// subset of the elements  to do so you can use filter
		// Just like map method filter method expects a lambda expression as its
		// argument. However the lambda expression passed to it must always return
		// a boolean value which determines whether or not  the processed element 
		// should belong to the resulting Stream object
		
		// used for creating subset of an array
		Arrays.stream(arr4)
			.filter(s ->s.length() >4)
			.toArray(String[]::new);
			
		// The code above looks more concise than the code we wrote in the previous
		// example because I ve chaigned all the streammethods no need to store intermediate
		// objects
		
		//Reduction method
		
		int arr6 [] = { 10, 15, 25 };
		int sumation = Arrays.stream(arr6).sum();
		System.out.println(sumation);
		
	}
}
