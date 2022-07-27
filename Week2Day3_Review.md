# Week 2 Day 3
# Mid-Term Review 

- Review class notes on Github
- Review homework assignments
- Practice exercises

### Exercise 1: Create a `Dog` class to represent a dog

- \- name : String
- \- weight: double
- \- height: double
- \- isVaccinated : boolean
- \- ageInDogYears : int

- \+ Dog() 
- \+ getName() : String
- \+ getWeight() : double
- \+ getHeight() : double
- \+ getIsVaccinated() : boolean
- \+ getAgeInDogYears() : int
- \+ setName(String name) : void
- \+ setWeight(double weight) : void
- \+ setHeight(double height) : void
- \+ setIsVaccinated(boolean isVacc) : void
- \+ setAgeInDogYears(int age) : void

### Exercise 2: Create a class to test the `Dog` class

Create a `DogTester` class with a main method so that it can be run.

In the main method of the Tester class, do the following:

1. Create 3 separate instances of a Dog using the default constructor.
2. Set the name of each individual Dog object by using the mutator methods.
3. Set the weight and height on 2 of the Dog instances to values you deem appropriate.
4. Use the accessor/getter methods to print the details from each of the Dog instances.
5. Set values on the other attributes for the Dog instances as well if you like.

Use if statements to test your methods and print “FAILED” or “SUCCESS” depending on whether the values set to the object’s attributes, match the values returned when using the accessor methods.

### Exercise 3: Expand the `Dog` class

Add to the class Dog from Exercise \#1

- \- isValid(int x) : boolean	// helper method, only positive values are valid

- \+ Dog( String name ) 
- \+ Dog( String name, double weight, double height ) 
- \+ Dog( String name, double weight, double height, boolean isVaccinated, int age ) 

- \+ toString() : String
- \+ equals(Object o) : boolean

- \+ speak() : void
- \+ sit() : void
- \+ growTaller() : void		//increase height by 1
- \+ growTaller(double growthAmount) : void

Use the helper method isValid(int x) to prevent invalid values from being set on a Dog, by adding logic to the body of the mutator methods as well as the overloaded constructors.

### Exercise 4: Use `static` variables and methods in a class

Add to the class `Dog`:

- \- **numDogs** : int       0 		// static controlled variable initial value = 0
- \- dogID: int		// controlled variable dependent upon numDogs


- \+ **getNumDogs()** : int		// static method
- \+ getDogID() : int

Update the default constructor for the Dog class, so that it increments the `numDogs` then assigns the value to `dogID`

Do not create mutator methods for either `numDogs` or `dogID` so that they cannot be modified outside the class.

### Exercise 5: Create subclss `ShowDog`

Create a class ShowDog that extends Dog
- \- numTrophies : int		//default value is 0

- \+ ShowDog() 		//default ShowDog name is “Show Dog Doe” //remember to always call the parent constructor 
- \+ ShowDog(String name) 	
- \+ ShowDog(String name, double wt,double ht, boolean isVac, int age, int numTrophies) 	

- \+ getNumTrophies() : int
- \+ setNumTrophies(int numTrophies) : void
- \+ addTrophy() : void		//increment numTrophies by 1

- \- isValid(int val) : boolean	//values >=0 are valid

- \+ toString() : String		// super.toString() + "\nShowDog: numTrophies=" + numTrophies
- \+ equals(Object o) : boolean

### Exercise 6: Test the `ShowDog` class

Create a `ShowDogTester` class with a main method so that it can be run.

In the main method of the Tester class do the following:

- Create 3 separate instances of the `ShowDog` using the each of the three constructors.
- Set the name of each individual ShowDog object by using the mutator methods from the parent class.
- Set the weight and height on 2 of the ShowDog instances to values you deem appropriate.
- Set the numTrophies and bestFeature on 2 of the ShowDog instances to values you deem appropriate.
- Create an array of ShowDog objects and initialize it to contain all the ShowDogs.
- Set values on the attributes for the ShowDog to valid or invalid values to test the mutator methods.
- Iterate through the array and use the `toString` methods to print the details from each of the ShowDog instances.

### Exericse 7: Abstract class `Person`

- \- name: String
- \- birthYear: int
- \+ Person()			// name = "", birthYear = 0
- \+ Person(String name, int birthYear)
- \+ getName():String
- \+ getBirthYear():int
- \+ setName(String name): void
- \+ setBirthYear(int year): void
- \+ *work()*: void

Create a subclass `DogTrainer` that extends `Person`
- Add an array `dogAry`
- Add methods `addDog(Dog)` and `removeDog(Dog)
- Implement `work()` method so that it prints "I am training xxx" for each dog in `dogAry`
- \+ equals(Object obj): 
- \+ toString(): String	
- \+ compareTo(Person p): int	//use the Comparable interface specification. Sort by birthYear.

### Exercise 8: Create `DogInfoIncompleteException`

Create `DogInfoIncompleteException` that extends `Exception`:
- Implement its default constructor
- Implement overloaded constructor `DogInfoIncompleteException(String)`

### Exercise 9: Exception handling
Modify the `addDog()` method so that it will throw `DogInfoIncompleteException` if the dog has default value on `name`, `weight`, `height`, `isVaccinated`, or `ageInDogYears`.

### Exercise 10: Test `DogTrainer` class

- Create 2 `Dog` instances with complete information.
- Create another `Dog` instance with incomplete information.
- Create a `DogTrainer`.
- Add all three `Dog` objects. Determine how to handle exceptions
- Call the `work()` method and check the output.


