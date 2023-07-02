package com.ankur.roomdatabase

import androidx.lifecycle.LiveData
import androidx.room.*


@Dao
//Here we declare all the function to perform on database and use Coroutines along with Livedata
interface ContactDAO {

    @Insert
    suspend fun insertContact(contact: Contact)

    @Update
    suspend fun updateContact(contact: Contact)

    @Delete
    suspend fun deleteContact(contact: Contact)


    @Query("SELECT * FROM contact")
    fun getContact() :LiveData<List<Contact>>

}