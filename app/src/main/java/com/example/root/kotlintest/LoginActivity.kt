package com.example.root.kotlintest

import android.app.Notification
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.text.InputType
import android.widget.Toast
import com.example.root.kotlintest.ui.LoginUI
import org.jetbrains.anko.*

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val uname = defaultSharedPreferences.getString("username", null)

        if (uname != null) {
            startActivity<NavigationActivity>("uname" to uname)

        }

        //setContentView(R.layout.activity_login)
        LoginUI().setContentView(this)

    }
}
