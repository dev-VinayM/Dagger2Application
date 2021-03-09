# Dagger2Application
POC project on Dagger2

### About Project : 
Employee is dependent on Salary and ContactDetails. <br>
ContactDetails is dependent on Address.


### Things to keep in mind :
Annotations : 
1. @Inject : tells the Dagger how to create instances of Employee
2. @Module : tells Dagger how to provide dependencies from the dependency graph. 
3. @Provides :
4. @Binds : 
5. @Component : 

Dependency Injection types :
1. <b>Constructor Injection</b>: Injecting the method parameters.
2. <b>Field Injection</b>: Injecting the member variable (must not be private).
3. <b>Method Injection</b>: Injecting the method parameter.

Order of dependency injection according to JSR330 (Java Specification Requests) :
1. Constructor
2. Field
3. Method
