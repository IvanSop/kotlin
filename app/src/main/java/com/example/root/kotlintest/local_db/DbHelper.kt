package com.example.root.kotlintest.local_db

import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.util.Log
import org.jetbrains.anko.db.*

/**
 * Created by root on 16.6.16..
 */
class DbHelper(context: Context) : ManagedSQLiteOpenHelper(context, "KotlinDatabase", null, 1) {
    companion object {
        private var instance: DbHelper? = null

        @Synchronized
        fun getInstance(context: Context): DbHelper {
            if (instance == null) {
                instance = DbHelper(context.applicationContext)
            }
            return instance!!
        }
    }

    override fun onCreate(db: SQLiteDatabase?) {
        //throw UnsupportedOperationException()
        use {
            createTable("User", true,
                    "_id" to INTEGER + PRIMARY_KEY + UNIQUE,
                    "username" to TEXT,
                    "password" to TEXT)
        }
    }

    override fun onUpgrade(db: SQLiteDatabase?, oldVersion: Int, newVersion: Int) {
        //throw UnsupportedOperationException()
        use {
            dropTable("User", true)
            createTable("User", true,
                    "_id" to INTEGER + PRIMARY_KEY + UNIQUE,
                    "username" to TEXT,
                    "password" to TEXT)
        }
    }
}