package com.example.intentpptkotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initViews()
    }

    fun initViews() {

        var button = findViewById<Button>(R.id.btn_send)
        button.setOnClickListener {
            openDetailActivity()
        }
    }

    fun openDetailActivity() {

        var intent = Intent(this, DetailActivity::class.java)
        intent.putExtra("name", "Kamron")
        intent.putExtra("lastName", "Qobilov")
        startActivity(intent)
    }
}