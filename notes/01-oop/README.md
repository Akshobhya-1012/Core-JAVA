# OOP – Inheritance (Java)
 
## What is Inheritance?
Inheritance is an OOP concept where a **child class (subclass)** acquires properties and behavior of a **parent class (superclass)** using `extends`.
 
- Parent = superclass/base class  
- Child = subclass/derived class  
- Benefits: **code reuse**, clean hierarchy, enables **polymorphism** (method overriding)
 
Example:
```java
class Car extends Vehicle { }
 
Types of Inheritance in Java
✅ Supported using classes:
Single (A → B)
Multilevel (A → B → C)
Hierarchical (A → B, A → C)
❌ Not supported using classes:
Multiple inheritance (A, B → C) is not allowed due to ambiguity (diamond problem)
✅ Multiple inheritance is possible using interfaces:
Copy code
Java
class C implements I1, I2 { }
What is inherited?
✅ Inherited:
public and protected members
package-private members only if in same package
❌ Not inherited:
constructors (but can be invoked via super())
private members (not directly accessible)
static methods are not overridden (they are hidden)
super keyword
super refers to immediate parent class.
Use cases:
super() → call parent constructor (must be first line inside constructor)
super.method() → call parent method
super.field → access parent field
Method Overriding (Inheritance + Polymorphism)
When a subclass provides its own implementation of a parent method.
Rules:
Same method name, same parameters
Return type same or covariant
Access modifier cannot be reduced (public → protected ❌)
Use @Override
Happens at runtime (dynamic dispatch)
Real-world usage (Interview-ready points)
Spring uses inheritance/polymorphism heavily via interfaces + implementations
Common base classes (e.g., Audit fields in entities) can be inherited
Custom exceptions extend RuntimeException
Frameworks depend on runtime polymorphism for behavior
Interview Q&A – Inheritance
What is inheritance?
Acquiring properties and behaviors from a parent class using extends.
Why multiple inheritance is not supported with classes in Java?
To avoid ambiguity (diamond problem) and complex method resolution.
Does Java support multiple inheritance at all?
Yes, using multiple interfaces.
Are constructors inherited?
No, but parent constructors can be called using super().
What is super used for?
To access parent members and call parent constructors/methods.
Can we override static methods?
No. Static methods are hidden, not overridden.
What is overriding?
Child class redefines parent method with same signature.
Difference between overloading and overriding?
Overloading: compile-time, different parameters.
Overriding: runtime, same signature in child.
Can we reduce visibility while overriding?
No. Visibility cannot be reduced.
When to prefer composition over inheritance?
When relationship is not a true IS-A; composition is more flexible and reduces coupling.
 