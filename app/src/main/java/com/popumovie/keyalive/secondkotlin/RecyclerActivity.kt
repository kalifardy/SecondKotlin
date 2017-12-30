package com.popumovie.keyalive.secondkotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_recycler.*

class RecyclerActivity : AppCompatActivity() {

//    deklarasi
    var gambar= arrayOf(R.drawable.alpukat,
        R.drawable.apel,
        R.drawable.ceri,
        R.drawable.durian,
        R.drawable.manggis,
        R.drawable.jambu_air,
        R.drawable.strawberry)

    var nama = arrayOf("alpukat","apel","ceri","durian","manggis","jambu_air","strawberry")
    var rating= arrayOf(2,2,3,4,5,4,1.5)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recycler)

//        get call adapter recycler
        var adapter = CustomAdapter(gambar,nama,rating)
        buahrecyclerview.adapter=adapter

        buahrecyclerview.layoutManager=LinearLayoutManager(this)

//        pindahin aray ke recyclerview di layout
//        tambahin layout manager linear/grid/etc

    }
}
