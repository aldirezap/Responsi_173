package com.example.responsi173

import android.content.Intent
import android.os.Bundle
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.btn_daftar
import kotlinx.android.synthetic.main.activity_register.*


class RegisterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        var nama: EditText = findViewById(R.id.txt_fullname)
        var user: EditText = findViewById(R.id.txt_usernamedaftar)
        var pass: EditText = findViewById(R.id.txt_passdaftar)
        var alamat: EditText = findViewById(R.id.txt_alamat)
        var pt: EditText = findViewById(R.id.txt_pt)
        var fakultas: EditText = findViewById(R.id.txt_fakutas)

        if (nama.getText().toString().length == 0) {
            nama.setError("Harap isi Nama Anda")
        }
        if (user.getText().toString().length == 0) {
            user.setError("Harap isi Username Anda")
        }
        if (pass.getText().toString().length == 0) {
            pass.setError("Harap isi Password Anda")
        }
        if (alamat.getText().toString().length == 0) {
            alamat.setError("Harap isi Alamat Anda")
        }
        if (pt.getText().toString().length == 0) {
            pt.setError("Harap isi Perguruan Tinggi Anda")
        }
        if (fakultas.getText().toString().length == 0) {
            fakultas.setError("Harap isi Fakultas Anda")
        }


        btn_daftar.setOnClickListener {
            val name = nama.text.toString()
            val username = user.text.toString()
            val password = pass.text.toString()
            val alamat = alamat.text.toString()
            val ptinggi = pt.text.toString()
            val faculty = fakultas.text.toString()

            val intent = Intent(this, AccountActivity::class.java)
            intent.putExtra("name", name)
            intent.putExtra("user", username)
            intent.putExtra("password", password)
            intent.putExtra("alamat", alamat)
            intent.putExtra("pt", ptinggi)
            intent.putExtra("fakultas", faculty)
            startActivity(intent)
        }
        btn_back.setOnClickListener {
            val intent = Intent(applicationContext, MainActivity::class.java)
            startActivity(intent)
            finish()

        }
    }
}
