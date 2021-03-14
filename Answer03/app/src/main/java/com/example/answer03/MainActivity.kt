package com.example.answer03

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var num1: Int? = null
    var num2: Int? = null
    var oper: ((Int, Int) -> Int)? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        fun getOperator(name: String): ((Int, Int) -> Int)? {
            var oper:((Int, Int) -> Int)? = null
            when (name) {
                "add" -> {oper = {a, b -> a + b}}
                "subtract" -> {oper = {a, b -> a - b}}
                "multiply" -> {oper = {a, b -> a * b}}
                "divide" -> {oper = {a, b -> a / b}}
            }
            return oper
        }

        fun calc() {
            num1 = editTextNumber.text.toString().toIntOrNull()
            num2 = editTextNumber2.text.toString().toIntOrNull()
            if (num1 == null || num2 == null) {
                textView.setText("숫자를 입력해주세요")
                return@calc
            }
            if (oper == null) {
                return@calc
            }
            textView.setText((oper!!(num1!!, num2!!)).toString())
        }

        button5.setOnClickListener {
            oper = getOperator("add")
            calc()
        }
        button6.setOnClickListener {
            oper = getOperator("subtract")
            calc()
        }
        button7.setOnClickListener {
            oper = getOperator("multiply")
            calc()
        }
        button8.setOnClickListener {
            oper = getOperator("divide")
            calc()
        }

    }
}