package com.example.projectbp_2691

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.projectbp_2691.HomeActivity

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        //Instance
        val btnLogin:Button = findViewById(R.id.buttonlogin)

        //Event
        btnLogin.setOnClickListener {
            //call home activity
            val intentHome = Intent(this,HomeActivity::class.java)
            startActivity(intentHome)
        }

    }
}