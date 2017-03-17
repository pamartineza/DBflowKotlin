package com.greenlionsoft.dbflowkotlin

import android.app.Application
import com.raizlabs.android.dbflow.config.FlowConfig
import com.raizlabs.android.dbflow.config.FlowManager


class ApplicationAdapter : Application() {

    override fun onCreate() {
        super.onCreate()
        FlowManager.init(FlowConfig.Builder(this).openDatabasesOnInit(true).build())
    }
}