# Dagger2Application
POC project on Dagger2

### About Project : 
Employee is dependent on Salary and ContactDetails. <br>
Residence is dependent on Address.

![dependencyGraph](https://user-images.githubusercontent.com/76177174/110505735-706e1380-8124-11eb-9b68-fadb980e637d.jpg)


### Things to keep in mind :
Annotations : 
1. @Inject : tells the Dagger how to create instances of Employee
2. @Module : tells Dagger how to provide dependencies from the dependency graph. 
3. @Provides :
4. @Binds : 
5. @Component : tells Dagger to generate a container with all the dependencies required to satisfy the types it exposes.

Dependency Injection types :
1. <b>Constructor Injection</b>: Injecting the method parameters.
2. <b>Field Injection</b>: Injecting the member variable (must not be private).
3. <b>Method Injection</b>: Injecting the method parameter.

Order of dependency injection according to JSR330 (Java Specification Requests) :
1. Constructor
2. Field
3. Method
