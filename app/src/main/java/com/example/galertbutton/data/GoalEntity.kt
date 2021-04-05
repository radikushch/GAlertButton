package com.example.galertbutton.data

import androidx.room.*
import java.util.*

@Entity(
    tableName = "goals",
    foreignKeys = [
        ForeignKey(
            entity = GoalCategoryEntity::class,
            parentColumns = ["id"],
            childColumns = ["category_id"]
        )
    ]
)
@TypeConverters(GoalEntity::class)
data class GoalEntity(
    @PrimaryKey(autoGenerate = true)
    val id: Long = 0,
    val name: String,
    @ColumnInfo(name = "category_id")
    val categoryId: Long = -1,
    val deadline: Date
) {

    companion object {

        @TypeConverter
        @JvmStatic
        fun fromDate(date: Date): Long {
            return date.time
        }

        @TypeConverter
        @JvmStatic
        fun toDate(time: Long): Date {
            return Date(time)
        }
    }
}


