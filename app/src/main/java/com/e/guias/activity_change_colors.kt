package com.e.guias

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import kotlinx.android.synthetic.main.activity_change_colors.*

class activity_change_colors : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_change_colors)

        val buttonNext = findViewById<Button>(R.id.buttonGoToGuia4)
        val buttonAfter = findViewById<Button>(R.id.buttonGoToGuia1)

        buttonNext.setOnClickListener{
            startActivity(Intent(this,activity_change_text::class.java))
        }
        buttonAfter.setOnClickListener{
            startActivity(Intent(this,MainActivity::class.java))
        }
        buttonRed.setOnClickListener(object : View.OnClickListener {
            override fun onClick (v: View?) {
                background.setBackgroundColor(Color.RED)
            }
        })
        buttonWhite.setOnClickListener(object : View.OnClickListener {
            override fun onClick (v: View?) {
                background.setBackgroundColor(Color.WHITE)
            }
        })

    }
}