package com.devvin.dagger2application.dependencyInjection

import android.provider.ContactsContract
import com.devvin.dagger2application.model.Address
import com.devvin.dagger2application.model.ContactDetails
import com.devvin.dagger2application.model.Employee
import com.devvin.dagger2application.model.Salary
import dagger.Module
import dagger.Provides

@Module
class SalaryModule(
    private val hra: Int,
    private val basic: Int,
    private val allowance: Int,
    private val employeeName: String,

    private val mobile : Long,
    private val email : String,

    private val houseNo: String,
    private val road: String,
    private val city: String,
    private val country: String
) {

    @Provides
    fun providesEmployee(): Employee {
        return Employee(
            employeeName,
            providesSalary(),
            providesContactDetails(),
            DaggerResidenceComponent.create().getResidence()
        )
    }

    @Provides
    fun providesSalary(): Salary {
        return Salary(hra, basic, allowance)
    }

    @Provides
    fun providesContactDetails(): ContactDetails {
        return ContactDetails(mobile,email)
    }

    @Provides
    fun providesAddress(): Address {
        return Address(
//            houseNo,
//            road,
//            city,
//            country
        )
    }
}