package com.devvin.dagger2application.dependencyInjection

import com.devvin.dagger2application.model.ContactDetails
import dagger.Component

@Component
interface ContactDetailsComponent {

    fun getContactDetails(): ContactDetails
}