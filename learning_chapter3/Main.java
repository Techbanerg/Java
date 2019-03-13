package learning_chapter3;

public class Main {
	public static void main(String[] args)
	{
		Animal Obj = new Animal("Terrier", 2, 1, 4, 30);
			System.out.println(Obj.categorizeAnimal("bark"));
			
		Dog Obj1 = new Dog("labrador", 2, 1, 5, 45);
			System.out.print(Obj1.getBrain());
	}

}
