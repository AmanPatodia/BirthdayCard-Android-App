package com.example.birthdaycard

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val birthdaybutton: Button = findViewById(R.id.createbutton)

        birthdaybutton.setOnClickListener {
            Toast.makeText(this, "Clicked", Toast.LENGTH_SHORT).show()
            val intent = Intent(this, BirthdayCardCreated::class.java)
            val nametext: TextView = findViewById(R.id.nametext)
            val nametext2 = nametext.editableText.toString()
            intent.putExtra(BirthdayCardCreated.name_extra, nametext2)
            startActivity(intent)
        }
    }
}