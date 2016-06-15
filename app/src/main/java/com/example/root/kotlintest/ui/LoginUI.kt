package com.example.root.kotlintest.ui

import android.text.InputType
import com.example.root.kotlintest.LoginActivity
import com.example.root.kotlintest.NavigationActivity
import org.jetbrains.anko.*

/**
 * Created by root on 15.6.16..
 */
class LoginUI: AnkoComponent<LoginActivity> {
    override fun createView(ui: AnkoContext<LoginActivity>) = with(ui){
        verticalLayout {
            setPadding(dip(50), dip(200), dip(50), dip(200))
            val username = editText {
                hint = "Username"

            }
            val password = editText {
                inputType = InputType.TYPE_CLASS_TEXT or InputType.TYPE_TEXT_VARIATION_PASSWORD
                hint = "Password"
            }
            button("Login") {
                onClick {
                    if ((username.text.toString()).equals("A") && (password.text.toString()).equals("a")) {
                        toast("Success!")
                        startActivity<NavigationActivity>("uname" to password.text.toString())
                    } else {
                        longToast("Failure! ${username.text} - ${password.text}")
                    }
                }
            }

        }
    }
}