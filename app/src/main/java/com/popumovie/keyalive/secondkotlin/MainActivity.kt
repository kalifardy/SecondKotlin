package com.popumovie.keyalive.secondkotlin

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), View.OnClickListener {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnListView.setOnClickListener(this)
        btnRecyclerView.setOnClickListener(this)
    }
    override fun onClick(v: View?) {
//        if (v ==btnListView){

//        }else{

//        }
        when (v){
            btnListView -> { startActivity(Intent(this,ListActivity::class.java))
//            atau
//                intent membawa object harus menggunakan var

//                var intent = Intent(this,ListActivity::class.java)
//                startActivity(intent)
            }
            btnRecyclerView ->{ startActivity(Intent(this,RecyclerActivity::class.java))}
        }

//        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}
