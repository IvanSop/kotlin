package com.example.root.kotlintest.fragments

import android.os.Bundle
import android.support.v7.app.AppCompatDialogFragment
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.root.kotlintest.R
import kotlinx.android.synthetic.main.dialog.view.*
import kotlinx.android.synthetic.main.frag1.view.*
import org.jetbrains.anko.support.v4.dip

/**
 * Created by root on 16.6.16..
 */
class MyDialog() : AppCompatDialogFragment() {


    var owner : Frag1? = null

    fun newInstance(owner : Frag1) : MyDialog {
        val dial = MyDialog()
        dial.owner = owner
        return dial

    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        val v = LayoutInflater.from(context).inflate(R.layout.dialog, container, false)

        v.okBtn.setOnClickListener({
            owner?.addToList(v.dialogText1.text.toString(), v.dialogText2.text.toString())
            dismiss()
        })

        return v
    }

    override fun onResume() {
        super.onResume()
        dialog.window.setLayout(dip(300),dip(350))
    }

}