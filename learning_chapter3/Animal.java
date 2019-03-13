package learning_chapter3;

public class Animal {
	
	private String name;
	private int brain;
	private int body;
	protected int size;
	private int weight;
	private String category;
	
	public Animal(String name, int brain, int body, int size, int weight) {
		this.name = name;
		this.brain = brain;
		this.body = body;
		this.size = size;
		this.weight = weight;
	}

	public String getBrain() {
		String s = String.valueOf(brain);
		return  s ;
	}
	public String categorizeAnimal(String sound) {
		if (sound.equals("bark")) {
			category = "This is a dog";
			return category;
		}
		else {
			category = "definitly not a dog";
			return category;
		}
		
		
	}
}
