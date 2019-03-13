package working_with_predicate_interface;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

// Functional Interface is an interface which allows one abstract 
// method within interface scope.There are some predefined functional 
// interface in java like Predicate.
// The Functional interface Predicate is defined in the java.util.Function
// package. It improves manageability of code.
// So we found that we have some methods like this is used to run unit tests
// 1. IsEqual(Object targetRef)
// 	  This returns a predicate that tests if two arguments are 
// 	  equal according to Objects.equals(Object,Object)
// 2. And(Predicate other)
// 	  Returns a composed predicate that represents a short-circuiting logical
// 	  AND of this predicate and another
// 3. Negate() Returns a predicate that represents the logical negation of the
//    predicate.
// 4. or(Predicate other )  Returns a composed predicate that represents a short-circuiting
// 	  logical OR of this predicate and another
// 5. test(T t) Evaluates this predicate on the given argument.boolean test(T t)
public class Main {

  public static void main(String[] args) {
	  // Simple 
	  Predicate<String> predicateString = s -> {
          return s.equals("Java Code Geek");
      };
      Predicate<Integer> greaterThanten = (i) -> i > 10 ;
      // Creating predicate 
      Predicate<Integer> lowerThantwenty = (i) -> i> 10;
      // Predicate chaining
      boolean result = greaterThanten.and(lowerThantwenty).test(16);
      System.out.println(result);
      
      Predicate<Integer> lesserthan = i -> (i < 18);  
      // predicate Or
      
      Predicate<String> hasLengthOf10 = new Predicate<String>() {
    	  //@Override
    	  public boolean test(String t)
    	  {
    		  return t.length() > 10;
    	  }
      };
      
      Predicate<String> containsLetterS = p -> p.contains("S");
      String containsS = "Andy";
      boolean outcome = hasLengthOf10.or(containsLetterS).test(containsS);
      System.out.println(outcome);
      String lengthGTThan10 = "Sample string to check the film name";
      boolean outcome1 = hasLengthOf10.negate().test(lengthGTThan10);
      System.out.println(outcome1);
      // Calling Predicate method 
      System.out.println(lesserthan.test(10));
      System.out.println(greaterThanten.test(20));
      System.out.println(" !! 'Predicate String Output !!");
      System.out.println(predicateString.test("Java Code Geek"));
  }
  
	
}
