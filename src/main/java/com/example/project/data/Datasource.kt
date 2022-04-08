package com.example.project.data

import com.example.project.R
import com.example.project.adapter.Pekerjaan

class Datasource {
   fun loadPekerjaan(): List<Pekerjaan>{
        return listOf<Pekerjaan>(
            Pekerjaan(R.string.gambar1),
            Pekerjaan(R.string.gambar2),
            Pekerjaan(R.string.gambar3),
            Pekerjaan(R.string.gambar4),
            Pekerjaan(R.string.gambar4),
            Pekerjaan(R.string.gambar5),
            Pekerjaan(R.string.gambar6),
            Pekerjaan(R.string.gambar7),
            Pekerjaan(R.string.gambar8),
            Pekerjaan(R.string.gambar9),
            Pekerjaan(R.string.gambar10),
        )
    }
}