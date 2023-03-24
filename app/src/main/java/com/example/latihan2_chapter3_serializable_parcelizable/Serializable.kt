package com.example.latihan2_chapter3_serializable_parcelizable

data class User(
    val name: String,
    val email: String,
    val phone: String,
    val address: String,
    val age: String
) : java.io.Serializable
