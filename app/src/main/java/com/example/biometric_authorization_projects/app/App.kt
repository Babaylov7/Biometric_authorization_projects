package com.example.biometric_authorization_projects.app

import android.app.Application
import android.content.SharedPreferences

class App: Application() {

    private var userName = ""
    private lateinit var sharedPreferences: SharedPreferences

    override fun onCreate() {
        super.onCreate()

        sharedPreferences = getSharedPreferences(SHARED_SETTINGS, MODE_PRIVATE)
        userName = sharedPreferences.getString(USRE_NAME, "").toString()
    }




    companion object{
        private const val SHARED_SETTINGS = "sharedPreferences"
        private const val USRE_NAME = "user name"
    }
}