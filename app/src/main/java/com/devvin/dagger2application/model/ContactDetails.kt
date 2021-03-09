package com.devvin.dagger2application.model

import javax.inject.Inject

//if the class only takes another class as parameter, then only @Inject will work.
//Here as the class also takes mobile and email (to be injected dynamically), @Inject annotation wont work
data class ContactDetails constructor(
    val mobile : Long,
    val email : String
) {
}