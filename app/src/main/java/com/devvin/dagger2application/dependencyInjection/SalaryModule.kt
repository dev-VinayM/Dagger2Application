package com.devvin.dagger2application.dependencyInjection

import com.devvin.dagger2application.model.Employee
import com.devvin.dagger2application.model.Salary
import dagger.Module
import dagger.Provides

@Module
class SalaryModule(
    private val hra: Int,
    private val basic: Int,
    private val allowance: Int,
    private val employeeName: String
) {

    @Provides
    fun providesEmployee(): Employee {
        return Employee(
            employeeName,
            providesSalary(),
            DaggerContactDetailsComponent.create().getContactDetails()
        )
    }

    @Provides
    fun providesSalary(): Salary {
        return Salary(hra, basic, allowance)
    }
}