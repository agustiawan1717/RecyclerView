package com.agustiawan.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //RecyclerView menggunakan kembali tampilan tersebut untuk item daftar berikutnya yang akan ditampilkan. Itu artinya, item diisi dengan konten baru yang di-scroll ke layar. Perilaku RecyclerView ini menghemat waktu pemrosesan dan membantu daftar ter-scroll dengan lebih lancar.
    }
}