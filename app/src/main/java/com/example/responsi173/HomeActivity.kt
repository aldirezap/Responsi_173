package com.example.responsi173

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.responsi_173.Adapter
import kotlinx.android.synthetic.main.activity_home.*

class HomeActivity : AppCompatActivity() {
    var listFood = java.util.ArrayList<Food>()
    var adapter: Adapter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        listFood.add(
            Food("Bakso",
                "Bakso adalah makanan yang bulat, paling enak sambel sing loba jeng make cuka",
                R.drawable.baso)
        )
        listFood.add(
            Food("Kepiting",
                "Kepiting Seafood makanan yang mahal moal kabeuli",
                R.drawable.kepiting)
        )
        listFood.add(
            Food("Lauk Jaer",
                "Lauk Jaer pake bumbu cobek, pokonamah ngeunah kacida",
                R.drawable.laukjaer)
        )
        listFood.add(
            Food("Mie Dok Dok",
                "Mie dok dok makanan yang ada di burjo harganya murah beut ",
                R.drawable.mie)
        )
        listFood.add(
            Food("Nasi Goreng",
                "Nasi Goreng makanan merakyat selalu ada di pinggir jalan biasanya malam harir",
                R.drawable.nasgor)
        )
        listFood.add(
            Food("Nasi Rendang",
                "Rendang adalah makanan khas padang, hargana mahal ",
                R.drawable.rendang)
        )
        listFood.add(
            Food("Sate",
                "Sate adalah makanan yang ditusuk ",
                R.drawable.sate)
        )
        listFood.add(
            Food("Sosis",
                "Sosis adalah makanan yang bentukna paranjang jiga eta ",
                R.drawable.sosis)
        )
        listFood.add(
            Food("Soto",
                "Soto adalah makanan yang berkuah, di mba darti 7K ",
                R.drawable.soto)
        )
        listFood.add(
            Food("Tumpeng",
                "Tumpeng adalah makanan yang selalu di acara sunatan atau lomba 17an ",
                R.drawable.tumpeng)
        )

        adapter = Adapter(listFood, this)
        lv_food.adapter = adapter
    }
}