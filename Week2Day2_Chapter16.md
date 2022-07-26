# Week 2 Day 2
# Chapter 16 Exceptions

## ArrayList

The array data type is invenient in the following ways:
- The size of the array must be determined up front.
- The size of the array cannot be changed afterwards.
- There lacks methods for searching, sorting, or replacing elements.

An `ArrayList` is an built-in data type that supports the above needs.

**Syntax**
```java
import java.util.ArrayList;

...
ArrayList<Integer> vals = new ArrayList<Integer>();

vals.add(31);
...
```

**Remark** `ArrayList` only support reference types. Primitive types must use there corresponding **wrapper** class as the type.

**Common ArrayList methods**: Table 19.2.1

**Iterating through an ArrayList**

```java
for (int i = 0; i < aryList.size(); i++) {
  // do something with aryList.get(i)
}
```

**Remark**: use `ArrayList` in the project!



## The Comparable Interface
It is a common programming task to sort elements of an array or other data collections. In order for the built-in `sort()` method to work, objects created from a user-defined class must implement the `Comparible` interface, which declares the `compareTo()` method. Here we study how to implement `Comparible`, and in Chapter 19 we will see how a Java *arrayList* can sort comparible objects.

**Syntax**:
```java
public class ClassName implements Comparable<Type> {
   ...
   @Override
   public int compareTo(Type obj) {
   
      if (...) {
         return 1;
      } else if (...) {
         return 0;
      } else {
         return -1;
      }
   }
}
```

**Example**: Figure 14.5.2 Making `EmployeeData` comparible.

**Example**: 
- Create class `Course` including `courseDept` and `courseNum`. Implement interface `Comparible` so that its `compareTo()` method first compare `courseDept`, and then compare `courseNum`.
- Create class `Person` and derived class `Employee`. `Person` implements `Comparible` such that objects are compared by `birthYear`. `Empolyee` also implements `Comparible` so that employees are compared by `employeeID`. 
- Create a `Person` object and an `Employee` object.
   - Can they be compared?
   - Which implementation is used when comparing them?

## Chapter 16
**Error-checking code** is code a programmer writes to detect and handle errors that occur during program execution. An exception is a circumstance that a program was not designed to handle, such as if the user enters a negative height.

- Figure 11.1.1: BMI example without error checking
- Figure 11.1.2: BMI example with error-checking code but without using exception-handling constructs

**Exception-handing constructs**
```java
...
try {
   ...   
   // If error detected
      throw objectOfExceptionType;
   ...
}
catch (exceptionType excptObj) {
   // Handle exception, e.g., print message
}
...
```
- A `try` block surrounds normal code. It contains one or more `throw` statements.
- If a `throw` statement is reached, execution jumps immediately to the end of the try block.
- A `catch` clause immediately follows a `try` block to handle exceptions.
- There can be multiple `catch` blocks to handle different exceptions.

### The Exception Class
Java offers several built-in `Throwable` types like `Error` and `Exception`. 
- An `Exception` object is throwed when an event (such as `IndexOutOfBoundsException`) occurs that disrupts the normal flow of instructions.
- The `Exception` class has a constructor that can take in a string, as in `throw new Exception("Invalid weight.");`
- An `Exception` object can return the string using the `getMessage()` method.
- An `Exception` object has a `printStackTrace()` method to indicate the location of the exception.
- `Error` objects are more severe and should be avoided. Example: `OutOfMemoryError`, `StackOverflowError`.

**Why use `Exceptions`?**
- Separate exception handling code from ordinary code.
- Provide flexibility on how exceptions can be handled.
- Group and differentiate exceptions based on their types.

**Example**: Figure 16.1.3 BMI example with error-checking code using exception-handling constructs.

**Exercise**: p16.1.3 Exception Basics

**Exercise**: Define class `WeightException` to include string `Invalid weight` in the message by default. Use this exception in the BMI program.

**Common exception types**: Table 16.1.1

### Exception with Methods

If a method throws an exception, it can choose to handle it itself; alternatively, it can throw it outside so that the exception can be handled depending on where the method is called.

**Example**: BMI example using exception-handling constructs along with methods.
- If a method adds `throw Exception` on the first line of its definition, it doesn't need to handle the exception within the method.
- The method that calls an exception-throwing method may handle the exception or throw it even further.
- A common error is forgetting to enclose code that may throw exceptions with try-catch constructs. It will result in a compiler error.

**Unchecked Exceptions**: Table 16.2.2 These exceptions do not require programmers to handle specifically. They should be avoided from the program.

### Multiple Catch Blocks

Different throws in a try block may throw different exception types. Multiple handlers may exist, each handling a different type. The first matching handler executes; remaining handlers are skipped.

**Syntax**:
```java
try {
   ...
   throw objOfExcptType1;
   ...
   throw objOfExcptType2;
   ...
   throw objOfExcptType3;
   ...
}
catch (ExcptType1 excptObj) {
   // Handle type1
}
catch (ExcptType2 excptObj) {
   // Handle type2
}
catch (Throwable thrwObj) {
   // Handle others (e.g., type3)
}
```

A common error is to place a catch block intended to handle exceptions of a base class before catch blocks intended to handle exceptions of a derived class, resulting in a compiler error with a message such as: "exception has already been caught".

### The `finally` Block

The `finally` block can be provided after the last `catch` block.
```java
try {
   // risky code
} catch (Exception e) {
   // handle the exception
} finally {
   // clean up code such as closing data streams, free memory spaces
}
```
- The finally block always executes regardless of an exception being thrown or not.
- It is used to make sure the program still does some essential operations even if something unexpected happens.
