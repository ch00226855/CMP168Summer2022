# Week 1 Day 1
# Course Introduction and Review of Chapter 1 - 5

## Course Introduction
- Blackboard
- Github
- Dropbox
- Syllabus
- Textbook
- Eclipse IDE

## Chapter 1 Review: Introduction to Java
- Hello World program: class, method, statements, `public static void main(String[] args)`.

## Chapter 2 Review: Variables / Assignments

A **variable** is a named item used to hold a value. An **assignment** assigns a variable with a value. It means that the variable keeps the value until it is assigned again.

A **variable declaration** is a statement that declares a new variable, specifying the variable's name and type. Although not required, a value is often assigned to a variable when it is declared.

When an assignment statement executes, the processor writes the value intot he variable's memory location.

**Example:**
```java
int x;
int x = 5;
int y = x * 2;
double piVal = 3.14;
String myName = "Liang";
```

**Illustration:** p2.1.2

A variable may appear on both the left and the right side of an assignment statement. The variable on the right side uses the current value, while the variable on the left receives the updated value.

**Example:**
```java
int x = 1;
x = x * 20; // x is now 20
x = x * 2;  // x is now 40
```

**Exercise**: c2.2.4 Adding a number to a variable

**Solution**: `numPeople = numPeople + 5;`

**Common errors**:
- Read a variable that has not yet been assigned a value.
- Write an assignment statement in reverse, such as `numKids + numAdults = numPeople` or `9 = beansCount`.

### Input / Output Basics

- Print: `System.out.print()`(does not create a new line) and `System.out.println()` (creates a new line in the end).
- Read user input with `Scanner`. Example:
```java
import java.util.Scanner; // import Scanner class from java.util package

Scanner scnr = new Scanner(System.in); // create a scanner object that listens to keyboard input

int userInt = scnr.nextInt(); // use nextInt() method to read the next integer
```

### Identifiers
A name created by a programmer for an item like a variable or method is called an **identifier**. An identifier must
1. be a sequence of letters (a-z, A-Z), underscore (\_), dollar sign ($), and digits (0-9);
2. not start with a digit;
3. not be a **reserved word** such as `int` or `public`.

**Invalid identifers:** `2ndGrade`, `my name`, `Great!`, `static`.

- Identifiers are case sensitive.
- Java's naming convention for variables is **camel casing**, like `numApples` or `peopleOnBus`.
- A good practice is to create meaning ful identifier names that descirbes the variable's purpose.

**Exercise**: p2.3.2 Valid Identifiers

### Arithmetic Expressions
- `+, -, *, /`
- `()`
- **Modulo operator `%`**: 
  - checking divisibility: `x % 4` checks if x is divisible by 4.
  - even/odd: `x % 2` returns 1 if x is odd, returns 0 if x is even.
- **Compound operators `+=, -=, *=, /=`**
- **Increment operator `i++` and decrement operator `i--`**
- `int` vs. `double`
- Division by zero
- Format floating-point numbers: `System.out.printf("%.2f", myFloat); ` **Watch p2.7.5 Reducing the output of pi**.
- Scientific notation: `7.2e-4`
- Final variables: variables whose values cannot change after initialization.

**Exercise**: c2.7.1 Sphere volume.

### Math Methods
- A **method** is a list of statements executed by invoking the method's name. Such action is known as a **method call**. 
- Useful math methods: `Math.sqrt()`, `Math.pow()`, `Math.abs()`, `Math.random()`.
- Input values (called **arguments**) appear within `()`. 
**Exercise**: 2.10.3 Distance between two points.

### Type Conversions

A **type conversion** is a conversion of one data type to another, such as an int to double.

**Implicit Conversion**
- For an arithmetic operator like `+` or `*`, if either operand is a double, the other is automatically converted to double, and then a floating-point operation is performed.
- For assignments, the right side type is converted to the left side type if the conversion is possible without loss of precision. Example: `double x = 25;`

**Type Casting**
A **type cast** explicitly converts a value of one type to another type.

**Example**: 
```java
double myDouble = 5.2;
int myInt = (int)myDouble; // What value does myInt receive?
```
**Exercise**: c2.12.2 Computing average kids per family.



### Strings
A **string** is a sequence of characters.
- A string literal surrounds a character sequence with double quotes, as in `"Hello"` or `"52 Main St"`.
- Programmers use the **String data type** to store strings, such as `String movieTitle = "The Martian";`
- Read a string from input: 
  - `scnr.next()`: get a string without whitespaces
  - `scnr.nextLine()`: get all characters until a newline symbol

**Exercise**: c2.15.2 Reading and outputting strings.

## Chapter 3 Input / Output

### Output Formatting
A programmer can adjust the way the output appears, known as **output formatting**. This can be done with `System.out.printf()` or `String.format()`.

Example:
```java
String account = "Prime";
double total = 210.35;
int years = 5;

System.out.printf("The %s account saved you $%f over %d years\n",
    account, total, years);
```

- The first argument is a **format string** that contains serveral **format specifiers**.
- A format specifier specifies the type of value to print in its place. It begins with `%`.
  - `%d`: integer
  - `%f`: floating-point number
  - `%s`: string
- Read Table 3.2.2 Floating-point formatting, Table 3.2.3 Integer formatting, Table 3.2.4 String formatting

**Exercise**: c3.2.2 Printing a maximum number of decimals.

**Solution:** `System.out.printf("%.2f\n", outsideTemperature);`

## Chapter 4 Decision Branches
A **branch** is a sequence of statements only executed under a certain condition.
- If branch Example: p4.1.5 Computing absolute value
- If-else branch example: p4.1.9 Computing the max
- Multiple if-else branches: p4.1.11 Anniversaries

### Equality and Inequality Operators
- Equality: `==`
- Inequality: `!=`
- Relational operators: `>, <, >=, <=`
- Floating-point types should **not** be compared using `==` due to their imprecise presentations.
- String types should **not** be compared using `==`. Instead, use its `equals()` and `compareTo()` methods.

### Logical Operators
- And: `&&`
- Or: `||`
- Not: `!`

**Example**: p4.5.1 Logical operators

**Exercise**: c4.5.1 Detect number range.

## Chapter 5 Loops
A **loop** is a program structure that repeated executes the loop's statement (**loop body**) while the loop's expression is true.

**Example**: p5.1.4 Computing an average

### While Loop

```java
while(expression){
  // loop body
}
```

**Example**: p5.2.1 While loop.

### For Loop

```java
for (initialExpression; condition; updateExpression) {
  // loop body
}
```
**Example**: p5.4.1 For loop.

### Do-While Loops

```java
do {
  // loop body
} while (condition);
```

### Break and Continue

- A **break statement** in a loop causes an immediate exit of the loop. 
- A **continue statement** in a loop causes an immediate jump to the loop condition check.

A break statement or continue statement can sometimes yield a loop that is easier to understand.
