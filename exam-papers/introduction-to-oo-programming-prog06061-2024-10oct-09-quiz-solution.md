
# Quiz Paper: Java Programming

## Question 1

**What is an object in Java?**

1. An instance of a class
2. A method in a class
3. A primitive data type
4. A blueprint for creating classes

---

## Question 2

**Which of the following is true about static methods in Java?**

1. Static methods can only be called on an object
2. Static methods can access instance variables directly
3. Static methods can be overridden
4. Static methods can be called without creating an object of a class

---

## Question 3

**Which of the following is a key benefit of inheritance?**

1. It hides data from other classes
2. It prevents method overriding
3. It allows code reusability
4. It increases code duplication

---

## Question 4

**What is the default value of an object reference declared as an instance variable in Java?**

1. null
2. 0
3. undefined
4. " "

---

## Question 5

**Which of the following statements is true about inheritance in Java?**

1. A class can only inherit from one class
2. Inheritance is not supported in Java
3. A class can inherit from multiple classes
4. A subclass cannot override methods of its superclass

---

## Question 6

**In Java, which of the following is NOT a type of access modifier?**

1. protected
2. private
3. global
4. public

---

## Question 7

**Which keyword is used to inherit a class in Java?**

1. extend
2. extends
3. inherits
4. super

---

## Question 8

**In Java, when does garbage collection occur?**

1. When there are no more references to an object
2. When an object is initialized
3. At compile-time
4. When the programmer explicitly calls it

---

## Question 9

**What does method overriding allow in Java?**

1. Defining multiple methods with the same name in the same class
2. Providing a different set of parameters to methods with the same name
3. Modifying the behavior of an inherited method in a subclass
4. Hiding a superclass method

---

## Question 10

**Which of the following cannot be inherited by a subclass in Java?**

1. Private methods
2. Default methods
3. Public methods
4. Protected methods

---

## Question 11

**What is the purpose of the "super" keyword in Java?**

1. To finalize an object
2. To create an instance of a superclass
3. To call a method from the superclass
4. To define a static method

---

## Question 12

**What is the difference between overloading and overriding?**

1. Overloading occurs in the same class, while overriding occurs between parent and child classes
2. Overloading uses the "extends" keyword, while overriding uses the "implements" keyword
3. Overloading allows methods to have different parameter lists, while overriding allows methods to have different return types
4. Overloading occurs at runtime, while overriding occurs at compile-time

---

## Question 13

**What is the output of the following code?**

```java
class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    void sound() {
        System.out.println("Dog barks");
    }
}

public class Test {
    public static void main(String[] args) {
        Animal a = new Dog();
        a.sound();
    }
}
```

1. Compile-time error
2. Runtime error
3. Dog barks
4. Animal makes a sound

---

## Question 14

**In Java, what does the term "method signature" refer to?**

1. The access modifier of a method
2. The return type of a method
3. The name of the method
4. The combination of a method's name and parameter list

---

## Question 15

1. Method
2. Interface
3. Object
4. Constructor

---
