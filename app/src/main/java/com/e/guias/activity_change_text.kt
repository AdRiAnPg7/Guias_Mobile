package com.e.guias

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_change_text.*

class activity_change_text : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_change_text)

        val text = findViewById<TextView>(R.id.textViewMessage)
        textViewButtonSelected.visibility = View.GONE
        text.visibility = View.GONE

       buttonServices.setOnClickListener{
           text.text = "SERVICIOS"
           textViewButtonSelected.visibility = View.VISIBLE
           text.visibility = View.VISIBLE
        }
        buttonAbout.setOnClickListener{
            text.text = "ACERCA DE"
            textViewButtonSelected.visibility = View.VISIBLE
            text.visibility = View.VISIBLE
        }
        buttonBriefcase.setOnClickListener{
            text.text = "PORTAFOLIO"
            textViewButtonSelected.visibility = View.VISIBLE
            text.visibility = View.VISIBLE
        }
        buttonContact.setOnClickListener{
            text.text = "CONTACTO"
            textViewButtonSelected.visibility = View.VISIBLE
            text.visibility = View.VISIBLE
        }
        buttonSocialNetworks.setOnClickListener{
            text.text = "REDES SOCIALES"
            textViewButtonSelected.visibility = View.VISIBLE
            text.visibility = View.VISIBLE
        }



        val buttonNext = findViewById<Button>(R.id.buttonGoToGuia6)
        val buttonBefore = findViewById<Button>(R.id.buttonGoToGuia3)

        buttonNext.setOnClickListener{
            startActivity(Intent(this,activity_action_bar::class.java))
        }
        buttonBefore.setOnClickListener{
            startActivity(Intent(this,activity_change_colors::class.java))
        }


    }
}