package com.demo.amitav.mynewsapp.ui.database

import androidx.room.TypeConverter
import com.demo.amitav.mynewsapp.ui.models.Source

class Converters {

    @TypeConverter
    fun fromSource(source: Source): String {
        return source.name ?: ""
    }

    @TypeConverter
    fun toSource(name: String): Source {
        return Source(name, name)
    }
}