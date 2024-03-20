# Java enum

## Definition
Enums, short for enumerations, are a special type of data structure in Java used to define a fixed set of constants.
Enums are declared using the `enum` keyword and are typically used to represent a collection of related constants.
Each constant in an enum represents a specific value.

## Creating an enum:
Enums are declared using the `enum` keyword followed by the name of the enum type and a list of constant values enclosed in curly braces {}.
Example:

```java
enum Day {
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
}
```
In this example, Day is an enum type representing the days of the week, and each constant (e.g., SUNDAY, MONDAY, etc.) represents a specific day.

## Fields in Enums:
Enums in Java can contain fields, just like classes. Each enum constant can have associated fields, and these fields can be initialized when the enum constants are defined.

Example:

```java
enum Day {
    SUNDAY("Sun"),
    MONDAY("Mon"),
    TUESDAY("Tue"),
    WEDNESDAY("Wed"),
    THURSDAY("Thu"),
    FRIDAY("Fri"),
    SATURDAY("Sat");

    private final String abbreviation;

    Day(String abbreviation) {
        this.abbreviation = abbreviation;
    }

    public String getAbbreviation() {
        return abbreviation;
    }
}
```
In this example, the Day enum represents the days of the week, and each constant (SUNDAY, MONDAY, etc.) has an associated abbreviation. The abbreviation is initialized when the enum constants are defined, and a getter method (getAbbreviation()) is provided to access the abbreviation.

## Methods in Enums:
Enums in Java can also contain methods, just like classes. These methods can be used to perform operations or provide functionality associated with enum constants.

Example:

```java
enum Day {
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY;

    public boolean isWeekend() {
        return this == SATURDAY || this == SUNDAY;
    }
}
```
In this example, the Day enum represents the days of the week. The isWeekend() method is defined to check if a particular day is a weekend day (SATURDAY or SUNDAY). This method can be called on any Day enum constant to determine if it falls on a weekend.


## How to use enum
One of the most common use cases for enums in Java is to use them with switch-case statements.
This allows for concise and readable code when performing different actions based on the value of an enum constant.

Example:
```java
enum Day {
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
}

public class Main {
    public static void main(String[] args) {
        Day day = Day.MONDAY;

        switch (day) {
            case MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY -> System.out.println("It's a weekday");
            case SATURDAY, SUNDAY -> System.out.println("It's a weekend");
            default -> System.out.println("Invalid day");
        }
    }
}
```
The `default` case is not required.
In some scenarios, omitting the `default` case may be acceptable, especially if you have covered all possible cases explicitly and there are no additional actions to take for any other values.
However, including a `default` case can provide robustness to your code by handling unexpected or unknown values gracefully.

## Advantages of enum

1. **Readability and Clarity:**
   Enums improve code readability by providing meaningful names to constants.
   Instead of using primitive values or arbitrary integers, enums allow developers to use descriptive names that clearly convey the intended purpose of each constant.

2. **Type Safety:**
   Enums provide type safety, ensuring that only valid enum constants can be assigned to variables of the enum type.
   This prevents common errors such as passing incorrect values or using undefined constants.

3. **Compile-Time Checking:**
   Since enums are resolved at compile time, any reference to an enum constant that does not exist or is misspelled will result in a compilation error.
   This helps catch errors early in the development process, reducing the likelihood of runtime errors.
4. **Switch Statements:**
   Enums are often used in switch statements, where each case corresponds to a different enum constant.
   This makes switch statements more expressive and easier to read, especially when handling a predefined set of cases.



