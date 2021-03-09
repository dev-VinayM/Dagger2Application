package com.devvin.dagger2application.dependencyInjection

import com.devvin.dagger2application.model.Residence
import dagger.Component

@Component
interface ResidenceComponent {
    fun getResidence(): Residence
}