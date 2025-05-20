package com.huillca.amphibians

import android.app.Application
import com.huillca.amphibians.data.AppContainer
import com.huillca.amphibians.data.DefaultAppContainer

class AmphibiansApplication : Application() {
    lateinit var container: AppContainer
    override fun onCreate() {
        super.onCreate()
        container = DefaultAppContainer()
    }
}
