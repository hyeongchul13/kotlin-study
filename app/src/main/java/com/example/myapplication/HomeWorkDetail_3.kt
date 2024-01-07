package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import org.w3c.dom.Text

class HomeWorkDetail_3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home_work_detail3)

        val nthPerson:String = intent.extras?.getString("nthPerson")?:""
        val nthPhoneNumber:String = intent.extras?.getString("nthPhoneNumber")?:""

        findViewById<TextView>(R.id.nthPerson).text = nthPerson
        findViewById<TextView>(R.id.nthPhoneNumber).text = nthPhoneNumber

    }
}