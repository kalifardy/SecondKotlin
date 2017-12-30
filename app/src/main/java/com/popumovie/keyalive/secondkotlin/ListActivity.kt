package com.popumovie.keyalive.secondkotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.activity_list.*

class ListActivity : AppCompatActivity() {

    //versi java String[] data {}
    //variabel array

    var data = arrayOf("Alpukat","Apel","Ceri","Duku")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list)
//        include array ke adapter
    var adapter = ArrayAdapter(this,android.R.layout.simple_list_item_1,data)

//        adapter include to list view
        listview.adapter=adapter

//        event klik listview
        listview.setOnItemClickListener { parent, view, position, id ->
            Log.d("klik user",data.get(position))
        }

//        versi java
//        listview.setAdapter(adapter);
    }
}
