# Core Java 
Practical examples of Various concepts in Core Java

## Java8 Features
Main intention behind java8 is simplified code and to introduce functional programming.

* **1. Lambda Expressions:** The main objective of lambda expression is to enable functional programming. Using lambda, we can pass procedure or behavior as an argument. We can also write more readable, maintainable and concise code. Also we can enable parallel processing. Lambdas can be used in a certain type of interfaces. We use interface as type for the lambda expression, that interface must contain only one abstract method i.e nothing but functional interface. Lambda expressions are also called as anonymous functions or closures. We can even pass lambda expressions as arguments to other functions.

* **2. Functional Interfaces:** Functional interface is the one which contains only one abstract method. We can mark any interface with annotation @FunctionalInterface, so that it does not allow more than one abstract method.
	1. java.util.Function - contains a bunch of predefined interfaces. Predicate,Consumer,Supplier etc.
	2. Consumer functional interface consumes input and it does not return anything.
		
* **3. Default and Static Methods:** Starting from java8 we can add default and static methods also along with abstract methods in an interface.
1. When we are implementing an interface with a class, we need to implement all abstract methods. There will be a chance where there is a common function that needs to be implemented in all the implementation classes and which isgetting duplicated. Default methods serves the same purpose, we can give the implementation inside the interface itself and we need not override the same in implmentation class by feault these default mthods are avilable in all the implementation classes.
2. Static methods also can be used to impelemt the default functionlity. But in case of static methods we need not create instace and can be called directly with Interface name like normal static methods. Also we can override default methods in implementation class if we want where as static methods can't be overidden. 

* **4. :: Operator - method and constructor reference:** Method reference is used to refer the method of the functional interface. It is compact and easy form of a lambda expression. each time when you are using lambda expression to refer a method, you can replace your lambda expression with a metod reference.
	* There are 4 types of method references in java. i. Method reference to a static method *Class::static method name*. ii.Reference to an instance method of a particular object *Object::instance method* iii. Reference to an instance method of an orbitrary object of specific type.*Class.instanceMethod* iv. Reference to a constructor *Classname::new* 

* **5. Streams API:**

* **6. Date and Time API (Joda API):**

* **7. Optional classes:** Java8 has introduced a new optional utility class in java.util package. This class can help in avoiding null checks and null pointer exceptions. We can view Optional as a single value container that either contains a value or doesn't.The class was introduced in the java. util package to remove the need for multiple null checks to protect against the dreaded NullPointerExceptions during run-time.
1. Optional is a final class, so we can't extend this class.
2. of, empty, ofNullable are the three static methods used to create optional class object.
3. Whenever we are not sure, whether object contains value or not in such case we use ofNullable method. It returns the empty object in case of the value is null.
4. When we want to get the value from Optional class, we use get() method provided. If there is no value in the object in such case the get method returns no such element exception. In real time we never call get() method directly, we can check it by using isEmpty() or isPresent() method and then call get method.
5. We can use orElse method which allows you to check whether the objecct contains value or else return a default value.
6. filter() method is used to filter the data ofan optional object. It accepts Predicate type oflambda as an argument.
7. map() method in Optional class provides a way to totransform value from one type to other. 


