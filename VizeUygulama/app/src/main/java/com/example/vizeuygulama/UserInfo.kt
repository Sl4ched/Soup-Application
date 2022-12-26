package com.example.vizeuygulama

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.View
import android.widget.ImageView
import android.widget.ProgressBar
import android.widget.TextView

class UserInfo : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_user_info)

        val Otext = findViewById<TextView>(R.id.Ö)
        val Mtext = findViewById<TextView>(R.id.M)
        val Etext = findViewById<TextView>(R.id.E)
        val Rtext = findViewById<TextView>(R.id.R)
        val tickO = findViewById<ImageView>(R.id.tickÖ)
        val tickM = findViewById<ImageView>(R.id.tickM)
        val tickE = findViewById<ImageView>(R.id.tickE)
        val tickR = findViewById<ImageView>(R.id.tickR)
        val progressBar = findViewById<ProgressBar>(R.id.progressBar)

        Otext.setOnClickListener {

            tickO.visibility = View.VISIBLE
            Otext.isClickable = false

            Mtext.setOnClickListener {

                tickM.visibility = View.VISIBLE
                Mtext.isClickable = false

                Etext.setOnClickListener {

                    tickE.visibility = View.VISIBLE
                    Etext.isClickable = false

                    Rtext.setOnClickListener {

                        tickR.visibility = View.VISIBLE
                        progressBar.visibility = View.VISIBLE
                        Rtext.isClickable = false

                        Handler().postDelayed({

                            val intent = Intent(applicationContext,Soup::class.java)
                            startActivity(intent)
                            finish()

                        },3000)

                    }

                }

            }

        }




    }
}