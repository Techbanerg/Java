package working_with_if_else_and_terneray_construct;

public class main {
	
	public static void main(String[] args) {
		/*The if else ternary constructs
		 * We will examine what happens when 
		 * these constructs are used with and 
		 * without curly braces {}.
		 * We will also cover nested if if-ese 
		 * and ternery constructs
		 */
		int score = 50;
		char result;
		if (score == 100)
			result = 'A';
		else if ( score == 50)
			result = 'B';
		else if (score == 10)
			result = 'C';
		else 
			result = 'F';
		// What happens if you don't define
		// the else statement for an if construct
		// its acceptable to define
		// one course of action for an if construct 
		
		boolean testValue = false;
		if (testValue == true)
			System.out.println("value is true");
		// an empty code block that follows if works
		// well 
		boolean testval = false;
		if (testval == true) {}
		else
			System.out.println("Podmara");
		
	}
}
