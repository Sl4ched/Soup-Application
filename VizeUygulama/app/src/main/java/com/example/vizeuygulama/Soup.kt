package com.example.vizeuygulama

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.Gravity
import android.view.View
import android.widget.*
import androidx.appcompat.app.AlertDialog

class Soup : AppCompatActivity() {

    var didYouClickToRadio = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_soup)

        val rg = findViewById<RadioGroup>(R.id.radioGroup)
        val button = findViewById<Button>(R.id.button)
        val check = findViewById<CheckBox>(R.id.checkBox)
        val warning = AlertDialog.Builder(this@Soup)


        check.setOnClickListener {

            if (check.isChecked) { //bu aşamada checkbox'a tıklanıldığında button ve rg aktif oluyor
                rg.visibility = View.VISIBLE
                button.visibility = View.VISIBLE

            } else {//bu aşamada checkbox kapalı ise button ve rg disable oluyor
                rg.visibility = View.INVISIBLE
                button.visibility = View.INVISIBLE
                button.isClickable = false
                rg.isClickable = false

            }

        }

button.setOnClickListener {
    if(!didYouClickToRadio){

        warning.setTitle("Uyarı!")
        warning.setIcon(R.drawable.logo2)
        warning.setMessage("Lütfen Seçiminizi Yapınız")
        warning.setCancelable(false)
        warning.setNeutralButton("Tekrar Dene"){DialogInterface, i->}
        warning.create().show()
    }

}

    }fun onClick(view: View){

        didYouClickToRadio = true

        val desing = layoutInflater.inflate(R.layout.mytoast, null)
        val specialToast = Toast(applicationContext)
        val soupName = desing.findViewById<TextView>(R.id.soupName) // mytoast taki çorba isminin giriliceği alan

        val button = findViewById<Button>(R.id.button)
        val intent = Intent(applicationContext,SoupSelections::class.java)

        when(view.id){

            R.id.radioButtonEzo ->{

                button.setOnClickListener {

                    button.isClickable = false
                    soupName.text = "Ezogelin Çorbası"
                    specialToast.view = desing
                    specialToast.setGravity(Gravity.BOTTOM,0,0)
                    specialToast.duration = Toast.LENGTH_LONG
                    specialToast.show()

                    Handler().postDelayed({
                        intent.putExtra("soupName","Ezogelin Çorbası")
                        button.isClickable = true
                        startActivity(intent)
                        finish()
                    },3000)
                }
            }
            R.id.radioButtonDugun -> {

                button.setOnClickListener {

                    button.isClickable = false
                    soupName.text = "Düğün Çorbası"
                    specialToast.view = desing
                    specialToast.setGravity(Gravity.BOTTOM,0,0)
                    specialToast.duration = Toast.LENGTH_LONG
                    specialToast.show()

                    Handler().postDelayed({
                        intent.putExtra("soupName","Düğün Çorbası")
                        button.isClickable = true
                        startActivity(intent)
                        finish()
                    },3000)
                }
            }
            R.id.radioButtonMercimek ->{

                button.setOnClickListener {
                    button.isClickable = false
                    soupName.text = "Mercimek Çorbası"
                    specialToast.view = desing
                    specialToast.setGravity(Gravity.BOTTOM,0,0)
                    specialToast.duration = Toast.LENGTH_LONG
                    specialToast.show()

                    Handler().postDelayed({
                        intent.putExtra("soupName","Mercimek Çorbası")
                        button.isClickable = true
                        startActivity(intent)
                        finish()
                    },3000)
                }
            }
            R.id.radioButtonBrokoli -> {

                button.setOnClickListener {
                    button.isClickable = false
                    soupName.text = "Brokoli Çorbası"
                    specialToast.view = desing
                    specialToast.setGravity(Gravity.BOTTOM,0,0)
                    specialToast.duration = Toast.LENGTH_LONG
                    specialToast.show()

                    Handler().postDelayed({
                        intent.putExtra("soupName","Brokoli Çorbası")
                        button.isClickable = true
                        startActivity(intent)
                        finish()
                    },3000)
                }
            }
            R.id.radioButtonKellePaca -> {

                button.setOnClickListener {
                    button.isClickable = false
                    soupName.text = "Kelle-Paça Çorbası"
                    specialToast.view = desing
                    specialToast.setGravity(Gravity.BOTTOM,0,0)
                    specialToast.duration = Toast.LENGTH_LONG
                    specialToast.show()

                    Handler().postDelayed({
                        intent.putExtra("soupName","Kelle-Paça Çorbası")
                        button.isClickable = true
                        startActivity(intent)
                        finish()
                    },3000)
                }
            }
            R.id.radioButtonYayla -> {

                button.setOnClickListener {
                    button.isClickable = false
                    soupName.text = "Yayla Çorbası"
                    specialToast.view = desing
                    specialToast.setGravity(Gravity.BOTTOM,0,0)
                    specialToast.duration = Toast.LENGTH_LONG
                    specialToast.show()

                    Handler().postDelayed({
                        intent.putExtra("soupName","Yayla Çorbası")
                        button.isClickable = true
                        startActivity(intent)
                        finish()
                    },3000)
                }
            }
            R.id.radioButtonSehriye -> {

                button.setOnClickListener {
                    button.isClickable = false
                    soupName.text = "Şehriye Çorbası"
                    specialToast.view = desing
                    specialToast.setGravity(Gravity.BOTTOM,0,0)
                    specialToast.duration = Toast.LENGTH_LONG
                    specialToast.show()

                    Handler().postDelayed({
                        intent.putExtra("soupName","Şehriye Çorbası")
                        button.isClickable = true
                        startActivity(intent)
                        finish()
                    },3000)
                }
            }
            R.id.radioButtonDomates -> {

                button.setOnClickListener {
                    button.isClickable = false
                    soupName.text = "Domates Çorbası"
                    specialToast.view = desing
                    specialToast.setGravity(Gravity.BOTTOM,0,0)
                    specialToast.duration = Toast.LENGTH_LONG
                    specialToast.show()

                    Handler().postDelayed({
                        intent.putExtra("soupName","Domates Çorbası")
                        button.isClickable = true
                        startActivity(intent)
                        finish()
                    },3000)
                }
            }
            R.id.radioButtonTarhana -> {

                button.setOnClickListener {
                    button.isClickable = false
                    soupName.text = "Tarhana Çorbası"
                    specialToast.view = desing
                    specialToast.setGravity(Gravity.BOTTOM,0,0)
                    specialToast.duration = Toast.LENGTH_LONG
                    specialToast.show()

                    Handler().postDelayed({
                        intent.putExtra("soupName","Tarhana Çorbası")
                        button.isClickable = true
                        startActivity(intent)
                        finish()
                    },3000)
                }
            }
            R.id.radioButtonMantar -> {

                button.setOnClickListener {
                    button.isClickable = false
                    soupName.text = "Mantar Çorbası"
                    specialToast.view = desing
                    specialToast.setGravity(Gravity.BOTTOM,0,0)
                    specialToast.duration = Toast.LENGTH_LONG
                    specialToast.show()

                    Handler().postDelayed({
                        intent.putExtra("soupName","Mantar Çorbası")
                        button.isClickable = true
                        startActivity(intent)
                        finish()
                    },3000)

                }
            }
            R.id.radioButtonIskembe -> {

                button.setOnClickListener {
                    button.isClickable = false
                    soupName.text = "İşkembe Çorbası"
                    specialToast.view = desing
                    specialToast.setGravity(Gravity.BOTTOM,0,0)
                    specialToast.duration = Toast.LENGTH_LONG
                    specialToast.show()

                    Handler().postDelayed({
                        intent.putExtra("soupName","İşkembe Çorbası")
                        button.isClickable = true
                        startActivity(intent)
                        finish()
                    },3000)
                }
            }
            R.id.radioButtonTavuk -> {

                button.setOnClickListener {
                    button.isClickable = false
                    soupName.text = "Tavuk Çorbası"
                    specialToast.view = desing
                    specialToast.setGravity(Gravity.BOTTOM,0,0)
                    specialToast.duration = Toast.LENGTH_LONG
                    specialToast.show()

                    Handler().postDelayed({
                        intent.putExtra("soupName","Tavuk Çorbası")
                        button.isClickable = true
                        startActivity(intent)
                        finish()
                    },3000)
                }
            }
        }
    }
}