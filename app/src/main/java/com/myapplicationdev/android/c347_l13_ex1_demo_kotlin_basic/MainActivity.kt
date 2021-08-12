package com.myapplicationdev.android.c347_l13_ex1_demo_kotlin_basic


import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*


class MainActivity : AppCompatActivity() {

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnGetAge.setOnClickListener {
            val userDOB  = etDOB.text.toString()
            if(userDOB.isNotEmpty()){
                val year = Calendar.getInstance().get(Calendar.YEAR)
                val age = year - userDOB.toInt();
                tvShowAge.text = "Your age is $age"

                var output = ""


                when (age){
                    in  0..17 -> output = "Underage"
                    in  18..65 -> output = "Young people"
                    in  66..79 -> output = "Middle-aged"
                    in  80..99 -> output = "Elderly"
                    else ->{
                        output = "Long-lived elderly"
                    }

                }//end of when


                tvAgeGroup.text = output


            }
            else{
                Toast.makeText(this, "Please enter your birth year", Toast.LENGTH_SHORT).show()
            }

        }







    }
}