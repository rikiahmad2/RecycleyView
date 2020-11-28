package com.bellodev.recyclerviewapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    lateinit var recyclerView: RecyclerView
    lateinit var adapter: MyAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        init()

        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = adapter
    }

    private fun init() {
        recyclerView = findViewById(R.id.recycler_view)

        var data = ArrayList<SocialMedia>()
        data.add(SocialMedia(R.drawable.ayam, "1 Ekor Ayam", "berat 1 kg, potong 8"))
        data.add(SocialMedia(R.drawable.bawang, "3 siung bawang putih", " "))
        data.add(SocialMedia(R.drawable.ketumbar, "1 sdm biji ketumbar", "Sangrai"))
        data.add(SocialMedia(R.drawable.kunyit, "2 cm kunyit", "kupas dan bakar hingga berubah warna"))
        data.add(SocialMedia(R.drawable.salam, "4 lbr daun salam", " "))
        data.add(SocialMedia(R.drawable.serai, "2 btg serai", "memarkan"))
        data.add(SocialMedia(R.drawable.lengkuas, "100 gr Lengkuas", " cuci bersih, parut kasar berikut kulitnya"))
        data.add(SocialMedia(R.drawable.sajiku, "1 bks Sajiku® Bumbu Ayam Goreng", " "))
        data.add(SocialMedia(R.drawable.air, "200 ml of air", " "))
        data.add(SocialMedia(R.drawable.merica, "1/4 sdt merica bubuk", " "))
        data.add(SocialMedia(R.drawable.minyak, "Minyak secukupnya", " "))

        adapter = MyAdapter(data)
    }
}