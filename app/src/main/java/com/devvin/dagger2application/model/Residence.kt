package com.devvin.dagger2application.model

import javax.inject.Inject

data class Residence @Inject constructor(
    val currentAddress : Address,
    val permanentAddress : Address
){
}