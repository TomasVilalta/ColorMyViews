package com.example.colormyview

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.databinding.DataBindingUtil
import com.example.colormyview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        setListeners()
    }

    private fun setListeners() {
        val clickableViews: List<View> =
            listOf(
                binding.boxOneText,
                binding.boxTwoText,
                binding.boxThreeText,
                binding.boxFourText,
                binding.boxFiveText,
                binding.button1,
                binding.button2,
                binding.button3
            )
        for (item in clickableViews) {
            item.setOnClickListener { changeColor(it) }
        }
    }


    private fun changeColor(view: View) {
        when (view.id) {
            R.id.box_three_text -> view.setBackgroundResource(android.R.color.white)
            R.id.box_four_text -> view.setBackgroundResource(android.R.color.white)
            R.id.box_five_text -> view.setBackgroundResource(android.R.color.white)
            R.id.button_1 -> binding.boxThreeText.setBackgroundResource(R.color.red)
            R.id.button_2 -> binding.boxFourText.setBackgroundResource(R.color.yellow)
            R.id.button_3 -> binding.boxFiveText.setBackgroundResource(R.color.green)

            else -> view.setBackgroundColor(Color.LTGRAY)
        }
    }


}




