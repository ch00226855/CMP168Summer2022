# Week 2 Day 1
# Chapter 14 Abstract Class and Interfaces

**Motivating Problem:** Suppose you lead a team of 5 programmers. Your team's task is to create all types of vehicles in a virtual reality software. Here are your expectations to your teammates:
- Junior programmer A: Create a `Car` class. A car should be able to accelerate, brake, and honk.
- Junior programmer B: Create a `Boat` class. A boat should be able to accelerate, brake, and honk.
- Junior programmer C: Create a `Motercycle` class. A motercycle should be able to accelerate, brake, and honk.

**How can you make sure that they meet your expectations?**

### Abstract Classes

An **abstract class** is a class that guides the design of subclasses but cannot itself be instantiated as an object. 

**Ex:** An abstract `Shape` class might also specify that any subclass must define a `computeArea()` method. (p14.1.1, p14.1.2)

- An **abstract method** is a method that is not implemented in the base class, thus all derived classes must override the function.
- An abstract method is denoted by the keyword `abstract` in front of the method signature. Ex: `abstract double computeArea();`
- A **concrete class** is a class that is not abstract, and hence can be instantiated.

**Why do we need abstract classes?**
- Force its subclasses to implement certain behavior.
- Allow methods to use abstract parameters.

### Syntax

![](https://i.stack.imgur.com/GDPOs.png)

UML uses *italics* for abstract classes and methods. (p14.3.3, p14.3.4)

**Example**: Pets
![](https://github.com/ch00226855/CMP168Summer2021/raw/main/images/chp10_AbstractClass.png)

In the `main` method of `Tester` class, do the following:

1. Create 2 instances of the Dog using the overloaded constructor
2. Create 2 instances of the Cat using the overloaded constructor
3. Try to create an instance of a Pet to see that it CANNOT be instantiated. Comment it out and move on to the next step
4. Create an array of type Pet and populate it with references to all the Dog and Cat instances created earlier
5. Iterate through the array and print the content of each element by using the toString() method
6. Call the play method on each element to ensure it performs the appropriate behavior

**Challenges:**
1. Modify `Pet`, `Dog` and `Cat` class so that there are counters on how many pets, dogs and cats created.
2. Define a method `letPetsPlay(Pet[])` that calls the `play()` method of all pets in the array.

### Interfaces

Java does not allow *multiple inheritance* to avoid inheriting a variable or method from two parent classes, where the method was defined differently. Instead, Java provides **interfaces** as another mechanism for programmers to state that a class adheres to rules defined by the interface.

- An interface can specify a set of abstract methods that do not have a method body.
- An implementing class must list the interface name after the keyword **implements**.
- A class can implement multiple interfaces using a comma separated list.
- An implementing class must override and implement all the abstract methods from the interfaces.

**Exercise**: p14.4.1 Comparison of interfaces and abstract classes

- UML Diagrams denote interfaces using the keyword interface, inside double angle brackets, above the class name.
- Classes that implement the interface have a dashed line with an unfilled arrow pointing at the interface.

**Exercise**: p14.4.2: UML interfaces

**Exercise**: Pets that can eat and speak
![](https://github.com/ch00226855/CMP168Summer2021/raw/main/images/chp10_Interface.png)

1. What happens if the abstract methods are not implemented?
2. Call `eat()` and `speak()` methods from a dog and a cat.
3. In the main method of `Tester` class, feed the same food to an array of pets, observe that cats and dogs metabolise differently.
4. Create another class that is not a pet, but can also eat and speak. 
5. Create an array of `FoodEater` and call the `toString()` method of all the elements.





