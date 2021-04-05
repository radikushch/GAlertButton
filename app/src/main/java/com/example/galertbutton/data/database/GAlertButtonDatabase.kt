package com.example.galertbutton.data.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.sqlite.db.SupportSQLiteDatabase
import com.example.galertbutton.data.GoalCategoryEntity
import com.example.galertbutton.data.GoalEntity
import com.example.galertbutton.data.database.dao.GoalDao

@Database(
    entities = [
        GoalCategoryEntity::class,
        GoalEntity::class
    ],
    version = 1,
    exportSchema = false
)
abstract class GAlertButtonDatabase : RoomDatabase() {


    abstract fun goalDao(): GoalDao

    companion object {
        @Volatile
        private var _instance: GAlertButtonDatabase? = null

        fun getInstance(context: Context): GAlertButtonDatabase {
            var localInstance = _instance
            if(localInstance == null) {
                synchronized(GAlertButtonDatabase::class.java) {
                    localInstance =  _instance
                    if(localInstance == null) {
                        localInstance = buildDatabase(context)
                        _instance = localInstance
                    }
                }
            }
            return _instance!!
        }

        private fun buildDatabase(context: Context) = Room.databaseBuilder(
            context,
            GAlertButtonDatabase::class.java,
            "g-alert-button-db"
        ).addCallback(object : Callback() {
            override fun onCreate(db: SupportSQLiteDatabase) {
                super.onCreate(db)
                onCreatePrePopulation(db)
            }
        })
            .build()

        private fun onCreatePrePopulation(db: SupportSQLiteDatabase) {
            db.execSQL("INSERT INTO goal_categories (id, name) VALUES ('-1', 'undefined')")
        }
    }
}