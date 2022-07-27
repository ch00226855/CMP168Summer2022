package week2day3;

/*
 */

public class DogTester {

	public static void main(String[] args) {
		
		Dog husky = new Dog();
		Dog chihuahua = new Dog();
		Dog bulldog = new Dog();
		
		husky.setName("Guber");
		chihuahua.setName("Milo");
		bulldog.setName("Odin");
		
		husky.setWeight(50.0);
		husky.setHeight(22.0);
		
		chihuahua.setWeight(10.0);
		chihuahua.setHeight(12.0);
		
//		Dog[] dogs = new Dog[3];
//		dogs[0] = husky;
//		dogs[1] = chihuahua;
//		dogs[2] = bulldog;
		
		Dog[] dogs = {husky, chihuahua, bulldog};

		for (int i = 0; i < dogs.length; i++) {
			System.out.println(dogs[i].getName() + " | " +
					dogs[i].getWeight() + " | " +
					dogs[i].getHeight() + " | " +
					dogs[i].getAgeInDogYear());
		}
		
		husky.setAgeInDogYear(2);
		chihuahua.setAgeInDogYear(3);
		bulldog.setAgeInDogYear(5);
	
		
		if (husky.getAgeInDogYear() == 2) {
			System.out.println("The age of husky is correctly set.");
		} else {
			System.out.println("The age of husky is incorrectly set.");
		}
		
		if (chihuahua.getAgeInDogYear() == 3) {
			System.out.println("The age of chihuahua is correctly set.");
		} else {
			System.out.println("The age of chihuahua is incorrectly set.");
		}
		
		if (bulldog.getAgeInDogYear() == 5) {
			System.out.println("The age of bulldog is correctly set.");
		} else {
			System.out.println("The age of bulldog is incorrectly set.");
		}
		
		Dog husky2 = new Dog("Guber", 50.0, 22.0, false, 2);
		System.out.println(husky.toString());
		System.out.println(husky2.toString());
		
		System.out.println(husky.equals(husky2));
	}

}
