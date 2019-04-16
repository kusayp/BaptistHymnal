package com.example.baptisthymnal

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.baptisthymnal.entities.Category
import com.example.baptisthymnal.entities.Hymn
import com.example.baptisthymnal.entities.Stanza

@Database(entities = [Hymn::class, Category::class, Stanza::class], version = 2)
//@Database(entities = [Customers::class, Employees::class], version = 2)
abstract class AppDatabse: RoomDatabase(){
    abstract fun chinookDao(): ChinookDao
}