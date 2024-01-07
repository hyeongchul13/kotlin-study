package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.widget.LinearLayoutCompat

class HomeWork_3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home_work3)

        var personList = mutableListOf<Person>()
        for (i in 0..20) {
            personList.add(Person("" + i + "번째 사람", "010-000-000" + i))
        }

        val container = findViewById<LinearLayoutCompat>(R.id.container)
        val inflater = LayoutInflater.from(this@HomeWork_3)
        personList.forEach { person ->
            val personItemView = inflater.inflate(R.layout.personnumber_item, null)
            val personImage = personItemView.findViewById<ImageView>(R.id.personImage)
            val nthPerson = personItemView.findViewById<TextView>(R.id.nthPerson)
            val nthPhoneNumber = personItemView.findViewById<TextView>(R.id.nthPhoneNumber)

            personImage.setImageDrawable(resources.getDrawable(R.drawable.blue_background, theme))
            nthPerson.text = person.nthPerson
            nthPhoneNumber.text = person.nthPhoneNumber

            container.addView(personItemView)

            personItemView.setOnClickListener {
                startActivity(
                    Intent(this, HomeWorkDetail_3::class.java).apply {
                        this.putExtra("nthPerson", person.nthPerson)
                        this.putExtra("nthPhoneNumber", person.nthPhoneNumber)
                    }
                )
            }
        }
    }
}

class Person(val nthPerson: String, val nthPhoneNumber: String)