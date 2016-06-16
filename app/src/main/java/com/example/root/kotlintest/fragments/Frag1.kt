package com.example.root.kotlintest.fragments

import android.os.Bundle
import android.support.v4.app.Fragment
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.root.kotlintest.NavigationActivity
import com.example.root.kotlintest.R
import com.example.root.kotlintest.adapters.ListAdapter
import com.example.root.kotlintest.local_db.DbHelper
import com.example.root.kotlintest.models.User
import kotlinx.android.synthetic.main.frag1.*
import kotlinx.android.synthetic.main.frag1.view.*
import org.jetbrains.anko.db.insert
import org.jetbrains.anko.doAsync
import org.jetbrains.anko.support.v4.onUiThread
import org.jetbrains.anko.support.v4.toast

/**
 * Created by root on 16.6.16..
 */
class Frag1 : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        val view = inflater.inflate(R.layout.frag1, container, false)
        view.listView.adapter = ListAdapter(context)
        view.addBtn.setOnClickListener({
            val d = MyDialog().newInstance(this)
            d.show(fragmentManager,"wtf")
        })

        return view
    }

    fun addToList(uname : String, pass : String) {
        (view?.listView?.adapter as ListAdapter).addItem(User(uname, pass))
        /*
        val x = DbHelper.getInstance(context);
        x.use {
            Log.d("assd", "ffff")
            insert("User", "_id" to 43, "username" to uname, "password" to pass)
        }
        */

    }
}