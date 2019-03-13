package simple_lambda_expression;

public class Manager implements Custom {
		  public  int caluculateInhand(int Gincome, int Incometax) {
			  int inhand = Gincome-Incometax/12;
			  return inhand;
		  }
	      public void travel() {
	    	  System.out.println("see you soon");
	      }
		   
	 
}
