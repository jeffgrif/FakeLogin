package com.example.fakelogin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.AlarmClock.EXTRA_MESSAGE
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

const val CORRECT_LOGIN = "jeff"
const val CORRECT_PASSWORD = "jeff1"

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Set reference to views
        val loginButton = findViewById<Button>(R.id.button)
        val loginField = findViewById<EditText>(R.id.login)
        val passwordField = findViewById<EditText>(R.id.password)

        // Listen for login button and provide authentication
        loginButton.setOnClickListener {
            if(loginField.text.toString() == CORRECT_LOGIN && passwordField.text.toString() == CORRECT_PASSWORD){
                Toast.makeText(this@MainActivity, "Login successful!", Toast.LENGTH_SHORT).show()
                val intent = Intent(this, SuccessActivity::class.java)
                intent.putExtra("name", loginField.text.toString())
                startActivity(intent)
            } else {
                Toast.makeText(this@MainActivity, "Login unsuccessful!", Toast.LENGTH_SHORT).show()
            }
        }
    }
}