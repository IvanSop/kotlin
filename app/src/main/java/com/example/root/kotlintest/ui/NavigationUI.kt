package com.example.root.kotlintest.ui

import android.content.Intent
import android.view.View
import android.widget.ListAdapter
import com.example.root.kotlintest.NavigationActivity
import com.example.root.kotlintest.R
import com.example.root.kotlintest.models.User
import org.jetbrains.anko.*

/**
 * Created by root on 15.6.16..
 */
class NavigationUI(activity: NavigationActivity) : AnkoComponent<NavigationActivity> {


    val activity = activity;
    var mAdapter: ListAdapter? = null

    override fun createView(ui: AnkoContext<NavigationActivity>) = with(ui) {

        //var mAdapter : ListAdapter? = null

        val xx = activity.intent.extras["uname"];
        //toast(xx as String)

        mAdapter = com.example.root.kotlintest.adapters.ListAdapter(owner)
        verticalLayout {

            var dialog = relativeLayout() {
                //cancellable(false)
                visibility = View.GONE

                var user = editText() {
                    hint = "Username"
                    id = R.id.newUsername
                }.lparams {
                    centerHorizontally()
                }

                var pass = editText {
                    hint = "Password"
                    id = R.id.newPassword
                }.lparams {
                    centerHorizontally()
                    below(R.id.newUsername)
                }

                var btn = button("Create") {
                    onClick {
                        (mAdapter as com.example.root.kotlintest.adapters.ListAdapter).addItem(User(user.text.toString(), pass.text.toString()))
                        (parent as _RelativeLayout).visibility = View.GONE
                        //dismiss()
                    }
                }.lparams {
                    centerHorizontally()
                    below(R.id.newPassword)
                }
            }.lparams {
               // setPadding(dip(50), dip(200), dip(50), dip(200))
            }


            button("Add") {
                id = R.id.asd
                onClick {
                    dialog.visibility = View.VISIBLE
                    //dialog.show()
                    //(mAdapter as com.example.root.kotlintest.adapters.ListAdapter).addItem(User("asd", "fga"))
                }
            }


            relativeLayout {
                textView("List") {
                    textSize = 30f
                }.lparams {
                    centerHorizontally()
                }

            }
            listView {
                adapter = mAdapter
                id = R.id.list
            }


            textView(xx as String) {

            }
        }


        //val xx = intent.extras["uname"];
        //toast(xx as String)
//        //val x = JavaHelp.getStringExtra(this);
//        verticalLayout {
//            textView { text = xx as String}
//        }


        //throw UnsupportedOperationException()
    }


}