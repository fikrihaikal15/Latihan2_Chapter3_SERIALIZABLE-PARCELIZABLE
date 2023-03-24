package com.example.latihan2_chapter3_serializable_parcelizable

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.latihan2_chapter3_serializable_parcelizable.databinding.ActivityThirdBinding

class ThirdActivity : AppCompatActivity() {
    private lateinit var binding : ActivityThirdBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityThirdBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //17-31 Serializable
        val getData = intent.getSerializableExtra("User") as User
        val name = getData.name
        val email = getData.email
        val phone = getData.phone
        val address = getData.address
        val age = getData.age

        binding.tvName.text = getData.name
        binding.tvEmail.text = getData.email
        binding.tvPhone.text = getData.phone.toString()
        binding.tvAddress.text = getData.address
        binding.tvAge.text = getData.age.toString()

        binding.btnBack.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
        }
    }
}