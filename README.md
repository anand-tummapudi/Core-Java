# Core Java 
Here I am trying to describe about the new features relesed in various java versions on high level for quick understanding.
## General Java Concepts

#### Multithreading
A thread is nothing but a small process under execution. Each therad will have its own pah of execution and exceptions in one thread will not effect the ececution of other threads. 
* In java, we can create threads in 2 ways. One by extending thread class and second one is by implementing Runnable interface.
* If we create therad by extending Thread class, we can override the run method and directly run the same class instance by calling start or run method. If we create thread by extending Thread class, we will not be able to extend the class with any other class as java doesn't support multiple inheritance.
* If we create thread by implementing Runnable interface, we need to create an object of Thread class and pass the implemntation class reference to run it. When we use Runnable interface we can extend the implementation class either with another class and also implement any other interfaces if required.

#### Java Serialization
- Serialization is the process of coverting an object into a sequence of bytes which can be persisted to a disk or a database. Coverting the sequence of bytes into object is called deserialization.
- A java object is serializable if its class or any of its subclass implements java.io.Serializable or Externalizable interface.
- The entire process of serialization and deserialization is JVM independent meanthing that an object can be serialized in one platform and can be deserialized in a different platform.
- ObjectInputStream and ObjectOutputStream are mainly used classes for Serialization and Deserialization.
- Eternalization provides implementation logic control to the application by overriding readExternal and writeExternal methods. In serialization JVM ignores transient variable during serialization and deserialization. In Externalization, programmer can write his own logic to ignore some of the variables during externalization of objects.

#### Java Object cloning


#### Java Memory Management
In Java thereare 2 types of memories i. Stack ii. Heap

- **Stack-** Is used for static memory allocation. It is used for storing variables and method execution. It follows LIFO algorithm. Variables that are allocated on the stack are accessible directly from memory, thus these can run very fast.
- **Heap-** Is used for storing objects and static variables. Heap is used for dynamic memory allocation. Accessing the objects from heap takes more time. In heap there will be two areas young generation and old generation. Heap follows FIFO algorithm.
- **Garbage Collection-** Garbage is nothing but unreferenced objects in the memory. Garbage collection is the process of destroying the unreferenced objects. In Java, garbage collection is performed automatically. The finalize() method is invoked before an unreferenced object is removed from the memory.
- While using threads, each thread will have its own thread stack and help will be commonly used by all the threads. 
- **Java Visual VM-** Using VisualVm we can track the java memory management, memory leaks, garbage collection and CPU profiling. While running the application visualvm will extract the data from JVM and map it on the user interface. VsualVM is by default available as part of JDK. jstat, jstack, jmap etc are the tools used by VisualVM.

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
		i. Example of intermediate operators are map(), filter(), sorted(), flatMap(), distinct(), peek(), limit(), skip()
		ii. Example of terminal operators are collect(), forEach(), reduce(), toArray(), count(), min(),max(), anyMatch(), allMatch(), noneMatch(), findAny(), findFirst()	
	2. Steams feature provides many other provisions or methods to perform sortings, aggregations of data easily with concise code.

* **6. Date and Time API (Joda API):** 
	1. There are multiple issues with the existing date API, so in Java8 majority of them are addressed.
		i. The first problem with existing date api is that the same Date class is available in many other packages like sql and etc. So it is ambiguous to select appropriate date class. 
		ii. When we careta a date object and print, time also displays along with the date.
		iii. For formatting the date into required format, we need to use SimpleDateFormat package which is from java.text package.
		iv. It is bit difficult to play with timezone t the same time.  

* **7. Optional classes:** Java8 has introduced a new optional utility class in java.util package. This class can help in avoiding null checks and null pointer exceptions. We can view Optional as a single value container that either contains a value or doesn't.The class was introduced in the java. util package to remove the need for multiple null checks to protect against the dreaded NullPointerExceptions during run-time.

	* Optional is a final class, so we can't extend this class.
	* Of, empty, ofNullable are the three static methods used to create optional class object.
	* Whenever we are not sure, whether object contains value or not in such case we use ofNullable method. It returns the empty object in case of the value is null.
	*  When we want to get the value from Optional class, we use get() method provided. If there is no value in the object in such case the get method returns no such element exception. In real time we never call get() method directly, we can check it by using isEmpty() or isPresent() method and then call get method.
	*  We can use orElse method which allows you to check whether the objecct contains value or else return a default value.
	*  filter() method is used to filter the data ofan optional object. It accepts Predicate type oflambda as an argument.
	*  map() method in Optional class provides a way to totransform value from one type to other. 

* **8. Thread Pools (Executors):** 
	* In java threads are mapped to system-level threads, which are the operating system resources.
	* The thread pool pattern helps in saving resources in a multi-threaded application and to contain the parallelism in certain pre defined limits.
	* When we use thread pool, we write our concurrent code in the form of parallel tasks and submit them for execution to an instance of hread pool. This instance controls several re-used threads for executing these tasks.
	* **Executors, Executor and ExecutorService** Executors helper class contains several methods for the creation of pre-configured thread pool instances. We use Executor and ExecutorService interfaces to work with different thread pool implementations. Executor interface has a single execute mehod, to submit runnable instances for execution. The ExecutorService interface contains a large number of methods to control the progress of the tasks and manage the termination of service. 

## Java9 Features
A high level overview of Java9 features.
	
*	**Interface private Methods** In Java9, we can create private methods inside an interface. These private methods help to share common code between non abstract methods. If we create private methods in interface before Java9, it gives compile time error.
 
*	**Try with Resources** try with resoure is introduced in java7 but there is a limitation to it as it can be applied only to the resourcs declared inside it meaning that we need to create the resources inside the try block or we need to create member variable for the resources created outside try block. Where as in Java 9, it can be applied to the resources declared outside to it.

*	**Anonymous classes** - <> diamond operator enhancement is applicable for anonymous inner classes.

*	**@SafeVarargs annotation** It is an annotation which applies on a method or constructor that takes varargs parameters. It is used to ensure that the method does not perform unsafe operations on its varargs parameters.

*	**Collection factory methods** Factory methods are special type of static methods that are used to create unmodifiable instances of collections. It means we can use these methods to create list,set and map of small number of elements. Till java8, if we want to create immutable collections, we need to create a collection and then apply collection.unModifiable method option. From java9, we can use factory methods like List.of() etc. to create immutable collections.
 
*	**Stream API improvements** 
1. takeWhile() - It returns, if the stream is ordered. A stream consisting of a subset of elements taken from this stream that match the given predicate.
2. dropWhile() - It retuns, if this stream is ordered. A stream consisting of the remaining elements of this stream after dropping a subset of elements that match the given predicate.
3. ofNullable() - It returns a sequentia stream containing a single element, if not null. Otherwise it returns an empty stream.
4. iterate() - This method allows us to iterate stream elements till the specified condition. 

*	**JShell** The Java Shell tool (JShell) is an interactive tool for learning the Java programming language and prototyping Java code. JShell is a Read-Evaluate-Print Loop tool (REPL), which evaluates declarations, statements, and expressions as they are entered and immediately shows the results.

*	**JPMS** - Java Platform Module System - java platform is modularised. Java hell or jar hell problem is addressed. Addressed claa defininition not found issue and various internal class dependencies.

*	**JLINK** - Java Linker - From java9, we can create our own customised JRE using JLink.

*	**Http/2 Client API** - If we want to consumer any web services over http till java8, we can use only HTTPURLConnection approach which is very old, allows only blocking mode, supports only text data. Java introduces HTTP/2 client in java 9 using which we can send http request calls both blocking and non blocking mode, supports both text and binary data.

* 	**Process API Updates** - Can capture complete process information. ProcessHandle class introduced in java.lang package provided many methods to play with process information like current running process etc. Ex: ProcessHandle.current.pid;

* 	**G1 GC** - G1 GC garbage collecotor introduced in java6 from java9 onwards it will be the default garbage collecotr.  
	

## Java10 Features
A high level understanding of java 10 features.

* Local variable type inference - Starting from java10, for declaration of variable type we can use **var** instead of respective data type. The copiler will be able to determine the type based on the type of data assigned. If we are not initializing the value to a local variable, then compiler does not allow to use var type. For method aruments, we can't use var. For global or class level variables, we can't use var.  

* Consolidate the JDK forest into a single repository
* Garbage collector interface
* Parallel full GC for G1.
* Application class data sharing
* Thread local hand shakes
* Heap allocation on alternative memory devices.
* Experimental java based JIT compiler.
* Root certificates.

## Java11 Features
A high level understanding of Java 11 features.

* Starting from JDK 11, there is no separate installation of JDK and JRE. Installation of JDK will automatically install JRE in it.
* Single file execution - We need not run java compiler javac and run the java file with class file. We can directly run the .java file with java interpreter and jdk will take care of the internal compilation and it runs the file. 
* java.util.collecion package new method toArray added, which can be used to convert a collection to an array.
* Local variable type for lamda expression arguments. We can apply var data type for the variable inside lambda expression method arguments.
* String API changes - There are some additional methods added to String api that are isBlank(), lines(), Strip(), stripLeading(), stripTrailing() and repeat().
* Optional.isEmpty() 
* Fileread and write string - For readingand writing of files Files.readString() and Files.writeString() methods added.
* Http client APi has been standardized in java11. As partof this, the previously introduced incubating API has been removed. Http types will be imported from the standard package, java.net.http.

## Java12 Features
Java 12 introduces a lot of new lnguage features. Here is a high level understanding of the new additions.
* String class new methods - i. indent adjusts the indentation of each line based on the integer parameter.ii. transform() - It accepts a single argument function as a parameter that will be applied to the string.
* Files::mismatch method - It is used to compare two files and find the position of the first mismatched byte in their contents.
* TeeingCollector - As an addition to the Collectors class, a new teeing collector was introduced.
* Compact Number Format - It is designed to represent a number in a shorter form based on the patterns provided by a given locale. We can get its instance via the getCompactNumberInstance method in NumberFormat class.  

## Java13 Features

## Java14 Features

## Java15 Features

## Java16 Features

## Java17 Features

## Java18 Features

## Java19 Features

## Java20 Features