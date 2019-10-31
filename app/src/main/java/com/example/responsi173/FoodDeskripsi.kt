package com.example.responsi173

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_fooddeskripsi.*


class FoodDeskripsi : AppCompatActivity() {

        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_fooddeskripsi)

            val bundle: Bundle?=intent.extras
            val gambar = bundle!!.get("imgFood") as Int
            val nama=bundle.get("txt_judul") as String
            val deskripsi=bundle.get("txtDeskripsi") as String

            FoodImage.setImageResource(gambar)
            FoodName.text=nama
            detailFood.text=deskripsi


        }
    }
