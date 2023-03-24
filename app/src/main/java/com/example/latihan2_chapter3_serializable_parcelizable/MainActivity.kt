package com.example.latihan2_chapter3_serializable_parcelizable

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.latihan2_chapter3_serializable_parcelizable.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //btn1 menggunakan Serializable
        binding.btn1.setOnClickListener {
            val name = binding.inputName.text.toString()
            val email = binding.inputEmail.text.toString()
            val phone = binding.inputPhone.text.toString()
            val address = binding.inputAddress.text.toString()
            val age = binding.inputAge.text.toString()
            val user = User(name,email,phone,address, age)
            val secondActivity = Intent(this, ThirdActivity::class.java)
            secondActivity.putExtra("User",user)
            startActivity(secondActivity)
        }

        //btn2 menggunakan Parcelizable
        binding.btn2.setOnClickListener {
            val name = binding.inputName.text.toString()
            val email = binding.inputEmail.text.toString()
            val phone = binding.inputPhone.text.toString()
            val address = binding.inputAddress.text.toString()
            val age = binding.inputAge.text.toString()
            val User2 = User2(name, email, phone, address, age)
            val secondActivity2 = Intent(this,SecondActivity::class.java)
            secondActivity2.putExtra("User2",User2)
            startActivity(secondActivity2)
        }

    }
}