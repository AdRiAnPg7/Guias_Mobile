package com.e.guias

import android.content.Intent
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.annotation.RequiresApi
import kotlinx.android.synthetic.main.toolbar.*

class activity_action_bar : AppCompatActivity() {
    @RequiresApi(Build.VERSION_CODES.LOLLIPOP)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_action_bar)
        supportActionBar.let {
            setSupportActionBar(toolbar)
        }

        val buttonNext = findViewById<Button>(R.id.buttonGoToGuia4)

        buttonNext.setOnClickListener{
            startActivity(Intent(this,activity_card_view::class.java))
        }

    }

}