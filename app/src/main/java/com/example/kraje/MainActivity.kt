package com.example.kraje

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.AutoCompleteTextView
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val autotextView = findViewById<AutoCompleteTextView>(R.id.autoCompleteTextView)
        val kraje =  resources.getStringArray(R.array.kraje)
        val arrayAdapter = ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, kraje)
        autotextView.setAdapter(arrayAdapter)
    }
}