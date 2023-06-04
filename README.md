# Core Java 
Here I am trying to describe about the new features relesed in various java versions onhigh level for quick understanding.

## Java8 Features
Main intention behind java8 is simplified code and to introduce functional programming.

* **1. Lambda Expressions:** The main objective of lambda expression is to enable functional programming. Using lambda, we can pass procedure or behavior as an argument. We can also write more readable, maintainable and concise code. Also we can enable parallel processing. Lambdas can be used in a certain type of interfaces. We use interface as type for the lambda expression, that interface must contain only one abstract method i.e nothing but functional interface. Lambda expressions are also called as anonymous functions or closures. We can even pass lambda expressions as arguments to other functions.

* **2. Functional Interfaces:** Functional interface is the one which contains only one abstract method. We can mark any interface with annotation @FunctionalInterface, so that it does not allow more than one abstract method.
	1. java.util.Function - contains a bunch of predefined interfaces. Predicate,Consumer,Supplier etc.
	2. Consumer functional interface consumes input and it does not return anything.
		
* **3. Default and Static Methods:** Starting from java8 we can add default and static methods also along with abstract methods in an interface.
	1. When we are implementing an interface to a class, we need to implement all abstract methods. There will be a chance where there is a common function that needs to be implemented in all the implementation classes and which isgetting duplicated. Default methods serves the same purpose, we can give the implementation inside the interface itself and we need not override the same in implmentation class by feault these default mthods are avilable in all the implementation classes.
	2. Static methods also can be used to impelemt the default functionlity. But in case of static methods we need not create instace and can be called directly with Interface name like normal static methods. Also we can override default methods in implementation class if we want where as static methods can't be overidden.
	3. If we have 2 interfaces with a default method with same signature and if we are implementing a class with both the interfaces with multiple inhereitence, the class will force us to override the method from one of the interfaces. Then inside the overridden method, we need to specify that respective interfacename.super.method name. Then while instantiating or using the implementation class, whatever the member variable we create to the interface and instantiate the implementation class the same overridden method will be called. Even if you use the member variable of interface1 or interface2, only the overridden method of the respective interface only will come into picture. 	

* **4. :: Operator - method and constructor reference:** Method reference is used to refer the method of the functional interface. It is compact and easy form of a lambda expression. each time when you are using lambda expression to refer a method, you can replace your lambda expression with a metod reference.
	* There are 4 types of method references in java. i. Method reference to a static method *Class::static method name*. ii.Reference to an instance method of a particular object *Object::instance method* iii. Reference to an instance method of an orbitrary object of specific type.*Class.instanceMethod* iv. Reference to a constructor *Classname::new* 

* **5. Streams API:** Stream represents a sequence of objects from a source, which supports aggregate operations.
	1. There are two types of operators allowed in streams i. terminal operators ii. intermediate operators. On a single stream, we can apply multiple intermediate operations but can apply only one terminal operator.
		i. Example of intermediate operators are map, filter, sorted, flatMap, distinct, peek, limit, skip
		ii. Example of terminal operators are collect(), forEach(), reduce(), toArray(), count(), min(),max(), anyMatch(), allMatch(), noneMatch(), findAny(), findFirst()	
	2. Steams feature provides many other provisions or methods to perform sortings, aggregations of data easily with concise code.

* **6. Date and Time API (Joda API):** 
	1. There are multiple issues with the existing date API, so in Java8 majority of them are addressed.
		i. The first problem with existing date api is that the same Date class is available in many other packages like sql and etc. So it is ambiguous to select appropriate date class. 
		ii. When we careta a date object and print, time also displays along with the date.
		iii. For formatting the date into required format, we need to use SimpleDateFormat package which is from java.text package.
		iv. It is bit difficult to play with timezone t the same time.  

* **7. Optional classes:** Java8 has introduced a new optional utility class in java.util package. This class can help in avoiding null checks and null pointer exceptions. We can view Optional as a single value container that either contains a value or doesn't.The class was introduced in the java. util package to remove the need for multiple null checks to protect against the dreaded NullPointerExceptions during run-time.
	i. Optional is a final class, so we can't extend this class.
	ii. of, empty, ofNullable are the three static methods used to create optional class object.
	iii. Whenever we are not sure, whether object contains value or not in such case we use ofNullable method. It returns the empty object in case of the value is null.
	iv. When we want to get the value from Optional class, we use get() method provided. If there is no value in the object in such case the get method returns no such element exception. In real time we never call get() method directly, we can check it by using isEmpty() or isPresent() method and then call get method.
	v. We can use orElse method which allows you to check whether the objecct contains value or else return a default value.
	vi. filter() method is used to filter the data ofan optional object. It accepts Predicate type oflambda as an argument.
	vii. map() method in Optional class provides a way to totransform value from one type to other. 

## Java9 Features
	1. **Interface private Methods** In Java9, we can create private methods inside an interface. These private methods help to share common code between non abstract methods. If we create private methods in interface before Java9, it gives compile time error. 
	2. **Try with Resources** try with resoure is introduced in java7 but there is a limitation to it as it can be applied only to the resourcs declared inside it. Where as in Java 9, it can be applied to the resources declared outside to it.
	3. **Anonymous classes** - <> diamond operator enhancement is applicable for anonymous inner classes.
	4. **@SafeVarargs annotation** It is an annotation which applies on a method or constructor that takes varargs parameters. It is used to ensure that the method does not perform unsafe operations on its varargs parameters.
	5. **Collection factory methods** Factory methods are special type of static methods that are used to create unmodifiable instances of collections. It means we can use these methods to create list,set and map of small number of elements.
	6. **Stream API improvement** It is an annotation which applies on a method or constructor that takes varargs parameters. It is used to ensure that the method does not perform unsafe operations on its varargs parameters.
	7. **JShell** The Java Shell tool (JShell) is an interactive tool for learning the Java programming language and prototyping Java code. JShell is a Read-Evaluate-Print Loop tool (REPL), which evaluates declarations, statements, and expressions as they are entered and immediately shows the results.
	8. **JPMS** - Java Platform Module System - java platform is modularised. Java hell or jar hell problem is addressed. Addressed claa defininition not found issue and various internal class dependencies.
	9. **JLINK** - Java Linker - From java9, we can create our own customised JRE using JLink.
	10. **Http/2 Client API**
	11. **Process API Updates** - Can capture complete process information.
	12. **G1 GC** - G1 GC garbage collecotor introduced in java6 from java9 onwards it will be the default garbage collecotr.  
	

## Java10 Features

## Java11 Features

## Java12 Features

## Java13 Features

## Java14 Features

## Java15 Features

## Java16 Features

## Java17 Features

## Java18 Features

## Java19 Features

## Java20 Features