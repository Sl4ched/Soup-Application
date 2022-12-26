package com.example.vizeuygulama

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AlertDialog

class OrderFinish : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_order_finish)

        val topText = findViewById<TextView>(R.id.soupBitterAndSalty)
        val middleText = findViewById<TextView>(R.id.ingredientsAllList)

        var salt = intent.getStringExtra("salt")
        var bitter = intent.getStringExtra("bitter")
        val soup = intent.getStringExtra("soup")

        val isthereterbiye = intent.getBooleanExtra("isthereterbiye",false)
        val istherekitir = intent.getBooleanExtra("istherekitir",false)
        val istherenane = intent.getBooleanExtra("istherenane",false)
        val isthereyag = intent.getBooleanExtra("isthereyag",false)
        val istherelimon = intent.getBooleanExtra("istherelimon",false)
        val istherekasar = intent.getBooleanExtra("istherekasar",false)
        val istheretozbiber = intent.getBooleanExtra("istheretozbiber",false)
        val istheresarimsak = intent.getBooleanExtra("istheresarimsak",false)
        val istherekrema = intent.getBooleanExtra("istherekrema",false)
        val istherebeyin = intent.getBooleanExtra("istherebeyin",false)
        val istheredil = intent.getBooleanExtra("istheredil",false)
        val istheresirke = intent.getBooleanExtra("istheresirke",false)

        val exstra = intent.getStringExtra("exstra")

        val textExstra = findViewById<TextView>(R.id.exstra)
        val exit = findViewById<ImageView>(R.id.wrong)

        val warning = AlertDialog.Builder(this@OrderFinish)
        val newOrder = findViewById<TextView>(R.id.newOrder)

        val intent = Intent(applicationContext,Soup::class.java)


        if(exstra != "")  {//ekstra isteği yansıtır
            textExstra.visibility = View.VISIBLE
            textExstra.text = "Ekstra İstek : "+exstra
        }

        object : CountDownTimer(15000,500) {

            override fun onTick(p0: Long) {

                if(newOrder.visibility == View.VISIBLE) newOrder.visibility = View.INVISIBLE
                else newOrder.visibility = View.VISIBLE

            }
            override fun onFinish() {}
        }.start()

        exit.setOnClickListener{//çıkış

            warning.setTitle("Çıkış")
            warning.setMessage("Çıkış Yapmak İstediğinize Emin misiniz")
            warning.setIcon(R.drawable.wrong)
            warning.setPositiveButton("EVET"){DialogInterface, i-> System.exit(0)}
            warning.setNegativeButton("HAYIR"){DialogInterface, i->}
            warning.create().show()

        }

        newOrder.setOnClickListener {//yeni sipariş
            startActivity(intent)
            finish()
        }

        if (salt == null) salt = "0"
        if (bitter == null) bitter = "0"

        when(salt){

            "0" ->{

                when(bitter){

                    "0" -> {
                        topText.text = "Bir "+soup+" Çeeek,"+"Tuzsuz ve Acısız Olsun"
                    }
                    "1" -> {
                        topText.text = "Bir "+soup+" Çeeek,"+"Tuzsuz ve Orta Acılı Olsun"
                    }
                    "2" -> {
                        topText.text = "Bir "+soup+" Çeeek,"+"Tuzsuz ve Bol Acılı Olsun"
                    }

                }

            }
            "1" ->{

                when(bitter){

                    "0" -> {
                        topText.text = "Bir "+soup+" Çeeek,"+"Orta Tuzlu ve Acısız Olsun"
                    }
                    "1" -> {
                        topText.text = "Bir "+soup+" Çeeek,"+"Orta Tuzlu ve Orta Acılı Olsun"
                    }
                    "2" -> {
                        topText.text = "Bir "+soup+" Çeeek,"+"Orta Tuzlu ve Bol Acılı Olsun"
                    }

                }

            }
            "2" ->{

                when(bitter){

                    "0" -> {
                        topText.text =  "Bir "+soup+" Çeeek,"+"Bol Tuzlu ve Acısız Olsun"
                    }
                    "1" -> {
                        topText.text = "Bir "+soup+" Çeeek,"+"Bol Tuzlu ve Orta Acılı Olsun"
                    }
                    "2" -> {
                        topText.text =  "Bir "+soup+" Çeeek,"+"Bol Tuzlu ve Bol Acılı Olsun"
                    }

                }

            }


        }

        var ingr = ""

        val text = findViewById<TextView>(R.id.text)
        val text2 = findViewById<TextView>(R.id.text2)


        if (istherebeyin || istherekasar || istheredil || istherekrema || istherekitir || istherelimon || istheresarimsak || isthereterbiye || istherenane || isthereyag || istheresirke || istheretozbiber) {
            text.visibility = View.VISIBLE
            text2.visibility = View.VISIBLE
        }
        if(istherebeyin) {
            ingr += "beyin,"
            middleText.text = ingr
        }
        if(istherekasar){
            ingr += "kaşar,"
            middleText.text = ingr
        }
        if(istheredil){
            ingr += "dil,"
            middleText.text = ingr
        }
        if(istherekrema){
            ingr += "krema,"
            middleText.text = ingr
        }
        if(istherekitir){
            ingr += "kıtır,"
            middleText.text = ingr
        }
        if(istherelimon){
            ingr += "limon,"
            middleText.text = ingr
        }
        if(istheresarimsak){
            ingr += "sarımsak,"
            middleText.text = ingr
        }
        if(isthereterbiye){
            ingr += "terbiye,"
            middleText.text = ingr
        }
        if(istherenane){
            ingr += "nane,"
            middleText.text = ingr
        }
        if(isthereyag){
            ingr += "yağ,"
            middleText.text = ingr
        }
        if(istheresirke){
            ingr += "sirke,"
            middleText.text = ingr
        }
        if(istheretozbiber){
            ingr += "toz biber,"
            middleText.text = ingr
        }

    }
}