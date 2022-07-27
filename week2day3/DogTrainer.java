package week2day3;

import java.util.ArrayList;

/*
+ compareTo(Person p): int //use the Comparable interface specification. Sort by birthYear.
 */

public class DogTrainer extends Person implements Comparable<Person> {
	
	private ArrayList<Dog> dogAry = new ArrayList<Dog>();
	
	// ALTERNATIVELY:
	private Dog[] dogAry2 = new Dog[5];
	private int numDogs;
	
	public void addDog(Dog dog) throws DogInfoIncompleteException {
		
		// Check if the dog is missing information
		if (dog.getName().equals("") ||
			dog.getAgeInDogYear() == 0 ||
			!dog.isVaccinated() ||
			Math.abs(dog.getWeight()) < 0.001 ||
			Math.abs(dog.getHeight()) < 0.001) {
			throw new DogInfoIncompleteException("Dog information is incomplete");
		}
		
		dogAry.add(dog);
		
		// OR
		if (numDogs < dogAry2.length - 1) {
			dogAry2[numDogs] = dog;
			numDogs++;
		} else {
			System.out.println("Cannot add another dog!");
		}
	}
	
	public void removeDog(Dog dog) {
		dogAry.remove(dogAry.indexOf(dog));
		
		// OR
		int index = -1;
		for (int i = 0; i < numDogs; i++) {
			if (dogAry2[i].equals(dog)) {
				index = i;
				break;
			}
		}
		for (int i = index; i < numDogs-1; i++) {
			dogAry2[i] = dogAry2[i + 1];
		}
	}
	
	@Override
	public void work() {
		for (int i = 0; i < dogAry.size(); i++) {
			System.out.println("I am training " + dogAry.get(i).getName());
		}
		
		// OR
		for (int i = 0; i < numDogs; i++) {
			System.out.println("I am training " + dogAry2[i].getName());
		}
	}
	
	@Override
	public int compareTo(Person p) {
		if (this.getBirthYear() < p.getBirthYear()) {
			return -1;
		} else if (this.getBirthYear() == p.getBirthYear()) {
			return 0;
		} else {
			return 1;
		}
	}

}
