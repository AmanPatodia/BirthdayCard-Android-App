package com.example.birthdaycard

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class BirthdayCardCreated : AppCompatActivity() {

    companion object {
        const val name_extra = "name_Extra"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_birthday_card_created)

        val name = intent.getStringExtra(name_extra)
        val happytext: TextView = findViewById(R.id.Happybirthdaytext)
        happytext.setText("Happy Birthday\n $name!")
    }
}