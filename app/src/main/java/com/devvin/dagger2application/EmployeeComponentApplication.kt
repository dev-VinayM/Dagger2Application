package com.devvin.dagger2application

import android.app.Application
import com.devvin.dagger2application.dependencyInjection.DaggerEmployeeComponent
import com.devvin.dagger2application.dependencyInjection.EmployeeComponent
import com.devvin.dagger2application.dependencyInjection.SalaryModule

class EmployeeComponentApplication : Application() {
    lateinit var employeeComponent: EmployeeComponent

    override fun onCreate() {
        employeeComponent = initDagger()
        super.onCreate()
    }

    private fun initDagger(): EmployeeComponent =
        DaggerEmployeeComponent.builder()
            .salaryModule(
                SalaryModule(
                    4000, 15000, 6000, "Vinay",
                    9898789856, "email@gmail.com",
                    "houseNo.", "road", "city", "country"
                )
            )
            .build()
}