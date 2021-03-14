package com.example.answer01

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button.setOnClickListener {
            textView.setText("입력한 값: ${editTextTextPersonName.text}")
        }

        button2.setOnClickListener {
            textView.setText("입력한 값: ${editTextTextPersonName2.text}")
        }
    }
}