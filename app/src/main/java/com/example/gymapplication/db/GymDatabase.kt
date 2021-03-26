package com.example.gymapplication.db

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase


@Database(entities = [CustomerDetails::class],version = 1,exportSchema = false)
abstract class GymDatabase: RoomDatabase() {

    companion object {

        @Volatile
        private var INSTANCE:GymDatabase? = null

        fun getInstance(context: Context):GymDatabase{
            synchronized(this){
                var instance = INSTANCE
                if (instance == null) {
                    instance = Room.databaseBuilder(
                        context.applicationContext,
                        GymDatabase::class.java,
                        "GymDatabase"
                    )

                        .build()
                    INSTANCE = instance
                }
                return instance
            }
        }
    }
    abstract fun GymDao(): GymDao
}
