package com.my.todoclean.feature_todo.data.data_source

import androidx.room.Database
import androidx.room.RoomDatabase
import com.my.todoclean.feature_todo.domain.model.Todo


@Database(
    entities = [Todo::class],
    version = 1
)
abstract class TodoDatabase : RoomDatabase() {

    abstract val todoDao: TodoDao

    companion object {
        const val DATABASE_NAME = "todos_db"
    }
}