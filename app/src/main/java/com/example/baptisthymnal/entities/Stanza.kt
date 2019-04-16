package com.example.baptisthymnal.entities

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "Stanzas")
data class Stanza (
    @PrimaryKey()
    @ColumnInfo(name = "_id")
    var stanzaId: Int = 0,

    @ColumnInfo(name = "content")
    var content: String,

    @ColumnInfo(name = "hymn_id")
    var hymnId: Int
)