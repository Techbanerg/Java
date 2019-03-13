package working_with_switch_case;

public class Main {
	/*  The Switch Statement to compare the
	 *  value of a variable with mutliple values . Fo
	 *  for each of these values you can define a set
	 *  a set  of statements to execute
	 *  
	 */
	public static void  cm(int value) {
		int marks = value;	
		switch(marks) {
				case 10: System.out.println(10);
					break;
				case 20:
					System.out.println(20);
					break;
				case 30:
					System.out.println(30);
					break;
				case 25:
					System.out.println(25);
				default:
					System.out.println("default");
		            break;
		}
	}
	
	public static void  SwitchMethod(String value) {
		String var = value;	
		switch(var) {
				case "male": System.out.println("Damn thats a boy");
					break;
				case "female": System.out.println("Thats a Girl Unortunately");
					break;
				case "ladyboy": System.out.println("Congrats you have a ladyboy");
					break;
				default:
					System.out.println("This is undermined sex, Its a Trump");
		            break;
		}
	}
  
	public static void main (String[] args)
	{
		cm(30);
		SwitchMethod("ladyboy");
		SwitchMethod("Justin");
			
	}
}
