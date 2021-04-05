package com.example.galertbutton.data.database.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.example.galertbutton.data.GoalCategoryEntity
import com.example.galertbutton.data.GoalEntity

@Dao
interface GoalDao {

    @Insert
    suspend fun saveGoals(goalEntities: List<GoalEntity>)

    @Query("SELECT * FROM goals")
    suspend fun getAllGoals(): List<GoalEntity>

    @Insert
    suspend fun insertGoalCategory(goalCategoryEntity: GoalCategoryEntity)
}