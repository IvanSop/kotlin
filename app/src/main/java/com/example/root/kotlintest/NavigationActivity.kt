package com.example.root.kotlintest

import android.os.Bundle
import android.support.design.widget.TabLayout
import android.support.v7.app.AppCompatActivity
import android.widget.TabHost
import com.example.root.kotlintest.adapters.TabAdapter
import kotlinx.android.synthetic.main.activity_navigation.*

class NavigationActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_navigation)

        tab_layout.tabGravity = TabLayout.GRAVITY_FILL

        pager.adapter = TabAdapter(this)
        tab_layout.setupWithViewPager(pager)
        pager.addOnPageChangeListener(TabLayout.TabLayoutOnPageChangeListener(tab_layout))


    }


}
