package com.example.vizeuygulama

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.SeekBar
import android.widget.Switch
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AlertDialog

class SoupSelections : AppCompatActivity() {
    @SuppressLint("UseSwitchCompatOrMaterialCode")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_soup_selections)

        val warning = AlertDialog.Builder(this@SoupSelections)
        val salt = findViewById<SeekBar>(R.id.seekbarOfSalt)
        val bitter = findViewById<SeekBar>(R.id.seekbarOfBitter)
        val soup = intent.getStringExtra("soupName") //name of soup
        val soupNameIndicator = findViewById<TextView>(R.id.soup_name)
        val orderFinish = findViewById<Button>(R.id.button2)
        val intent = Intent(applicationContext,OrderFinish::class.java)

        val switchTerbiye = findViewById<Switch>(R.id.switchTerbiye)
        val switchKitir = findViewById<Switch>(R.id.switchKitir)
        val switchNane = findViewById<Switch>(R.id.switchNane)
        val switchYag = findViewById<Switch>(R.id.switchYag)
        val switchLimon = findViewById<Switch>(R.id.switchLimon)
        val switchKasar = findViewById<Switch>(R.id.switchKasar)
        val switchTozBiber = findViewById<Switch>(R.id.switchTozBiber)
        val switchSarimsak = findViewById<Switch>(R.id.switchSarimsak)
        val switchKrema = findViewById<Switch>(R.id.switchKrema)
        val switchBeyin = findViewById<Switch>(R.id.switchBeyin)
        val switchDil = findViewById<Switch>(R.id.switchDil)
        val switchSirke = findViewById<Switch>(R.id.switchSirke)

        val extra = findViewById<EditText>(R.id.editTextTextPersonName)

        soupNameIndicator.text = soup
        intent.putExtra("soup",soup)

        when(soup){
            "Ezogelin ??orbas??" -> {
                switchNane.visibility = View.VISIBLE
                switchKitir.visibility = View.VISIBLE
                switchYag.visibility = View.VISIBLE
                switchLimon.visibility = View.VISIBLE
                switchTozBiber.visibility = View.VISIBLE
            }
            "D??????n ??orbas??" -> {
                switchNane.visibility = View.VISIBLE
                switchKitir.visibility = View.VISIBLE
                switchYag.visibility = View.VISIBLE
                switchLimon.visibility = View.VISIBLE
                switchTozBiber.visibility = View.VISIBLE
            }
            "Mercimek ??orbas??" -> {
                switchNane.visibility = View.VISIBLE
                switchKitir.visibility = View.VISIBLE
                switchYag.visibility = View.VISIBLE
                switchLimon.visibility = View.VISIBLE
                switchTozBiber.visibility = View.VISIBLE
            }
            "Brokoli ??orbas??" -> {
                switchKrema.visibility = View.VISIBLE
            }
            "Kelle-Pa??a ??orbas??" -> {
                switchDil.visibility = View.VISIBLE
                switchYag.visibility = View.VISIBLE
                switchLimon.visibility = View.VISIBLE
                switchSirke.visibility = View.VISIBLE
                switchSarimsak.visibility = View.VISIBLE
                switchBeyin.visibility = View.VISIBLE
            }
            "Yayla ??orbas??" -> {
                switchTozBiber.visibility = View.VISIBLE
                switchYag.visibility = View.VISIBLE
                switchNane.visibility = View.VISIBLE
                switchKitir.visibility = View.VISIBLE

            }
            "??ehriye ??orbas??" -> {
                switchTozBiber.visibility = View.VISIBLE
                switchYag.visibility = View.VISIBLE
                switchNane.visibility = View.VISIBLE
                switchLimon.visibility = View.VISIBLE
            }
            "Domates ??orbas??" -> {
                switchTerbiye.visibility = View.VISIBLE
                switchKitir.visibility = View.VISIBLE
                switchLimon.visibility = View.VISIBLE
                switchNane.visibility = View.VISIBLE
                switchYag.visibility = View.VISIBLE
                switchKasar.visibility = View.VISIBLE
                switchTozBiber.visibility = View.VISIBLE
            }
            "Tarhana ??orbas??" -> {
                switchYag.visibility = View.VISIBLE
                switchTozBiber.visibility = View.VISIBLE
            }
            "Mantar ??orbas??" -> {
                switchKrema.visibility = View.VISIBLE
            }
            "????kembe ??orbas??" -> {
                switchSarimsak.visibility = View.VISIBLE
                switchSirke.visibility = View.VISIBLE
                switchLimon.visibility = View.VISIBLE
                switchYag.visibility = View.VISIBLE
                switchTozBiber.visibility = View.VISIBLE
            }
            "Tavuk ??orbas??" -> {
                switchLimon.visibility = View.VISIBLE
                switchKrema.visibility = View.VISIBLE
                switchYag.visibility = View.VISIBLE
            }
        }

        salt?.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener {

            override fun onProgressChanged(seek: SeekBar,progress: Int, fromUser: Boolean) {

                intent.putExtra("salt",progress.toString())

               if (progress == 2) { //warning

                   warning.setTitle("Uyar??!")
                   warning.setMessage("Bu kadar tuz istedi??inize emin misiniz?")
                   warning.setIcon(R.drawable.salt)
                   warning.setCancelable(false)
                   warning.setPositiveButton("Evet"){DialogInterface, i -> Toast.makeText(applicationContext,"Bol Tuzlu ??orba",Toast.LENGTH_SHORT).show()}
                   warning.setNegativeButton("Hay??r"){DialogInterface, i ->  seek.progress = 1}
                   warning.create().show()

               }
            }
            override fun onStartTrackingTouch(seek: SeekBar) {}
            override fun onStopTrackingTouch(seek: SeekBar) {}
        })

        bitter?.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener {

            override fun onProgressChanged(seek: SeekBar,progress: Int, fromUser: Boolean) {

                intent.putExtra("bitter",progress.toString())

                if (progress == 2) { //warning

                    warning.setTitle("Uyar??!")
                    warning.setMessage("Bu kadar ac?? istedi??inize emin misiniz?")
                    warning.setIcon(R.drawable.bitter)
                    warning.setCancelable(false)
                    warning.setPositiveButton("Evet"){DialogInterface, i ->  Toast.makeText(applicationContext,"Bol Ac??l?? ??orba",Toast.LENGTH_SHORT).show()}
                    warning.setNegativeButton("Hay??r"){DialogInterface, i ->  seek.progress = 1}
                    warning.create().show()

                }

            }
            override fun onStartTrackingTouch(seek: SeekBar) {}
            override fun onStopTrackingTouch(seek: SeekBar) {}
        })

        orderFinish.setOnClickListener {

            intent.putExtra("isthereterbiye",switchTerbiye.isChecked)
            intent.putExtra("istherekitir",switchKitir.isChecked)
            intent.putExtra("istherenane",switchNane.isChecked)
            intent.putExtra("isthereyag",switchYag.isChecked)
            intent.putExtra("istherelimon",switchLimon.isChecked)
            intent.putExtra("istherekasar",switchKasar.isChecked)
            intent.putExtra("istheretozbiber",switchTozBiber.isChecked)
            intent.putExtra("istheresarimsak",switchSarimsak.isChecked)
            intent.putExtra("istherekrema",switchKrema.isChecked)
            intent.putExtra("istherebeyin",switchBeyin.isChecked)
            intent.putExtra("istheredil",switchDil.isChecked)
            intent.putExtra("istheresirke",switchSirke.isChecked)

            intent.putExtra("exstra",extra.text.toString())

            warning.setTitle("Sipari??inizin durumu")
            warning.setMessage("Sipari??iniz Haz??rlanacak.Devam Etmek ??stiyor musunuz?")
            warning.setIcon(R.drawable.logo2)

            warning.setCancelable(false)
            warning.setPositiveButton("Evet"){DialogInterface, i ->

                intent.putExtra("soupname",soup)

                startActivity(intent)
                finish()
            }
            warning.setNegativeButton("Tekrar Kontrol Etmek ??stiyorum"){DialogInterface, i ->  }
            warning.create().show()

        }











    }

}