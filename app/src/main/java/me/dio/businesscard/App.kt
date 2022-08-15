package me.dio.businesscard

import android.app.Application
import me.dio.businesscard.data.AppDatabase
import me.dio.businesscard.data.BusinessCardRepository

class App : Application(){
    val database by lazy { AppDatabase.getDatabase(this) }
    val respository by lazy { BusinessCardRepository(database.businessDao()) }
}