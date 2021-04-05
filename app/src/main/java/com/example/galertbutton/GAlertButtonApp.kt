package com.example.galertbutton

import android.app.Application
import androidx.room.Room
import com.example.galertbutton.data.database.GAlertButtonDatabase
import java.lang.NullPointerException

class GAlertButtonApp : Application() {

    lateinit var database: GAlertButtonDatabase

    override fun onCreate() {
        super.onCreate()
        _instance = this
        database = GAlertButtonDatabase.getInstance(this)
    }

    companion object {
        private var _instance: GAlertButtonApp? = null
        val instance: GAlertButtonApp
            get() = _instance ?: throw NullPointerException("Application isn't initialized yet")
    }
}