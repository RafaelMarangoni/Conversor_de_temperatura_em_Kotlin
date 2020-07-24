package com.udemy.conversordetemperatura

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.RadioButton

class MainActivity : AppCompatActivity() {

    lateinit var editText: EditText
    lateinit var celciusRadio: RadioButton
    lateinit var fahrenheitRadio: RadioButton
    lateinit var buttonConverter: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        editText        = findViewById(R.id.textTemperatura)
        celciusRadio    = findViewById(R.id.celsiusRadio)
        fahrenheitRadio = findViewById(R.id.fahreinheitRadio)
        buttonConverter = findViewById(R.id.buttonConverter)

        buttonConverter.setOnClickListener{ converter(it) }

    }

    fun converter(view: View){
        var temp: Double = editText.text.toString().toDouble()

        if (celciusRadio.isChecked){
            temp = (temp - 32) * 5/9
        }else if(fahrenheitRadio.isChecked){
            temp = temp * 9/5 + 32
        }

        editText.setText(temp.toString())
    }
}