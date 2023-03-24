package com.example.latihan2_chapter3_serializable_parcelizable

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.latihan2_chapter3_serializable_parcelizable.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {
    private lateinit var binding : ActivitySecondBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySecondBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //17-31 Serializable
//        val getData = intent.getSerializableExtra("User") as User
//        val name = getData.name
//        val email = getData.email
//        val phone = getData.phone
//        val address = getData.address
//        val age = getData.age
//
//        binding.tvName.text = getData.name
//        binding.tvEmail.text = getData.email
//        binding.tvPhone.text = getData.phone.toString()
//        binding.tvAddress.text = getData.address
//        binding.tvAge.text = getData.age.toString()
//
//        binding.btnBack.setOnClickListener {
//            startActivity(Intent(this, MainActivity::class.java))
//        }

        //35-49 parcelizable
        val getData2 = intent.getParcelableExtra<User2>("User2") as User2
        val name2 = getData2.name
        val email2 = getData2.email
        val phone2 = getData2.phone
        val address2 = getData2.address
        val age2 = getData2.age

        binding.tvName.text = getData2.name
        binding.tvEmail.text = getData2.email
        binding.tvPhone.text = getData2.phone.toString()
        binding.tvAddress.text = getData2.address
        binding.tvAge.text = getData2.age.toString()

        binding.btnBack.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))

        }
    }
}