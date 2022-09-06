package com.example.diceroller

import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.diceroller.databinding.ActivityMainBinding
import java.util.*

class MainActivity : AppCompatActivity() {
  private lateinit var  diceImage: ImageView
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val rollButton: Button = findViewById(R.id.roll_dice_button)
        diceImage= findViewById(R.id.dice_image)
       rollButton.setOnClickListener{
            rollDice()
       }
    }
    private fun rollDice() {
        val theRandomDiceImage = when(Random().nextInt(6)+1){
            1-> R.drawable.dice_1
            2-> R.drawable.dice_2
            3-> R.drawable.dice_3
            4-> R.drawable.dice_4
            5-> R.drawable.dice_5
            6-> R.drawable.dice_6
            else -> R.drawable.dice_6
        }
        diceImage.setImageResource(theRandomDiceImage)
        Toast.makeText(
            this,
            "button Clicked",
            Toast.LENGTH_SHORT
        ).show()
    }


}