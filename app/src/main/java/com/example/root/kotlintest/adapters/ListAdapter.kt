package com.example.root.kotlintest.adapters

import android.app.Activity
import android.graphics.Color
import android.util.Log
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import com.example.root.kotlintest.NavigationActivity
import com.example.root.kotlintest.R
import com.example.root.kotlintest.R.id.asd
import com.example.root.kotlintest.R.id.usernameText
import com.example.root.kotlintest.models.User
import com.example.root.kotlintest.test.AsyncTest
import org.jetbrains.anko.*
import java.util.*

/**
 * Created by root on 15.6.16..
 */
class ListAdapter(val activity: NavigationActivity) : BaseAdapter() {

    override fun getItemId(position: Int): Long {
        return  position.toLong()
        //throw UnsupportedOperationException()
    }

    var list : ArrayList<User> = arrayListOf(User("user1", "pwd1"), User("user2", "pwd2"), User("user3", "pwd3"))

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View? {
        val item = getItem(position)

        return with(parent!!.context) {
            relativeLayout {
                textView(item.username) {
                    textSize = 32f
                    id = usernameText
                }
                textView(item.password) {
                    textSize = 16f
                }.lparams {
                    alignParentBottom()
                    alignParentRight()
                }
                onClick {
                    alert("Hi, I'm Roy", "Have you tried turning it off and on again?") {
                        yesButton {
                            toast("Oh…")
                        }
                        noButton {
                            toast("Oh…")
                        }
                    }.show()
                }
            }
        }

        //throw UnsupportedOperationException()
    }

    fun addItem(user: User) {
        list.add(user)
        rebuild()
    }

    fun rebuild() {
        notifyDataSetChanged()
    }

    override fun getItem(position : Int) : User {
        return list.get(position)
    }

    override fun getCount() : Int {
        return list.size
    }



}