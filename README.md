# Java Design Patterns

This repository contains a Java implementation of some of the most common design patterns. Design patterns are reusable solutions to common problems that software developers face when designing applications. They provide a way to structure code in a way that is flexible, modular, and maintainable. By using design patterns, developers can create code that is more efficient, easier to understand, and more easily adapted to changes in requirements.
## Implemented Design Patterns
###  Singleton Pattern

The Singleton pattern is a creational pattern that is used to ensure that only one instance of a class is created throughout the lifetime of an application. This pattern is useful in situations where a single instance of a class needs to coordinate actions across an application, such as a configuration manager or a logger.

In this repository, the Singleton pattern is implemented in the Singleton class. The class is designed so that only one instance can be created, and that instance can be accessed through a static method called getInstance(). The getInstance() method returns the single instance of the class, creating it if it doesn't already exist.
### Immutable Pattern

The Immutable pattern is a creational pattern that is used to create objects that cannot be changed after they are created. This pattern is useful in situations where you want to ensure that an object's state remains constant, such as in a configuration file or a database connection.

In this repository, the Immutable pattern is implemented in the ImmutableClass class. The class is designed so that its state cannot be changed after it is created. The class has final fields, which are initialized in the constructor and cannot be modified later. The class also does not have any setter methods, so the state of the object cannot be changed after it is created.
### Decorator Pattern

The Decorator pattern is a structural pattern that is used to add new functionality to an existing object without modifying its structure. This pattern is useful in situations where you want to add new features to an object dynamically, such as adding logging or caching to a database connection.

In this repository, the Decorator pattern is implemented in the Decorator class. The class is designed so that it can wrap around an existing object and add new functionality to it. The Decorator class implements the same interface as the wrapped object, and it passes calls to the wrapped object. However, the Decorator class can also add new functionality to the calls, such as logging or caching.
## Usage

To use the design patterns implemented in this repository, simply download the source code and include it in your project. Each design pattern is implemented in its own class, so you can use the pattern that you need by instantiating the corresponding class.

For example, to use the Singleton pattern, you would create an instance of the Singleton class using the getInstance() method:


```java
Singleton singleton = Singleton.getInstance();
```
To use the Immutable pattern, you would create an instance of the ImmutableClass class using the constructor:
```java
ImmutableClass immutable = new ImmutableClass("Hello, world!");
```


To use the Decorator pattern, you would create an instance of the Decorator class, passing in the object that you want to decorate:

```java

MyClass object = new MyClass();
Decorator decorator = new Decorator(object);
```
## Conclusion

Design patterns are an important tool for software developers. They provide a way to structure code in a way that is flexible, modular, and maintainable. By using the Singleton, Immutable, and Decorator patterns, developers can create code that is more efficient, easier to understand, and more easily adapted to changes in requirements
