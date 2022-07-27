package week2day3;

public class DogTrainerTester {

	public static void main(String[] args) {
		
		Dog dog1 = new Dog("Husky", 50.0, 22.0, true, 2);
		Dog dog2 = new Dog("Golden Retriever", 55, 20, true, 3);
		Dog dog3 = new Dog();
		
		DogTrainer john = new DogTrainer();
		
		try {
			john.addDog(dog1);
			john.addDog(dog2);
			john.addDog(dog3);
		} catch (DogInfoIncompleteException e) {
			System.out.println("ERROR in adding dogs: " + e.getMessage());
		}
		
		john.work();
		
		

	}

}
