package com.example.calculator

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private var canAddOperator =false
    private var canAddDecimal =true

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }
    fun numberAction(view: View) {
        if(view is Button)
        {
            if(view.text == ".")
            {
                if(canAddDecimal)
                    workingTV.append(view.text)
                canAddDecimal = false
            }
            else
            workingTV.append(view.text)

            canAddOperator = true
        }
    }
    fun operatorAction(view: View) {
        if(view is Button && canAddOperator)
        {
            workingTV.append(view.text)
            canAddOperator = false
            canAddDecimal = true
        }
    }

    fun clearAction(view: View) {
        workingTV.text = ""
        viewResult.text = ""
    }
    fun backSpaceAction(view: View) {
        var length = workingTV.length()
        if(length > 0)
            workingTV.text = workingTV.text.subSequence(0,length-1)
    }
    fun equalsAction(view: View) {

    }
}