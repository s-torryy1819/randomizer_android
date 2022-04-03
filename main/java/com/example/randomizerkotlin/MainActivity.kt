package com.example.randomizerkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.SeekBar
import android.widget.TextView
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var rollButton = findViewById<Button>(R.id.rollButton)
        var resultsTextView = findViewById<TextView>(R.id.resultsTextView)
        var seekBar = findViewById<SeekBar>(R.id.seekBar)

        rollButton.setOnClickListener{
            val rand = Random.nextInt(seekBar.progress)
            resultsTextView.text = rand.toString()
        }

    }
}