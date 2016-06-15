package com.example.root.kotlintest

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.text.InputType
import android.widget.Toast
import com.example.root.kotlintest.ui.LoginUI
import kotlinx.android.synthetic.main.activity_login.*
import org.jetbrains.anko.*

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_login)
        LoginUI().setContentView(this)

    }
}
