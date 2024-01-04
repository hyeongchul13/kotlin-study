package com.example.myapplication

import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class ViewControl_02 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view_control02)

        // 뷰를 코틀린 파일(Activity)로 가져오는 방법
        val textViewOne: TextView = findViewById(R.id.textViewOne)
        val buttonOne: Button = findViewById(R.id.buttonOne)
        Log.d("test", textViewOne.text.toString())

        // 풀버젼
        val clickListener = object : View.OnClickListener {
            override fun onClick(v: View?) {
                Log.d("test", "버튼 클릭!!")
            }
        }
        buttonOne.setOnClickListener(clickListener)

        // 축약 버젼 1 (익명함수)
        buttonOne.setOnClickListener(object : View.OnClickListener{
            override fun onClick(v: View?) {
                Log.d("test", "버튼 클릭!!")
            }
        })


        // Listener 사용 방법, 람다버젼
        buttonOne.setOnClickListener {
            // 버튼이 클릭 되었을때 동작할 코드
            Log.d("test","버튼 클릭!!")
        }
    }
}