package com.example.root.kotlintest.adapters

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentStatePagerAdapter
import android.support.v7.app.AppCompatActivity
import com.example.root.kotlintest.fragments.Frag1

/**
 * Created by root on 16.6.16..
 */
class TabAdapter(activity : AppCompatActivity) : FragmentStatePagerAdapter(activity.supportFragmentManager) {

    override fun getItem(position: Int): Fragment? {

        when(position) {
            0 -> { return Frag1() }
            1 -> { return Frag1() }
            2 -> { return Frag1() }
            else -> {
                throw RuntimeException("invalid nubmer of tabs")
            }
        }

        //throw UnsupportedOperationException()
    }

    override fun getCount(): Int {
        return 3;
        //throw UnsupportedOperationException()
    }

    override fun getPageTitle(position: Int): CharSequence? {

        when (position) {
            0 -> return "Tab 1"
            1 -> return "Tab 2"
            2 -> return "Tab 3"
            else -> {
                throw RuntimeException("invalid tab number")
            }
        }
    }
}