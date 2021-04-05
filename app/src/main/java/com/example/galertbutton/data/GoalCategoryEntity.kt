package com.example.galertbutton.data

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "goal_categories")
data class GoalCategoryEntity(
    @PrimaryKey(autoGenerate = false)
    val id: Long = 0,
    val name: String
)