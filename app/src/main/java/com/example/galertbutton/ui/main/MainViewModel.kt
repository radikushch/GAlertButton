package com.example.galertbutton.ui.main

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.galertbutton.GAlertButtonApp
import com.example.galertbutton.data.GoalEntity
import kotlinx.coroutines.launch
import java.util.*

class MainViewModel : ViewModel() {

    private val goalsDao = GAlertButtonApp.instance.database.goalDao()


    fun saveGoal() {
        viewModelScope.launch {
            goalsDao.saveGoals(
                listOf(
                    GoalEntity(
                        name = "First goal",
                        deadline = Date(1619004861000)
                    )
                )
            )
        }
    }

    fun getGoals() {
        viewModelScope.launch {
            val goals = goalsDao.getAllGoals()
            Log.d("RAD", goals.toString())
        }
    }

}