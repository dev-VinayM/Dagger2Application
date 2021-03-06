package com.devvin.dagger2application.dependencyInjection

import com.devvin.dagger2application.MainActivity
import dagger.Component

@Component(modules = [SalaryModule::class])
interface EmployeeComponent {
    //it is not good to write getter methods for dependency injection as there can be many activities or fragments that require injection
//    fun getEmployee() : Employee

    //we write injector class
    fun inject(mainActivity: MainActivity)
}