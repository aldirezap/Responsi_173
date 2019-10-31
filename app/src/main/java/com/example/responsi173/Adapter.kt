package com.example.responsi_173

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import com.example.responsi173.Food
import com.example.responsi173.FoodDeskripsi
import com.example.responsi173.R
import kotlinx.android.synthetic.main.activity_preview.view.*
import java.util.ArrayList

class Adapter(val listFood: ArrayList<Food>, val context: Context?) : BaseAdapter() {

    override fun getView(p0: Int, p1: View?, p2: ViewGroup?): View {
        val food=listFood[p0]
        val inflator=context!!.getSystemService(Context.LAYOUT_INFLATER_SERVICE)as LayoutInflater
        val myView=inflator.inflate(R.layout.activity_preview,null)
        myView.imgFood.setImageResource(food.gambar!!)
        myView.txt_judul.text=food.nama!!
        myView.txtDeskripsi.text=food.deskripsi!!
        myView.setOnClickListener {
            val intent=Intent(context,FoodDeskripsi::class.java)
            intent.putExtra("imgFood",food.gambar!!)
            intent.putExtra("txt_judul",food.nama!!)
            intent.putExtra("txtDeskripsi",food.deskripsi!!)
            context.startActivity(intent)
        }
        return myView
    }

    override fun getItem(p0: Int): Any {
        return listFood[p0]
    }

    override fun getItemId(p0: Int): Long {
        return p0.toLong()
    }

    override fun getCount(): Int {
        return listFood.size
    }

}