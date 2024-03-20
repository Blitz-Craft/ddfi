# Wrapper Classes for Primitive Types
In Java, every variable is either a primitive type or a reference type.
Primitive types are the basic types of data:`byte`,`short`,`int`,`long`,`float`,`double`,`char`,`boolean`.

They are not objects and do not belong to any class.
However, Java is an object-oriented language, and there are times when we need to treat a primitive value as an object.
This is where wrapper classes come into play.

## What Are Wrapper Classes?
Wrapper classes provide a way to use primitive types as objects.
For each primitive type in Java, there is a corresponding wrapper class:
- **Byte** for byte
- **Short** for short
- **Integer** for int
- **Long** for long
- **Float** for float
- **Double** for double
- **Character** for char
- **Boolean** for boolean

These classes are part of the `java.lang` package, which is automatically imported into every Java program.

## Purpose and Use Cases
The primary purpose of wrapper classes is to "wrap" primitive values in an object so that the primitives can be included in activities reserved for objects, such as being added to Collections like `ArrayLists` or `HashMaps`. 
This is crucial for working with Java's object-oriented features, which do not recognize primitives.
Wrapper classes also come with useful utility methods for converting between types, comparing values, and converting values to and from strings. 
For instance, the `Integer` class has a method `parseInt` that converts a `string` to an `int`.

## Autoboxing and Unboxing
Java 5 introduced autoboxing and unboxing to make working with wrapper classes more seamless. 
Autoboxing is the automatic conversion that the Java compiler makes between the primitive types and their corresponding object wrapper classes. 
For example, when you assign an int value to an Integer object, Java automatically converts the int to an Integer:

```java
Integer myInt = 5; // Autoboxing from int to Integer
```
Unboxing is the reverse process, where the Java compiler converts an object of a wrapper class back to its corresponding primitive type:

```java
int myPrimitiveInt = myInt; // Unboxing from Integer to int
```

Example
Let's look at a simple example of using wrapper classes and autoboxing/unboxing in a real-world scenario:

```java
import java.util.ArrayList;

public class WrapperExample {
    public static void main(String[] args) {
        // Creating an ArrayList of Integer objects
        ArrayList<Integer> integerList = new ArrayList<>();

        // Autoboxing: The int value 10 is automatically converted to an Integer object
        integerList.add(10);

        // Unboxing: The Integer object is automatically converted back to an int
        int value = integerList.get(0);
        System.out.println("The value is: " + value);
    }
}
```
This example demonstrates how seamlessly Java handles the conversion between primitive types and their wrapper class objects, making it easier to work with collections and other object-oriented structures.

## When to Use Primitives vs. Wrapper Classes
Use Primitives when:
1. You Don’t Need null: Use primitives if your variable always has a value.
2. Speed and Memory: Primitives are faster and use less memory.
3. Simple Numeric Values: For basic numbers or boolean flags, primitives are the way to go.

Use Wrapper Classes when:
1. `null` is Needed: If a variable might not have a value, wrapper classes can hold `null`.
2. Using Collections: Java collections require objects, so use wrapper classes for primitives.
3. Be Careful With:
   - NullPointerExceptions: Turning a null wrapper into a primitive can crash your program.
   - Comparing Objects: Use `equals()` for wrapper classes, not `==`, which checks if they are the same object.

Conclusion
Wrapper classes bridge the gap between primitive types and object-oriented features in Java. 
They are crucial for working with collections, allowing null values, and providing additional methods. 
However, choosing between primitives and their wrapper classes depends on the context, such as performance considerations and the need for null values. 
Understanding and applying these principles will help you make the most of Java's type system.