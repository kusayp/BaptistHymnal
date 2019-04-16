package com.example.baptisthymnal.entities

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "Hymns")
data class Hymn (
    @PrimaryKey()
    @ColumnInfo(name = "_id")
    var Id: Int = 0,

    @ColumnInfo(name = "name")
    var hymnName: String,

    @ColumnInfo(name = "category_id")
    var categoryId: Int,

    @ColumnInfo(name = "has_refrain")
    var hasRefrain: Boolean,

    @ColumnInfo(name = "refrain")
    var refrain: String,

    @ColumnInfo(name = "favourite")
    var favourite: String,

    @ColumnInfo(name = "author")
    var author: String
)