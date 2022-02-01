package com.example.intentpptkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class DetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)
        initViews()
    }

    fun initViews() {

        var text1 = findViewById<TextView>(R.id.tv_text1)
        var text2 = findViewById<TextView>(R.id.tv_text2)

        var name = intent.getStringExtra("name")
        var lastName = intent.getStringExtra("lastName")

        text1.text = name
        text2.text = lastName
    }
}