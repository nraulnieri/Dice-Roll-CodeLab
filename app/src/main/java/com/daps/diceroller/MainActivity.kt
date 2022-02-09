package com.daps.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton:Button = findViewById(R.id.roll_button)
        //val bt_contar:Button = findViewById(R.id.bt_contar)

        rollButton.setOnClickListener { rollDice() }
        //bt_contar.setOnClickListener { sumarUno() }
    }

    //Sumar Uno incrementa el numero en 1, si es texto es igual 1, si es 6 se mantiene igual.
    /*private fun sumarUno() {
        val resultText: TextView = findViewById(R.id.result_text)
        var resultTextValue = resultText.text.toString()

        resultTextValue = when(resultTextValue){
            "Hello World!"-> "1"
            "6" -> resultTextValue
            else -> {
                (resultText.text.toString().toInt() + 1).toString()
            }
        }
        resultText.text = resultTextValue
    }*/

    //Rodar un dado, genera valores aleatorios entre 1 y 6
    private fun rollDice(){
        val randomInt = (1..6).random()
        val diceImage:ImageView = findViewById(R.id.dice_image)

        val drawableResource = when (randomInt) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
        diceImage.setImageResource(drawableResource)

        /*val resultText: TextView = findViewById(R.id.result_text)
        resultText.text = randomInt.toString()*/
        /*Toast.makeText(this, "button clicked",
            Toast.LENGTH_SHORT).show()*/
    }
}