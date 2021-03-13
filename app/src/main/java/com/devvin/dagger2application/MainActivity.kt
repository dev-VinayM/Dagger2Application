package com.devvin.dagger2application

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.devvin.dagger2application.model.Employee
import javax.inject.Inject

class MainActivity : AppCompatActivity() {
    @Inject
    lateinit var employee: Employee

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        (application as EmployeeComponentApplication).employeeComponent
            .inject(this)
        findViewById<TextView>(R.id.textView).text =
            employee.salary.allowance.toString() + "/" + employee.name
    }
}