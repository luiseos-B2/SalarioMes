package com.example.salariomes

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_calcularsalario.*

class calcularsalario : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calcularsalario)

        btnvoltainicio.setOnClickListener {
            val intent:Intent = Intent(this,MainActivity::class.java)
            startActivity(intent)
            finish()
        }

        btncalcular2.setOnClickListener {
            //variaveis
            var qtddia = qtddias.text.toString().toInt()
            var qtdhoras = qtdhoras.text.toString().toInt()
            var valorhoras = valorhora.text.toString().toFloat()
            //somas
            var valorbruto = qtddia * qtdhoras * valorhoras
            var valordodia = qtdhoras * valorhoras


            val intent:Intent = Intent(this, mostrarvalor2::class.java)
            intent.putExtra("qtddias",qtddia)
            intent.putExtra("valorhora",valorhoras)
            intent.putExtra("valorbruto",valorbruto)
            intent.putExtra("valordodia",valordodia)
            startActivity(intent)



        }

    }
}
