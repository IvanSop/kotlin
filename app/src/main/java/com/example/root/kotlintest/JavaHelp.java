package com.example.root.kotlintest;

import android.content.Context;

/**
 * Created by root on 15.6.16..
 */
public class JavaHelp {

public static String getStringExtra(Context context) {
    return ((NavigationActivity)context).getIntent().getExtras().getString("uname");
}

}
