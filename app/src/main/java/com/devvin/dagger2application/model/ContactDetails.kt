package com.devvin.dagger2application.model

import javax.inject.Inject

data class ContactDetails @Inject constructor(
//    val mobile : Long,
//    val email : String,
    val address: Address
) {
}