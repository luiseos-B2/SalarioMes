package com.example.salariomes

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class mostrarvalor2 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mostrarvalor2)

        val intent = intent
        val valorbruto = intent.getFloatExtra("valorbruto",0.0f)
        val qtddias = intent.getIntExtra("qtddias",0)
        val valorhora = intent.getFloatExtra("valorhora",0.0f)
        val valordia = intent.getFloatExtra("valordodia",0.0f)

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



        val bruto = findViewById<TextView>(R.id.valorbruto)
        val qtdsdias = findViewById<TextView>(R.id.qtddia)
        val valorhoras = findViewById<TextView>(R.id.valordahora)
        val valodia = findViewById<TextView>(R.id.valordodia)
        val valorinss = findViewById<TextView>(R.id.valorinss)
        val salarioliq = findViewById<TextView>(R.id.valorliqui)


        bruto.text = "Valor Salário Bruto: $valorbruto"
        qtdsdias.text = "Qtd de Dias: $qtddias"
        valorhoras.text ="Valor da Hora: $valorhora"
        valodia.text = "Valor do dia: $valordia"
        valorinss.text = "Valor Inss: $inss"
        salarioliq.text ="Valor Salário Liquido: $salarioli"



    }
}
