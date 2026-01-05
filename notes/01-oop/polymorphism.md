# OOP – Polymorphism (Java)
 
## What is Polymorphism?
Polymorphism means **one object behaving in multiple forms**.
 
In Java, it allows the **same method name** to perform **different behaviors** based on:
- Method parameters (compile-time)
- Object type at runtime (runtime)
 
---
 
## Types of Polymorphism in Java
 
### 1️⃣ Compile-Time Polymorphism (Method Overloading)
Resolved at **compile time**.
 
Achieved by:
- Same method name
- Different parameter list (number, type, order)
 
Example:
```java
add(int a, int b)
add(int a, int b, int c)
 
❌ Return type alone cannot differentiate overloaded methods.
2️⃣ Runtime Polymorphism (Method Overriding)
Resolved at runtime using dynamic method dispatch.
Achieved by:
Inheritance
Method overriding
Parent reference holding child object
Example:
Copy code
Java
Employee e = new Manager();
e.calculateBonus();
Key Rules of Method Overriding
Same method signature
Return type must be same or covariant
Access modifier cannot be reduced
static methods are hidden, not overridden
final methods cannot be overridden
private methods are not overridden
Happens at runtime
Why Polymorphism is Important (Interview Point)
Enables loose coupling
Core principle behind Spring Framework
Makes code extensible and maintainable
Allows interface-based programming
Polymorphism in Real Projects
Service interfaces with multiple implementations
Spring beans resolved at runtime
REST controllers calling service interfaces
Strategy and Factory design patterns
Compile-time vs Runtime Polymorphism
Aspect
Compile-Time
Runtime
Binding
Early
Late
Example
Overloading
Overriding
Performance
Faster
Slightly slower
Flexibility
Less
More
Copy code
 
---
 
# 2️⃣ INTERVIEW Q&A — Polymorphism
 
👉 Add this at the bottom of the same file OR a separate `interview-qa.md`
 
```markdown
## Interview Q&A – Polymorphism
 
1) **What is polymorphism?**  
Ability of an object to take multiple forms.
 
2) **How many types of polymorphism in Java?**  
Two: Compile-time (overloading) and Runtime (overriding).
 
3) **Is method overloading runtime polymorphism?**  
No, it is compile-time polymorphism.
 
4) **What is dynamic method dispatch?**  
Method call resolution based on actual object at runtime.
 
5) **Can static methods be overridden?**  
No, they are method hidden.
 
6) **Can we override private methods?**  
No, private methods are not accessible to child classes.
 
7) **Can we overload main method?**  
Yes, but JVM calls only `public static void main(String[] args)`.
 
8) **Why runtime polymorphism is important in Spring?**  
Spring uses interfaces and resolves implementations at runtime.
 
9) **Does polymorphism require inheritance?**  
Runtime polymorphism requires inheritance; compile-time does not.
 
10) **Difference between method overloading and overriding?**  
Overloading: same name, different params.  
Overriding: same signature, child implementation.
 