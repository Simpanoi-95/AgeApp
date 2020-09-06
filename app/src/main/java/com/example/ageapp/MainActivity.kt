package com.example.ageapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import android .view .View
import java.util.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun onSubmit(view:View){
        val currentYear= Calendar.getInstance().get(Calendar.YEAR)
        etAge.text="Age : " +(currentYear-inputYear.text.toString().toInt())
    }
}