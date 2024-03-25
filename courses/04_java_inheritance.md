# Java Inheritance

## 1. Understanding Inheritance
Inheritance is a feature in object-oriented programming (OOP) where a class (called a subclass) inherits features from another class (called a superclass). 
It's a key part of Java, making it easier to reuse code, maintain consistency, and extend software capabilities.

### Key Benefits
**Code Reuse**: Inheritance lets subclasses use fields and methods from superclasses, reducing repeated code.

**Easy Updates**: Changes to a superclass affect all subclasses, simplifying updates.

**Expandability**: Adding new features is easier with inheritance, as subclasses can add or modify functionalities without altering existing code.

**Polymorphism**:  Allows an object be treated as an instance of its superclass, enabling flexible and interchangeable use of objects.

### Why It Matters
Inheritance encourages organizing code in a hierarchical structure, mirroring real-world relationships and making code more logical and easier to manage. 
However, it's crucial to use inheritance wisely to avoid creating overly complex and tightly coupled code.

## 2. Basic Concepts of Inheritance in Java
### The `extends` Keyword
In Java, the `extends` keyword is used to declare a class as a subclass of another class. 
This establishes an inheritance relationship between the two classes, allowing the subclass to inherit fields and methods from its superclass.

Example:
```java
class Vehicle {
// Vehicle class members
}

class Car extends Vehicle {
// Car inherits from Vehicle
}
```
In an inheritance hierarchy:
- The superclass (or parent class) is the class from which properties and methods are inherited.
- The subclass (or child class) is the class that inherits those properties and methods.
- Key Point: A subclass can add its own fields and methods in addition to the inherited ones.

### Constructors and Inheritance

When a subclass object is created, Java requires that a constructor from its superclass be called first to ensure proper initialization across the entire object hierarchy. 
This can be done in two ways:
- **Explicitly**, using the `super()` keyword within the subclass constructor to invoke a specific superclass constructor.
- **Implicitly**, if no `super()` call is made, Java automatically inserts a call to the no-argument constructor of the superclass.

#### Default Constructors and Inheritance
The role of default constructors becomes particularly relevant in the context of inheritance:
If a superclass only has a default constructor (either explicitly defined or provided automatically by Java in the absence of any constructors), a subclass can be instantiated without an explicit call to `super()`, as Java will automatically call the superclass's default constructor.
However, once any constructor is explicitly defined in a class, Java no longer provides a default constructor for that class. 
Subclasses of such a class must then explicitly call one of the defined superclass constructors using `super()`.

Example
```java
class Superclass {
// Java provides an implicit default constructor.
}

class Subclass extends Superclass {
    Subclass() {
        super(); // Implicit call to the Superclass's default constructor.
    }
}
```
In this example, `Superclass` does not explicitly define a constructor, so Java provides a default constructor. 
Subclass explicitly calls the superclass's constructor with `super()`, though this call would be inserted automatically if omitted.

#### Ensuring Proper Initialization
The requirement to invoke a superclass constructor ensures that each part of an object, from the top of the hierarchy down, is correctly initialized before the subclass constructor's body executes. 
This mechanism underpins Java's inheritance model, promoting encapsulation and reducing initialization errors.

### Method Overriding
In Java, method overriding is a feature that allows a subclass to provide a specific implementation for a method that is already defined in its superclass. 
This mechanism is a cornerstone of polymorphism, enabling Java applications to execute different code depending on the object's runtime type that invokes the method.

#### Key Concepts of Method Overriding
- **Overriding a Method**<br/> 
A subclass overrides a method from its superclass by declaring **a method with the same name, return type, and parameters**.


- **`@Override` Annotation**<br/> 
  While not required, using the `@Override` annotation helps to identify overriding methods and catches errors, such as typos or incorrect method signatures, at compile time.


- **Accessing Superclass Methods**<br/> 
The `super` keyword is crucial when overriding methods. 
It allows the subclass method to call the superclass's version of the method. 
This is often used to extend the original method's behavior rather than replace it entirely.


- **First Statement Rule for Constructors**<br/>
Unlike constructors, where `super()` must be the first statement, method overriding has no such restriction. 
A subclass can call `super.methodName()` at any point in the method to incorporate the superclass's behavior.

Example of Method Overriding:

```java
class Vehicle {
    void startEngine() {
        System.out.println("Vehicle's engine starts.");
    }
}

class Car extends Vehicle {
    @Override
    void startEngine() {
        super.startEngine();  // Calls the superclass (Vehicle) method
        System.out.println("Car's engine roars to life.");
    }
}

public class TestOverride {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.startEngine();  // Outputs "Vehicle's engine starts." followed by "Car's engine roars to life."
    }
}
```

### `final` Methods and Classes
The final keyword is a powerful feature in Java that provides additional control over the inheritance and polymorphism mechanisms. 
When applied to methods and classes, it restricts how they can be used in subclasses, ensuring the integrity and security of your code.

#### `final` Methods
Methods declared as `final` cannot be overridden by subclasses. 
This is particularly useful when you want to ensure consistent behavior across all instances of a class, regardless of the subclass being used. 
A `final` method guarantees that the method's logic remains unchanged, preserving the intended functionality.

Example:
```java
class Vehicle {
    final void registerVehicle() {
        System.out.println("Vehicle registered");
    }
}

class Car extends Vehicle {
// This would cause a compile-time error:
// void registerVehicle() { ... }
}
```
In this example, any attempt to override `registerVehicle()` in `Car` or any other subclass of `Vehicle` would result in a compile-time error.

#### `final` Classes
A class declared as final cannot be extended. 
This means you cannot create a subclass from a final class. 
Marking a class as final can be a strategic decision to prevent alteration or extension of the class's behavior, ensuring the class remains secure and used as intended.

Example:

```java
final class LoginToken {
    private String token;

    LoginToken(String token) {
        this.token = token;
    }

    // Token handling methods
}

// Attempting to extend this class would result in a compile-time error:
// class ExtendedLoginToken extends LoginToken { ... }
```
In this example, `LoginToken` is designed to be a standalone entity that should not be extended. 
Marking it as final ensures that the security and integrity of the token handling are preserved.

### Polymorphism and Object References
In Java, you can use a reference variable of a superclass type to point to an object of any subclass derived from that superclass. 
This feature is crucial for implementing polymorphism in object-oriented programming. 
It allows a single variable to hold objects of different subclasses, and the specific method that gets executed depends on the actual object's class type.

Example of Polymorphism and Object References
```java
class Vehicle {
    void startEngine() {
        System.out.println("Vehicle's engine starts.");
    }
}

class Car extends Vehicle {
    @Override
    void startEngine() {
        System.out.println("Car's engine roars to life.");
    }
}

public class TestPolymorphism {
    public static void main(String[] args) {
        Vehicle myVehicle = new Vehicle();
        Vehicle myCar = new Car();

        myVehicle.startEngine();  // Outputs: Vehicle's engine starts.
        myCar.startEngine();      // Outputs: Car's engine roars to life.
    }
}
```
In the `TestPolymorphism` class:<br/>
- `myVehicle` is a reference of type `Vehicle` and points to an instance of `Vehicle`. 
   When `startEngine()` is called on `myVehicle`, it executes the method defined in the `Vehicle` class.

- `myCar` is also a reference of type `Vehicle`, but it points to an instance of `Car`. 
   When `startEngine()` is called on `myCar`, Java dynamically determines that `myCar` actually refers to a `Car` object and therefore calls the overridden `startEngine()` method in the `Car` class.

This behavior showcases polymorphism in action. Despite `myCar` being a `Vehicle` reference, Java uses the actual object type (`Car`) at runtime to determine which `startEngine()` method to execute. 
This allows to write more general and flexible code, where methods of subclass objects can be called through references of their superclass type, leveraging the power of polymorphism to enhance code reusability and scalability.

### Casting in Java
In Java, casting is the process of converting one object reference type into another. 
When working with object-oriented programming, especially within class hierarchies, casting becomes crucial for manipulating references and invoking the correct methods.
There are two main types of casting in Java: upcasting and downcasting.

#### Upcasting
Upcasting is the automatic conversion of a subclass type to a superclass type. 
This type of casting is safe and implicit because the subclass is always an instance of its superclass. 
Upcasting is commonly used in polymorphism, where a subclass object is treated as an instance of its superclass, allowing for generalized code that can work with any subclass.

Example:

```java
class Animal {
    void eat() {
        System.out.println("This animal eats food.");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("The dog barks.");
    }
}

public class TestCasting {
    public static void main(String[] args) {
        Dog myDog = new Dog();
        Animal myAnimal = myDog; // Upcasting: Dog -> Animal
        myAnimal.eat();
    }
}
```
#### Downcasting
Downcasting is the conversion of a superclass type to a subclass type. 
Unlike upcasting, downcasting is explicit and can be risky, as it requires an explicit type cast in the code. 
Downcasting is necessary when you need to access subclass-specific methods or fields from a reference that is currently of a superclass type.

Example:

```java
class Animal {
    void eat() {
        System.out.println("This animal eats food.");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("The dog barks.");
    }
}

public class TestCasting {
    public static void main(String[] args) {
        Animal myAnimal = new Dog(); // Upcasting
        Dog myDog = (Dog) myAnimal;  // Downcasting
        myDog.bark();
    }
}
```

When performing downcasting, it's essential to ensure that the object being cast is actually an instance of the target subclass to avoid a ClassCastException. 
The instanceof operator can be used to check this:

```java
class Animal {
    void eat() {
        System.out.println("This animal eats food.");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("The dog barks.");
    }
}

public class TestCasting {
    public static void main(String[] args) {
        Animal myAnimal = new Dog(); // Upcasting
        if (myAnimal instanceof Dog) {
            Dog myDog = (Dog) myAnimal;
            myDog.bark();
        } else {
            System.out.println("The object is not an instance of Dog.");
        }
    }
}
```

The previous example can be simplified by using `pattern variable`:
```java
public class TestCasting {
    public static void main(String[] args) {
        Animal myAnimal = new Dog();
        if (myAnimal instanceof Dog myDog) {
            myDog.bark();
        } else {
            System.out.println("The object is not an instance of Dog.");
        }
    }
}
```

#### Best Practices and Considerations
- **Use instanceof Before Downcasting**:<br/>
    Always use instanceof to check the type before performing a downcast to prevent runtime exceptions.


- **Prefer Polymorphism to Casting**:<br.>
    Whenever possible, design your code to make use of polymorphism and method overriding to avoid the need for explicit casting.


- **Understand the Class Hierarchy**:<br/> 
    Be mindful of the class hierarchy when casting, especially in complex hierarchies, to ensure that your casts are logical and safe.

## 3. Limitations of Inheritance in Java
Java's approach to inheritance includes a key restriction: it does not support multiple inheritance from classes. 
This means that a class in Java can only extend one other class. 
By disallowing multiple class inheritance, Java addresses and avoids the complexity and ambiguity issues—such as the "Diamond Problem"—that can arise in languages that permit a class to inherit directly from more than one class.

The "Diamond Problem" surfaces when a class inherits from two classes that both inherit from the same superclass. 
The ambiguity arises when there is a method in the superclass that both parent classes have overridden, and now the subclass needs to decide which version of the method to inherit.
This problem occurs also with property when two parents class define a property with the same name. 

Example of Diamond problem

```
        Vehicle
       /       \
      /         \
    Car       Truck
      \         /
       \       /
    AmphibiousVehicle
```

```java
class Vehicle {
    String fuelType() {
        return "Fuel type is generic";
    }
}

class Car extends Vehicle {
    @Override
    String fuelType() {
        return "Fuel type is petrol";
    }
}

class Truck extends Vehicle {
    @Override
    String fuelType() {
        return "Fuel type is diesel";
    }
}

// Hypothetical scenario in a language that allows multiple inheritance
// This code does not work in Java as Java does not support multiple inheritance of classes
class AmphibiousVehicle extends Car, Truck {
    void displayFuelType() {
        System.out.println(fuelType()); // Ambiguity: Which version of fuelType() does it inherit?
    }
}
```


## 4. Inheritance and Access Modifiers
### Understanding Access Modifiers
Access modifiers in Java determine how classes, methods, and variables can be accessed and from where. 
There are four main access levels:
- **`public`**: The member is accessible from any other class.
- **`protected`**: The member is accessible within its own package and by subclasses.
- **default** (no modifier): The member is accessible only within its own package.
- **`private`**: The member is accessible only within its own class.

### Access Modifiers and Inheritance
- **Public Inheritance**:<br/> 
Public members (methods or variables) of a superclass remain public in the subclass. 
They can be accessed from any class.


- **Protected Inheritance**:<br/> 
Protected members of a superclass become protected in the subclass. 
They can be accessed within the subclass and by instances of other classes in the same package or other subclasses outside the package.


- **Default Access Inheritance**:<br/> 
If a superclass member has default access, it is inherited by subclasses in the same package but cannot be accessed by subclasses in different packages.


- **Private Members**:<br/>
Private members of a superclass cannot be directly accessed by the subclass. 
They are not inherited in the usual sense, but subclasses can access them indirectly through public or protected methods in the superclass.


### Special Considerations
- **Constructors**:<br/> 
Constructors are not inherited. 
However, a subclass can call a superclass's constructor using `super()`. 
The accessibility of the superclass's constructor affects how subclasses can be instantiated, especially from outside the package.


- **Method Overriding and Access Levels**:</br>
When overriding a method, the access level can't be more restrictive than the method being overridden. 
For example, if a superclass method is `protected`, the overriding method in the subclass can be `protected` or `public` but not `private` or default.

Example
Consider a superclass Vehicle with different access level methods, and a subclass Car that attempts to access these methods:

```java
package transportation;

public class Vehicle {
    public void startEngine() { 
        //...
        }

    protected void accelerate(){
        //...
    }

    void stopEngine() {
        //...
    } 

    private void logTrip(String destination) {
        //...
    }
}
```
```java
package models;

import transportation.Vehicle;

public class Car extends Vehicle {
    public Car() {
        startEngine();  // Allowed
        accelerate();   // Allowed
        stopEngine();   // Compile error if this is accessed from a different package
        logTrip("Paris");  // Not allowed, private to Vehicle
    }
}
```

## 5. Best Practices for Using Inheritance
Inheritance is a powerful feature of object-oriented programming in Java, allowing for code reuse and the establishment of hierarchical class relationships. 
However, its misuse can lead to complex, fragile, and difficult-to-maintain code. 
Here are some best practices to keep in mind.

### Favor Composition Over Inheritance
Composition(**has-a relationship**) is more flexible than inheritance (**is-a relationship**). 
It allows for changing the composed object's behavior at runtime and avoids the tight coupling that can come with inheritance.
Example: Instead of having a `LibrarySystem` inherit from a `BookManagement` class, consider giving the `LibrarySystem` a `BookManagement` component to manage its books, enhancing flexibility and making it easier to add more features like `UserManagement` or `LoanService`.

### Use Inheritance for True Subtype Relationships
- **Is-a Relationship**:<br/>
    Ensure that the subclass truly represents a subtype of the superclass. 
    Each subclass should fully adhere to the superclass's contract, both syntactically and semantically.
  

- **Liskov Substitution Principle**:<br/>
    A subclass should be substitutable for its superclass without altering the correctness of the program. 
    This principle reinforces the need for a genuine is-a relationship.
  
### Avoid Deep Inheritance Hierarchies
- **Complexity**:<br/>
    Deeply nested inheritance hierarchies can make code difficult to understand, trace, and debug. 
    Changes at higher levels of the hierarchy can have unforeseen consequences on distant subclasses.
  

- **Simplicity**:<br/> 
    Aim for shallow hierarchies, preferably not more than two or three levels deep. 
    Use interfaces or composition to share functionality across unrelated classes.

### Do Not Use Inheritance Just to Get Code Reuse
While inheritance provides a mechanism for code reuse, it should not be its primary goal. 
Inheritance implies a strong relationship and behavior contract. If you're looking to reuse code without forming a strict hierarchy, consider alternatives like composition or utility classes.

### Override With Care
- **Method Overriding**:<br/> 
    When overriding methods, ensure that you adhere to the superclass method's contract. 
    Overriding methods should enhance or tailor superclass behavior, not replace it with unrelated functionality.


- **Document Overrides**:<br/> 
    Clearly document any overridden methods, explaining how they differ from or extend the superclass's version. 
    This documentation is crucial for maintainability and understanding the subclass's behavior.