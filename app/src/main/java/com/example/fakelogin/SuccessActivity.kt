package com.example.fakelogin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class SuccessActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_success)

        // Set reference to views
        val logoutButton = findViewById<Button>(R.id.logoutButton)
        val topText = findViewById<TextView>(R.id.topText)

        // Get extra
        val name = intent.getStringExtra("name")

        // Set the toptext in the UI to welcome the user by name
        topText.text = getString(R.string.welcome, name)

        // welcome the user with a toast
        Toast.makeText(this@SuccessActivity, "Welcome " + name + "!", Toast.LENGTH_SHORT).show()

        logoutButton.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}