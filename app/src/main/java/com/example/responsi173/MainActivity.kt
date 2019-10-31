package com.example.responsi173

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_masuk.setOnClickListener {
            val username = txt_username.text.toString()
            val password = txt_pass.text.toString()

            if (username.isEmpty() || password.isEmpty()) {
                Toast.makeText(this, "Harap Masukan Username dan Password", Toast.LENGTH_SHORT)
                    .show()
                return@setOnClickListener
            }
            if (username == "aldireza" || password == "1234") {
                val intent = Intent(this, HomeActivity::class.java)
                startActivity(intent)
                finish()
            }
        }
        btn_daftar.setOnClickListener{
            val intent = Intent(applicationContext, RegisterActivity::class.java)
            startActivity(intent)
            finish()

        }
    }
}
