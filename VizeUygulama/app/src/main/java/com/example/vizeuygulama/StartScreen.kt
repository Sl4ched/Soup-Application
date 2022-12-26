package com.example.vizeuygulama

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import android.os.Handler
import android.widget.TextView

class StartScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_start_screen)

        val textCorbaci = findViewById<TextView>(R.id.textCorbaci)

        var textSize = 15.0F

        object : CountDownTimer(800,1){

            override fun onTick(p0: Long) {

                textCorbaci.textSize = textSize++

            }

            override fun onFinish() {

                Handler().postDelayed({

                    val intent = Intent(applicationContext,UserInfo::class.java)
                    startActivity(intent)
                    finish()

                },3000)

            }


        }.start()



    }
}