package com.example.calculator

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnAdd.setOnClickListener {
        var num1:Double = (etnum1.text.toString()).toDouble();
        var num2:Double = (etnum2.text.toString()).toDouble();
        var rs:Double = num1 + num2;
        txtResult.text = rs.toString();
        }
    }
}