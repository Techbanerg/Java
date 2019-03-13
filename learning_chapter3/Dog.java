package learning_chapter3;

public class Dog extends Animal {
	
	private int sized = 5;

	public Dog(String name, int brain, int body, int size, int weight) {
		super(name, brain, body, size, weight);
		this.size = sized;
		// TODO Auto-generated constructor stub
	}
    
	@Override
	public String getBrain() {
		String brain = "This Dog has brain";
		return brain;
		
	}
	
	

}
