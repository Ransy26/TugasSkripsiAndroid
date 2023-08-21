package com.example.tugasskripsi.data

sealed class Category(val category: String) {

    object Magazine: Category("Magazine")
    object Album: Category("Album")
    object Collectables: Category("Collectables")
    object Lightstick: Category("Lightstick")
    object Photobook: Category("Photobook")
}