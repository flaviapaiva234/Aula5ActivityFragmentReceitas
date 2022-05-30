package com.example.aula5

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class BoloActivity: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pudim)

        val button = findViewById<Button>(R.id.button)
        button.setOnClickListener {
            supportFragmentManager.apply {
                val fragment = BoloFragment()
                val transaction =beginTransaction()
                transaction.replace(android.R.id.content, fragment)
                transaction.commit()
            }
        }
    }

    override fun onStop() {
        super.onStop()
    }
}