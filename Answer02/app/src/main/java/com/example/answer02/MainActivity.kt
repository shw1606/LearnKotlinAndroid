package com.example.answer02

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var num1: Int? = null
    var num2: Int? = null
    var num3: Int? = null
    var num4: Int? = null
    var num5: Int? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button2.setOnClickListener {
            val string1 = if (editTextTextPersonName.text.toString() !== "") editTextTextPersonName.text.toString() else "0"
            val string2 = if (editTextTextPersonName2.text.toString() !== "") editTextTextPersonName2.text.toString() else "0"
            val string3 = if (editTextTextPersonName3.text.toString() !== "") editTextTextPersonName3.text.toString() else "0"
            val string4 = if (editTextTextPersonName4.text.toString() !== "") editTextTextPersonName4.text.toString() else "0"
            val string5 = if (editTextTextPersonName5.text.toString() !== "") editTextTextPersonName5.text.toString() else "0"
            num1 = string1.toIntOrNull()
            num2 = string2.toIntOrNull()
            num3 = string3.toIntOrNull()
            num4 = string4.toIntOrNull()
            num5 = string5.toIntOrNull()

            if (num1 == null || num2 == null || num3 == null || num4 == null || num5 == null) {
                textView.setText("에러: 입력하지 않은 숫자가 있습니다.");
            } else {
                textView.setText((num1!! + num2!! + num3!! + num4!! + num5!!).toString())
            }
        }
    }
}