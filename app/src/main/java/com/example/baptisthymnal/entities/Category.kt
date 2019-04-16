package com.example.baptisthymnal.entities

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "Categories")
data class Category (
    @PrimaryKey()
    @ColumnInfo(name = "id")
    var categoryId: Int = 0,

    @ColumnInfo(name = "category_name")
    var categoryName: String? = ""
    )