package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import org.w3c.dom.Text

class ApplicationActivityOne : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_application_one)

        findViewById<TextView>(R.id.change).setOnClickListener {
            startActivity(
                Intent(this, ApplicationActivityTwo::class.java)
            )
        }

        findViewById<TextView>(R.id.testMethod).setOnClickListener {
            (applicationContext as MasterApplication).methodFromApplication()
            val userid = (applicationContext as MasterApplication).userId
            Log.d("test", "user id is " + userid)
        }
    }
}