package com.example.projectbp_2691

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        //Instance
        val btnAbout: Button = findViewById(R.id.buttonAboutUs)
        //Event
        btnAbout.setOnClickListener {
            //call home activity
            val intentAbout = Intent(this, AboutActivity::class.java)
            startActivity(intentAbout)
        }

        //Instance
        val btnBookKid: Button = findViewById(R.id.buttonBookKid)
        //Event
        btnBookKid.setOnClickListener {
            //call home activity
            val intentBookKid = Intent(this, BookKidActivity::class.java)
            startActivity(intentBookKid)
        }


    }
}