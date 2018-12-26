package com.mohancm.countmekotlin

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.annotation.IntegerRes
import android.view.View
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun toastMe(view: View){
        // val myToast = Toast.makeText(this, message, duration);
        val myToast = Toast.makeText(this, "Hello Kotlin", Toast.LENGTH_SHORT)
        myToast.show()
    }

    fun countMe (view: View){
        // get the TextView
        val showCountTextView = findViewById<TextView>(R.id.textView)

        // Get the value of the text View.
        val countString = showCountTextView.text.toString()

        // Convert value to a number and Increment it
        var count: Int = Integer.parseInt(countString)
        count++

        // Display the  new value in the text view.
        showCountTextView.text = count.toString()
    }

    fun randomMe (view: View){
        // Create  an Intent to start the second activity
        val randomIntent  = Intent(this, SecondActivity::class.java)

        // get the current vale of the text view.
        val countString = textView.text.toString()

        // Convert the count to an int
        val count = Integer.parseInt(countString)

        // Add the count to the extras for the Intent.
        randomIntent.putExtra(SecondActivity.TOTAL_COUNT, count)

        // Start th new activity
        startActivity(randomIntent)
    }
}
