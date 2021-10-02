package com.example.myapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Button

class MainActivity : AppCompatActivity() {

    lateinit var GussingWordButton: Button
    lateinit var GussingNumButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        GussingWordButton = findViewById(R.id.GussingWordButton)
        GussingNumButton = findViewById(R.id.GussingNumButton)

        GussingWordButton.setOnClickListener {
            val intent = Intent(this, wordGuess::class.java)
            startActivity(intent)
        }
        GussingNumButton.setOnClickListener {
            val intent = Intent(this, NumGusses::class.java)
            startActivity(intent)
        }

    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_bar, menu)
        return true
    }

    override fun onPrepareOptionsMenu(menu: Menu?): Boolean {

        var item1 = menu!!.getItem(2)
        item1.setVisible(false)
        return super.onPrepareOptionsMenu(menu)
    }


    override fun onOptionsItemSelected(item: MenuItem): Boolean {

        when (item.itemId) {
            R.id.NumGuess -> {
                val intent = Intent(this, NumGusses::class.java)
                startActivity(intent)
                return true
            }
            R.id.WordGuess -> {
                val intent = Intent(this, wordGuess::class.java)
                startActivity(intent)
                return true

            }
        }
        return super.onOptionsItemSelected(item)

    }


}



