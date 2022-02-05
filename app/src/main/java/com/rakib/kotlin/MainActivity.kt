package com.rakib.kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val editText = findViewById<EditText>(R.id.editText) as EditText
        val button = findViewById<Button>(R.id.button) as Button
        val textView = findViewById<TextView>(R.id.textview)

        button.setOnClickListener(View.OnClickListener {
            Toast.makeText(this, editText.text, Toast.LENGTH_LONG).show()
            textView.text = editText.text
        })

    }
}