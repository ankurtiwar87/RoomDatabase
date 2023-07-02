package com.ankur.roomdatabase

import androidx.room.Database
import androidx.room.RoomDatabase


@Database(entities = [Contact::class], version = 1)
abstract class ContactDatabase :RoomDatabase(){


    abstract fun contactDao():ContactDAO
}