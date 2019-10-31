package com.example.responsi173


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_account.*
import kotlinx.android.synthetic.main.activity_main.*


class AccountActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_account)

        val nama = intent.getStringExtra("name")
        val username = intent.getStringExtra("user")
        val password = intent.getStringExtra("password")
        val alamat = intent.getStringExtra("alamat")
        val perguruan_tinggi = intent.getStringExtra("pt")
        val fakultas = intent.getStringExtra("fakultas")

        val hasil = findViewById<TextView>(R.id.txt_data)
        hasil.text =
            "Nama : " + nama + "" +
                    "\nUsername : " + username + "" +
                    "\nPassword : " + password + "" +
                    "\nAlamat : " + alamat + "" +
                    "\nPerguran Tinggi : " + perguruan_tinggi + "" +
                    "\nFakultas : " + fakultas

        btn_backakun.setOnClickListener {
            val intent = Intent(applicationContext, RegisterActivity::class.java)
            startActivity(intent)
            finish()
        }

    }
}