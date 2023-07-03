package com.ankur.roomdatabase

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase


@Database(entities = [Contact::class], version = 1)
abstract class ContactDatabase :RoomDatabase(){


    abstract fun contactDao():ContactDAO


//    Here we create an singleton of database so that only one instance of database is used


    companion object{


        @Volatile
        private  var INSTANCE :ContactDatabase?=null

        fun getDatabase(context: Context):ContactDatabase{

            if (INSTANCE==null)

            {
            synchronized(this){

                INSTANCE=Room.databaseBuilder(context.applicationContext,
                    ContactDatabase::class.java
                ,"contactDB").build()
            }

            }

            return INSTANCE!!


        }
    }

}