package com.example.root.kotlintest;

import android.content.Context;
import android.widget.ListView;

import com.example.root.kotlintest.adapters.ListAdapter;

/**
 * Created by root on 15.6.16..
 */
public class JavaHelp {

public static String getStringExtra(Context context) {
    return ((NavigationActivity)context).getIntent().getExtras().getString("uname");
}

public static void adapter(NavigationActivity nav) {
    ListAdapter adapter = new ListAdapter(nav);
    //ListView listView = (ListView) nav.findViewById(R.id.listView);
    //listView.setAdapter(adapter);
}

}
