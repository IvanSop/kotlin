package com.example.root.kotlintest.test

import android.widget.TextView
import org.jetbrains.anko.doAsync
import org.jetbrains.anko.uiThread

/**
 * Created by root on 15.6.16..
 */

public class AsyncTest {



    fun someBackgroundWork(tv : TextView) {
        doAsync {
            for (x in 1..10000) {
                Thread.sleep(500)
                //updateUi(x);
                uiThread {
                    tv.text = x.toString()
                }
            }
        }
    }

}