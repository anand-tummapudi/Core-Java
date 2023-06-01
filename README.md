# Core Java 
Practical examples of Various concepts in Core Java
##Java8 Features
Main intention behind java8 is simplified code and to introduce functional programming.

* **1. Lambda Expressions:** The main objective of lambda expression is to enable functional programming. Using lambda, we can pass procedure or behavior as an argument. We can also write more readable, maintainable and concise code. Also we can enable parallel processing. Lambdas can be used in a certain type of interfaces. We use interface as type for the lambda expression, that interface must contain only one abstract method i.e nothing but functional interface. Lambda expressions are also called as anonymous functions or closures. We can even pass lambda expressions as arguments to other functions.

* **2. Functional Interfaces:** Functional interface is the one which contains only one abstract method. We can mark any interface with annotation @FunctionalInterface, so that it does not allow more than one abstract method.
	1. java.util.Function - contains a bunch of predefined interfaces. Predicate,Consumer,Supplier etc.
	2. Consumer functional interface consumes input and it does not return anything.
	
	
* **3. Default Methods:** Starting from java8 we can add default methods also along with abstract methods in an interface.

* **4. Static Methods:**

* **5. Predicate:**

* **6. Function:**

* **7. Consumer:**

* **8. :: Operator - method and constructor reference:** Method reference is used to refer the method of the functional interface. It is compact and easy form of a lambda expression. each time when you are using lambda expression to refer a method, you can replace your lambda expression with a metod reference.
	* There are 4 types of method references in java. i. Method reference to a static method *Class::static method name*. ii.Reference to an instance method of a particular object *Object::instance method* iii. Reference to an instance mthod of an orbitrary object of specific type.*Class.instanceMethod* iv. Reference to a constructor *Classname::new* 

* **9. Streams API:**

* **10. Date and Time API (Joda API):**

* **11. Optionals:**

