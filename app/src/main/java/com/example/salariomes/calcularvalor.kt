package com.example.salariomes

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import kotlinx.android.synthetic.main.activity_calcularvalor.*
import kotlin.math.floor

class calcularvalor : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calcularvalor)

        val valorbruto = findViewById<EditText>(R.id.valorbruto)

        btninicio.setOnClickListener {

            val intent:Intent = Intent(this, MainActivity::class.java)
            startActivity(intent)

        }
        btncalcular.setOnClickListener {

            //variaveis
            var valorbruto = valorbruto.text.toString().toFloat()


            //calculos
            var valordia = valorbruto / 26
            var valorhora = valordia / 8


            val intent:Intent = Intent(this,mostrarvalores::class.java)
            intent.putExtra("valordodia", valordia)
            intent.putExtra("valordahora",valorhora)
            intent.putExtra("valorbruto",valorbruto)
            startActivity(intent)
        }


    }
}
