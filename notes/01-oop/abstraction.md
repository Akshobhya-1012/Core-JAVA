# OOP – Abstraction (Java)

## What is Abstraction?
Abstraction means **hiding implementation details** and exposing **only essential behavior** to the user.

It focuses on **what an object does**, not **how it does it**.

---

## How Abstraction is achieved in Java
1. **Abstract Classes**
2. **Interfaces**

---

## Abstract Class
An abstract class:
- Can have abstract and non-abstract methods
- Can have instance variables
- Can have constructors
- Supports inheritance using `extends`

Example:
```java
abstract class Vehicle {
    abstract void start();
}
Rules:

Cannot be instantiated

Abstract methods have no body

Child class must implement abstract methods

Interface
An interface:

Defines a contract

Achieves 100% abstraction (before Java 8)

Supports multiple inheritance

Key points:

Methods are public abstract by default

Variables are public static final

Java 8+ allows default and static methods

Example:

java
Copy code
interface PaymentService {
    void pay();
}
Abstract Class vs Interface
Feature	Abstract Class	Interface
Methods	Abstract + concrete	Abstract, default, static
Variables	Instance variables	public static final
Constructors	Yes	No
Multiple inheritance	No	Yes
Keyword	extends	implements

Why Abstraction is Important (Interview Point)
Reduces complexity

Improves maintainability

Enables loose coupling

Backbone of frameworks like Spring

Abstraction in Real Projects
Service interfaces (UserService)

DAO interfaces (UserRepository)

REST contracts

Strategy & Factory design patterns

Relationship with Polymorphism
Abstraction defines behavior

Polymorphism decides which implementation executes at runtime

Together they form the foundation of Spring Framework.

kotlin
Copy code

---

# 2️⃣ INTERVIEW Q&A — Abstraction

Add this at the bottom of the same file or keep separately.

```markdown
## Interview Q&A – Abstraction

1) **What is abstraction?**  
Hiding implementation details and exposing only essential functionality.

2) **How is abstraction achieved in Java?**  
Using abstract classes and interfaces.

3) **Can abstract class have constructor?**  
Yes.

4) **Can abstract class have non-abstract methods?**  
Yes.

5) **Can interface have method implementations?**  
Yes, using default and static methods (Java 8+).

6) **Can we create object of abstract class?**  
No.

7) **Can interface have variables?**  
Yes, but they are public static final.

8) **When to use abstract class vs interface?**  
Use abstract class for shared state; interface for contract/multiple inheritance.

9) **Is abstraction possible without inheritance?**  
No.

10) **Why abstraction is important in Spring?**  
Spring uses interfaces to decouple implementation from usage.