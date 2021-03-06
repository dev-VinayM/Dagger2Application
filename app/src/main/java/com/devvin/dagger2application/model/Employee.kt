package com.devvin.dagger2application.model

// @Inject tells Dagger how to create instances of Employee
//Note that we have used the "constructor" keyword explicitly --> resurfacing the constructor
data class Employee constructor(
    val name: String,
    val salary: Salary,
    val contactDetails: ContactDetails,
    val residence: Residence
) {
}