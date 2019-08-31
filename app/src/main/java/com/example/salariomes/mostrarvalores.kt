package com.example.salariomes

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_calcularvalor.*
import kotlinx.android.synthetic.main.activity_mostrarvalores.*
import java.text.DecimalFormat

class mostrarvalores : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mostrarvalores)

        val intent = intent
       val valordia = intent.getFloatExtra("valordodia",0.00f)
       val valorhora = intent.getFloatExtra("valordahora",0.00f)
       val valorbruto = intent.getFloatExtra("valorbruto",0.00f)


            var inss = 0.00

            if (valorbruto < 1693.72) {
                inss = valorbruto * 0.08
            } else if ((valorbruto > 1693.72) && (valorbruto < 2822.91)) {
                inss = valorbruto * 0.09
            } else if ((valorbruto > 2822.91) && (valorbruto < 5645.80)) {
                inss = valorbruto * 0.11
            } else {
                inss = 513.01
            }

        var salarioli = valorbruto - inss


        val valorliqui = findViewById<TextView>(R.id.valorliqui)
        val valordodia = findViewById<TextView>(R.id.valordodia2)
        val valordahora = findViewById<TextView>(R.id.valordahora)
        val valorsabruto = findViewById<TextView>(R.id.valorbruto)
        val valorinss = findViewById<TextView>(R.id.valorinss2)


        valorliqui.text = "Valor Salário Liquido: $salarioli"
        valordodia.text = "Valor do dia: $valordia"
        valordahora.text = "Valor da Hora: $valorhora"
        valorsabruto.text = "Valor Salário Bruto:$valorbruto"
        valorinss.text = " Valor Inss: $inss"


    }
}
