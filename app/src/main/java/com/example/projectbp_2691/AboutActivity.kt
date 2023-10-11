package com.example.projectbp_2691

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class AboutActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about)

        //Call
        val imgCall: ImageView = findViewById(R.id.imageViewCall)
        imgCall.setOnClickListener {
            val callIntent: Intent= Uri.parse("tel:08376213").let{
                    number-> Intent(Intent.ACTION_DIAL, number)
            }
            startActivity(callIntent)
        }

        //Web
        val imgWeb: ImageView = findViewById(R.id.imageViewWeb)
        imgWeb.setOnClickListener {
            val webIntent: Intent= Uri.parse("https://mhs.amikom.ac.id/").let{
                    webpage-> Intent(Intent.ACTION_VIEW, webpage)
            }
            startActivity(webIntent)
        }

        //Location
        val imgLocation: ImageView = findViewById(R.id.imageViewLocation)
        imgLocation.setOnClickListener {
            val gmmIntentUri = Uri.parse("geo:47.6,-122,3?z=11")
            val mapIntent =  Intent(Intent.ACTION_VIEW, gmmIntentUri)
            mapIntent.setPackage("com.google.android.apps.maps")
            if (mapIntent.resolveActivity(packageManager) != null)
                startActivity(mapIntent)
            }
        }


}
