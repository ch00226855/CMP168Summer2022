# Week 1 Day 2
# Review of Chapter 7 - 8

## Review of Chapter 7 User-Defined Methods

A **method** is a named list of statements. It prevents the program from being large and confusing.

**Example:**

```java
c1 = (f1 - 32.0) * (5.0 / 9.0);
c2 = (f2 - 32.0) * (5.0 / 9.0);
c3 = (f3 - 32.0) * (5.0 / 9.0);
c4 = (f4 - 32.0) * (5.0 / 9.0);
c5 = (f5 - 32.0) * (5.0 / 9.0);
```


```java
public double F2C(f) {
  c = (f - 32.0) * (5.0 / 9.0);
  return c;
}

c1 = F2C(f1);
c2 = F2C(f2);
c3 = F2C(f3);
c4 = F2C(f4);
c5 = F2C(f5);
```

### Method definition

- A **method definition** consists of the new method's name and a block of statements. Ex: `public static double calcPizzaArea() { /* block of statements */ }`
- A **method call** is an invocation of a method's name, causing the method's statements to execute.
- The method's name can be any valid identifier. A **block** is a list of statements surrounded by braces.
- Methods must be defined within a class.
- The **access modifier** `public` indicates the method may be called from any class in the program.
- The access modifier `static` indicates the method only uses values that are passed to the method.

**Exercise**: p6.1.4 Method basics

### Return Statement

A method may return one value using a **return statement**. 
- A method can only return one item, not two or more. 
- The type of the returned value must be the same as the return type in the declaration.
- A return type of `void` indicates that a method does not return any value.

### Parameters

A programmer can influence a method's behavior via an input.

- A **parameter** is a method input specified in a method definition. Ex: A pizza area method might have diameter as an input.
- An **argument** is a value provided to a method's parameter during a method call. Ex: A pizza area method might be called as `calcPizzaArea(12.0)` or as `calcPizzaArea(16.0)`.
- A parameter is like a variable declaration. Upon a call, the parameter's memory location is allocated, and the parameter is assigned with the argument's value. Upon returning to the original call location, the parameter is deleted from memory.
- A method definition may have multiple parameters, separated by commas.

**Exercise**: c6.1.1 Basic method call, c6.1.3 Volume of a pyramid.

### Methods with Branches / Loops

A method's block of statements may include branches, loops, and other statements.

**Exercise**: c6.5.2 Popcorn

**Exercise**: c6.5.3 Shampoo

### Scope of Variable / Method Definitions

The name of a defined variable or method item is only visible to part of a program, known as the item's **scope**. 

- A variable declared in a method has scope limited to inside that method.
- A variable declared within a class but outside any method is called a **class member variable** or **field**. A field is visible from anywhere in the class.
- If a method's local variable (including a parameter) has the same name as a field, then in that method the name refers to the local item and the field is inaccessible.
- A method is visible to any other methods in the same class.
- Public variables and methods are visible to other classes in the program.

### Method Name Overloading
Sometimes it is convenient for a program to have two methods with the same name but differing in the number or types of parameters. This is known as **method overloading**. The compiler determines which method to call based on the argument types.

**Example**:
```java
public class DatePrinter {
   public static void printDate(int currDay, int currMonth, int currYear) {    
      System.out.print(currMonth + "/" + currDay + "/" + currYear);
   }

   public static void printDate(int currDay, String currMonth, int currYear) {
      System.out.print(currMonth + " " + currDay + ", " + currYear);
   }

   public static void main(String[] args) {
      
      printDate(30, 7, 2012);
      System.out.println();
      
      printDate(30, "July", 2012);
      System.out.println();
   }
}
```

**Exercise**: p6.10.1 Method name overloading

## Review of Chapter 8 Arrays

An **array** is a special variable having one name, but storing a list of data items, with each item being directly accessible. In java, an array is an ordered list of items of a given data type. Each item in an array is called an **element**.

### Array Declaration
```java
dataType[] arrayName = new dataType[numElements];
```
- The **\[ \]**(brackets) symbol after the data type indicates that the variable is an array reference.
- The **new** keyword creates space in memory to store the array with the specific number of elements. 

**Separate array declaration and array allocation**
A programmer can declare an array reference variable without allocating the array at that time and later assign the variable with an allocated array.

```java
int[] gameScores;
...
gameScores = new int[4];
```

**Exercise**: p7.2.3 Array basics

### Iterating Through Arrays

```java
for (i = 0; i < myArray.length; i++) {
   // Loop body accessing myArray[i]
}
```
**Exercise**: c7.4.5 Printing array elements separated by commas

### Modifying an Array with a Loop
A program may need to modify elements while iterating through an array.

**Exercise**: c7.7.1 Decrement array elements

**Exercise**: c7.7.2 Copy and modify array elements

### Array Parameters

Passing an array to a method is an example of passing a reference type variable rather than a primitive type variable

**Passing a primitive type variable to a method**
- Example: `int`, `double`, `boolean`, `char`
- A copy of the variable is passed to the method.
- Modifying the variable inside the method **does not** affect the original variable.
- The copy is removed from computer memory after the method call.

**Passing a reference type variable to a method**
- Example: `String`, `Scanner`, arrays
- A copy of the reference (address) is passed to the method. 
- Modifying the variable inside the method **does** affect the original variable.

**Example**: A method that swaps the first and last element of its array parameter.

### Oversized Arrays

An oversize array is an array where the number of elements used is less than or equal to the memory allocated. Since the number of elements used in an oversize array is usually less than the array's length, **a separate integer variable is used to keep track of how many array elements are currently used**. Oversize arrays are useful when the number of elements stored in the array is not known in advance, or when the number of elements stored in an array varies over time.

**Format**:
```java
int[] salesTransactions = new int[1000];
int salesTransactionsSize = 0;
```

**Example**: Add an element to an oversized array

Write a `addElement()` method that adds a new string to the end of an array of strings.
- The method should first check if there is room for the extra element.
- If the array is already full, create a new array of twice the size and copy all existing elements to it.
- The method should return the new array and the updated size.
