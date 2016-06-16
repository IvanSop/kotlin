package com.example.root.kotlintest.adapters

import android.app.Activity
import android.content.Context
import android.graphics.Color
import android.support.annotation.LayoutRes
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView
import com.example.root.kotlintest.NavigationActivity
import com.example.root.kotlintest.R
import com.example.root.kotlintest.R.id.*
import com.example.root.kotlintest.models.User
import com.example.root.kotlintest.test.AsyncTest
import kotlinx.android.synthetic.main.list_item.view.*
import org.jetbrains.anko.*
import java.util.*

/**
 * Created by root on 15.6.16..
 */
class ListAdapter(val context: Context) : BaseAdapter() {



    private class Holder(val tv1 : TextView, val tv2 : TextView) {
    }

    override fun getItemId(position: Int): Long {
        return  position.toLong()
        //throw UnsupportedOperationException()
    }

    var list : ArrayList<User> = arrayListOf(User("user1", "pwd1"), User("user2", "pwd2"), User("user3", "pwd3"))

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View? {
        val item = getItem(position)

        val view = LayoutInflater.from(context).inflate(R.layout.list_item,parent, false)
        val holder :Holder = Holder(view.find(text1), view.find(text2))
        holder.tv1.text = item.username
        holder.tv2.text = item.password

        view.setOnClickListener({
           context.toast(holder.tv1.text.toString())
            list.removeAt(position)
            rebuild()
        })

        return view
    }

    fun addItem(user: User) {
        list.add(user)
        rebuild()
    }

    fun rebuild() {
        notifyDataSetChanged()
    }

    override fun getItem(position : Int) : User {
        return list[position]
    }

    override fun getCount() : Int {
        return list.size
    }



}