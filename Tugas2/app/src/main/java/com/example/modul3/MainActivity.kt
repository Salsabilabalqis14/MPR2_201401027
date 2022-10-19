package com.example.modul3

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText

class MainActivity : AppCompatActivity() {

    private lateinit var teks: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        teks = findViewById(R.id.editTextTextPersonName)
    }

    fun onClick(view: View){
        when (view.id){
            R.id.button -> {
                val intent = Intent(this@MainActivity, MainActivity2::class.java)
                startActivity(intent)
            }

            R.id.button2 -> {
                val text = teks.text.toString()
                val intent = Intent(this@MainActivity, MainActivity2::class.java)
                intent.putExtra(MainActivity2.EXTRA_TEXT, text)
                startActivity(intent)
            }

            R.id.button3 -> {
                val carSpek = Car(
                    "Civic",
                    "Honda",
                    "Sedan",
                    1997,
                    57000000.00
                )

                val intent = Intent(this@MainActivity, MainActivity2::class.java)
                intent.putExtra(MainActivity2.EXTRA_CAR, carSpek)
                intent.putExtra(MainActivity2.EXTRA_BOOL, true)
                startActivity(intent)
            }

            R.id.button4 -> {
                val phoneNumber = "081234567890"
                val dialPhoneIntent = Intent(Intent.ACTION_DIAL, Uri.parse("tel:$phoneNumber"))
                startActivity(dialPhoneIntent)
            }
        }
    }
}