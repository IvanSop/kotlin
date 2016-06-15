package com.example.root.kotlintest

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.*
import android.view.View
import android.widget.ArrayAdapter
import android.widget.ListAdapter
import com.example.root.kotlintest.ui.NavigationUI
import java.util.*
import kotlinx.android.synthetic.main.activity_login.*
import org.jetbrains.anko.*

class NavigationActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_navigation)
        NavigationUI(this).setContentView(this)

    }




}
