# Java Class

In Java, a class is a blueprint or template for creating objects.
It defines the properties (fields) and behaviors (methods) that objects of that class will have.
A class encapsulates data for the object and defines the methods that operate on that data.
Objects are instances of classes.

## 1. Defining a Class
To define a class in Java, you use the `class` keyword followed by the class name and a code block containing the class members (fields and methods).

Here's an example:

```java
public class Car {
    // Fields (properties)
    String brand;
    String model;
    int year;

    // Constructor
    public Car(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    // Method
    public void start() {
        System.out.println("The " + year + " " + brand + " " + model + " is starting.");
    }
}
```
### Class Members:

- **Fields** (Properties):
  They can be of any data type, including primitive types, reference types, or arrays.
  Fields represent the state or data of the object.
- **Methods**:
  Methods represent the behavior or actions that objects can perform.
  They are defined within the class and can operate on the object's data.

- **Constructor**:
  Constructors are special methods used for initializing objects.
  They have the same name as the class and are called when an object is created.

## 2. Creating Objects (Instantiation):
Once you have defined a class, you can create objects (instances) of that class using the `new` keyword followed by the class name and parentheses (optionally with constructor arguments, if any).
This process is called instantiation. Here's an example:

```java
Car myCar = new Car("Toyota", "Camry", 2022);
```
## 3. Accessing Fields and Methods:
After creating an object, you can access its fields and methods using the dot (.) operator. Fields represent the object's state, while methods represent its behavior. Here's an example:

```java
public class Car {
  String brand;
  String model;
  int year;

  public void start() {
    System.out.println("The " + year + " " + brand + " " + model + " is starting.");
  }

  public static void main(String[] args) {
    var myCar = new Car("Tesla", "Model 3", "2021");
    System.out.println("brand: " + myCar.brand);
    System.out.println("Model: " + myCar.model);
    System.out.println("Year: " + myCar.year);
    myCar.start();
  }
}
```
## 4. Constructor
In Java, constructors play a crucial role in initializing new objects. 
A constructor is a special type of method that has the same name as its class and does not have a return type. 
It's called automatically when a new instance of a class is created, setting the initial state of an object with specified parameters or default values.

### Defining Constructors
Constructors can be defined to accept a range of parameters, allowing for the initialization of an object's fields at the time of creation. 
If a class has more than one constructor, each must have a different parameter list. 
This enables constructor overloading, giving you the flexibility to instantiate objects in different states.

Example: Parameterized Constructor
```java
public class Car {
  String brand;
  String model;
  int year;

  // Constructor with parameters
  public Car(String brand, String model, int year) {
    this.brand = brand;
    this.model = model;
    this.year = year;
  }
}
```
In this example, the `Car` class has a constructor that takes three parameters. 
When a new `Car` object is created, its brand, model, and year fields are initialized to the values passed to the constructor.

### Default Constructors
When a class does not explicitly define any constructors, the Java compiler automatically provides a default constructor. 
This no-argument constructor initializes the object's fields to their default values (e.g., null for object references, 0 for numeric types, false for boolean, etc.), unless the fields are explicitly initialized.
The default constructor ensures that even classes without explicitly defined constructors can be instantiated, making it easier to start working with objects of that class immediately.

Example: Default Constructor

```java
public class MyClass {
  int value;

  // Java automatically provides a default constructor.
}

MyClass obj = new MyClass(); // Uses the default constructor
```
In this example, ```MyClass``` does not have an explicitly defined constructor, so Java provides a default constructor. 
Using this constructor, an instance of `MyClass` is created with its value field initialized to the default int `value` of 0.

### Overloading Constructors:
Having multiple constructors in a class is achieved through constructor overloading, where constructors have the same name but different parameter lists.

Example:
```java
public class Car {
    private String brand;
    private String model;
    private int year;

    // Constructor 1: Default Constructor
    public Car() {
        // Default values
        brand = "Unknown";
        model = "Unknown";
        year = 2022;
    }

    // Constructor 2: Parameterized Constructor
    public Car(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    // Constructor 3: Partially Parameterized Constructor
    public Car(String brand, String model) {
        this.brand = brand;
        this.model = model;
        // Default year
        year = 2022;
    }
}
```
How Constructors Work:
- Default Constructor
  The default constructor initializes the Car object with default values if no parameters are provided during object creation.
  When you call `new Car()`, it invokes this constructor.
- Parameterized Constructor
  The parameterized constructor accepts `brand`, `model`, and `year` parameters and initializes the Car object with the provided values.
  When you call `new Car("Toyota", "Camry", 2022)`, it invokes this constructor.
- Partially Parameterized Constructor:
  The partially parameterized constructor accepts `brand` and `model` parameters and sets a default value for year.
  When you call `new Car("Honda", "Civic")`, it invokes this constructor.

## 5. Encapsulation:
One of the key principles of object-oriented programming (OOP) is encapsulation, which means bundling the data (fields) and methods that operate on the data within a single unit (class).

In Java, access modifiers control the visibility or accessibility of fields, methods, and classes. They play a crucial role in encapsulation by restricting direct access to certain class members, allowing for better control over data and behavior.

Types of Access Modifiers:
- Public: The `public` access modifier allows a field, method, or class to be accessed from any other class.
  There are no access restrictions.
- Private: The `private` access modifier restricts access to the field or method only within the same class.
  It hides the implementation details from outside classes.
- Protected: The `protected` access modifier allows access to the field or method within the same package and by subclasses (even if they are in different packages).
- Default (Package-Private): If no access modifier is specified (also known as package-private), the field or method is accessible only within the same package.

Advantages of encapsulation:
- Data Hiding: By making fields private, you hide the internal state of the object from outside classes, preventing direct access and manipulation.
- Interface Control: By controlling the access to methods using access modifiers, you specify how other classes can interact with your class.
- Flexibility: Encapsulation allows you to change the internal implementation of a class without affecting other parts of the code that use the class.

```java
public class Car {
    // Private fields (encapsulation)
    private String brand;
    private String model;
    private int year;

    // Public constructor
    public Car(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    // Public methods for accessing and modifying private fields (encapsulation)
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    // Public method demonstrating behavior
    public void start() {
        System.out.println("The " + year + " " + brand + " " + model + " is starting.");
    }
}
```

## 6. Static Methods and Fields:
In Java, static methods and fields belong to the class itself rather than to individual objects.
They are associated with the class definition and can be accessed directly using the class name, without needing to create an instance of the class.

### Static Fields
Static fields are shared among all instances (objects) of the class.
They are initialized only once when the class is loaded into memory and remain the same across all instances of the class.
Static fields are commonly used for constants, shared data, or configuration parameters.

Example:

```java
public class MathUtils {
    // Static field for PI
    public static final double PI = 3.14159265359;
}
```

In this example, the `PI` field is a static field representing the mathematical constant π (PI).
It is declared as `public static final double PI = 3.14159265359`, making it accessible from outside the class using the class name (`MathUtils.PI`).
The value of PI remains constant across all instances of the `MathUtils` class, and it can be used in calculations related to circles or other geometric shapes.

### Static Methods
Static methods are associated with the class itself rather than with individual objects.
They can be invoked using the class name and are commonly used for utility methods, calculations, or operations that do not require access to instance-specific data.

Example:

```java
public class MathUtils {
    // Static field for PI
    public static final double PI = 3.14159265359;

    // Static method to calculate the area of a circle
    public static double calculateCircleArea(double radius) {
        return PI * radius * radius;
    }
}
```
The `calculateCircleArea()` method is a static method used to calculate the area of a circle.
It takes the radius of the circle as input and returns the calculated area.
Since the `calculateCircleArea()` method does not depend on any instance-specific data, it is declared as a static method and can be called directly using the class name.

### Usage of Static Methods and Fields
Static methods and fields are often used for functionality that is shared across all instances of a class or does not require access to instance-specific data.
They provide a convenient way to encapsulate common functionality within a class and can be accessed without the need to create an instance of the class.

```java
public class MathUtils {
    // Static field for PI
    public static final double PI = 3.14159265359;

    // Static method to calculate the area of a circle
    public static double calculateCircleArea(double radius) {
        return PI * radius * radius;
    }
}

public class Main {
    public static void main(String[] args) {
        double radius = 5.0;

        // Calling the static method to calculate the area of a circle
        double area = MathUtils.calculateCircleArea(radius);

        System.out.println("Area of circle with radius " + radius + " is: " + area); // Output: Area of circle with radius 5.0 is: 78.539816339745
    }
}
```

## 7. Object Equality and HashCode
### Object Identity vs. Equality
In Java, comparing objects for equality can be performed in two ways: using object identity or object equality.

#### Object Identity (==) 
The `==` operator checks if two reference variables point to the exact same object in memory (memory addresses). 
This comparison is straightforward but only tells you if the references are identical, not if the objects they point to contain the same data.

```java
String str1 = new String("example");
String str2 = new String("example");
boolean result = str1 == str2;  // false, because str1 and str2 refer to different objects in memory.
```

#### Object Equality (`equals()`) 
The `equals()` method is intended for checking if two objects are logically "equal" by comparing their contents. 

```java
String str1 = new String("example");
String str2 = new String("example");
boolean result = str1.equals(str2);  // true, because str1 and str2 are logically equal in content.
```
### `equals()` Method
By default, the `equals()` method in the Object class compares the memory addresses of the objects, functioning similarly to the `==` operator. 
This means that, without overriding, two distinct objects with identical contents are not considered equal.

#### Overriding `equals()`
To facilitate logical equality based on content, you must override the `equals()` method in your custom class. 
A properly overridden `equals()` method should follow these principles:
- **Reflexivity**: For any non-null reference value `x`, `x.equals(x)` should return `true`.
- **Symmetry**: For any non-null reference values `x` and `y`, `x.equals(y)` should return `true` if and only if `y.equals(x)` returns `true`.
- **Transitivity**: For any non-null reference values `x`, `y`, and `z`, if `x.equals(y)` returns true and `y.equals(z)` returns `true`, then `x.equals(z)` should return `true`.
- **Consistency**: For any non-null reference values `x` and `y`, multiple invocations of `x.equals(y)` consistently return `true` or consistently return `false`, provided no information used in equals comparisons is modified.
- **Non-nullity**: For any non-null reference value `x`, `x.equals(null)` should return `false`.

A robust implementation of equals() involves:
1. **Check for Identity**: First, check if the references being compared are the same, using ==.
2. **Check for Null and Class Equality**: Ensure the object passed is not `null` and is an instance of the correct class.
3. **Field Comparisons**: Compare relevant fields to determine equality. Use `equals()` for object fields, and compare primitive fields directly.

Example
```java
public class Book {
  private String isbn;

  public Book(String isbn) {
    this.isbn = isbn;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
    Book book = (Book) obj;
    return isbn.equals(book.isbn);
  }
}
```

### The hashCode() Method
The `hashCode()` method in Java returns an integer representation of an object, which is crucial for placing objects into hash-based collections like `HashMap` or `HashSet`. 
Proper implementation of `hashCode()` is essential for the efficient retrieval and storage of objects within these collections.

#### The Contract Between equals() and hashCode()
Java's collections framework relies on a general contract between `equals()` and `hashCode()` to function correctly:

1. **Consistency**: The hash code of an object must remain constant throughout its lifecycle unless information used in the equals comparison changes.
2. **Equal Objects, Equal Hash Codes**: If two objects are considered equal according to their `equals()` method, they must return the same hash code.
3. **Unequal Objects, Unequal Hash Codes (Desirable)**: While it's permissible for two unequal objects according to `equals()` to have the same hash code, it's beneficial for performance reasons if they do not.

#### Implementing hashCode()
A well-designed `hashCode()` method disperses objects evenly across hash buckets, reducing the likelihood of collisions. 
Here's how to override `hashCode()` effectively:

1. **Start with a Non-Zero Constant**: Begin with a non-zero constant, often 17, to ensure the result is affected by fields of the object.
2. **For Each Significant Field**: Apply an algorithm to compute a hash code for each field that's considered in the `equals()` comparison:
   - Compute field hash codes and combine them using a multiplier (31 is a common choice) to ensure a wide spread of hash codes.
   - Primitive fields can usually be converted directly into hash codes, while object fields may use their own `hashCode()` methods. 
     Null fields typically contribute 0.
3. **Return the Combined Hash Code**: The final result is the hash code for the entire object.


Example
```java
public class Book {
  private String isbn;

  public Book(String isbn) {
    this.isbn = isbn;
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + isbn.hashCode(); // Assuming 'isbn' is a non-null String field.
    return result;
  }
}
```
This method begins with a base hash code and iterates over significant fields, incorporating each into the overall hash code to minimize collisions.

### Key Takeaways
- Always override `hashCode()` when you override `equals()` to maintain the contract required by hash-based collections.
- The goal of `hashCode()` is to produce a wide distribution of hash codes for different objects to enhance the performance of hash tables.
- Despite the technical nature of `hashCode()`, adhering to a simple pattern ensures it works harmoniously with `equals()` for consistent and predictable behavior in collections.






