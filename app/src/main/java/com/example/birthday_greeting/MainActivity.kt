package com.example.birthday_greeting

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun BirthdayButton(view: View)
    {
        val name = BirthdayName.editableText.toString()
        Toast.makeText(this,"Your choice is $name ", Toast.LENGTH_LONG).show()

        val intent = Intent(this,BirthdayCard::class.java)
        intent.putExtra(BirthdayCard.NAME_EXTRA,name)
        startActivity(intent)


    }
}