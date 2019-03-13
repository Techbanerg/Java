package learning_chapter1;

public class employee {
	
	public int age ;
	public double height;
	public double weight;
	{
		System.out.println(" This is inititlaizer1");
	}
	// constructor default is employee.
	employee() {
		height = 186.15;
		weight = 80;
		age = 22 ;
		System.out.println("The default employee Height is: "+height+" and Age is : "+ age+" and Weight is : "+ weight);
	}
	// this is the initializer.
	{
		System.out.println("This is initializer2");
	}
	// overloaded constructor
	employee(String firstname, String lastname, int age, double height, double weight){
		String  fullname = (firstname +" "+lastname);
		int composite = (int)weight*age*(int)height;
		this.age = age;
		this.height = height;
		this.weight = weight;
		System.out.println("Name of the employee: "+fullname+" & composite value is: "+composite);
		
	}
	
	void setName(String name) {
		System.out.println(name);
	}
	
}
