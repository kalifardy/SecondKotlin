package com.popumovie.keyalive.secondkotlin

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.recycler_item.view.*

/**
 * Created by keyalive on 30/12/2017.
 */
class CustomAdapter(gambar: Array<Int>, nama: Array<String>, rating: Array<Any>) : RecyclerView.Adapter<CustomAdapter.MyHolder>() {

    lateinit var gambar: Array<Int>
    lateinit var nama : Array<String>
    lateinit var rating :Array<Any>
    init {
        this.gambar=gambar
        this.nama=nama
        this.rating=rating
    }
    override fun getItemCount(): Int {
        return nama.size
       TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onBindViewHolder(holder: MyHolder?, position: Int) {

        holder?.bind(position,gambar,nama,rating)
//        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): MyHolder {
    var view =LayoutInflater.from(parent?.context).inflate(R.layout.recycler_item,parent,false)
        return MyHolder(view)
//        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    class MyHolder(itemView: View?) : RecyclerView.ViewHolder(itemView) {
        fun bind(position: Int, gambar: Array<Int>, nama: Array<String>, rating: Array<Any>) {
//            pindah value array ke view
            itemView.imgbuah.setImageResource(gambar.get(position))
            itemView.textbuah.text= nama.get(position)
//            itemView.textbuah.setText(nama.get(position))

            itemView.rattingbuah.rating = rating.get(position).toString().toFloat()
//            TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        }

    }
}