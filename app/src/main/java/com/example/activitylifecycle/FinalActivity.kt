package com.example.activitylifecycle

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.appcompat.widget.AppCompatButton

class FinalActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_final)
        val btnFinal: AppCompatButton = findViewById(R.id.btnFinal)
        Log.i("MyTag","Final Activity onCreate")
        btnFinal.setOnClickListener{
            val intent = Intent(this,MainActivity::class.java)
            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP)
            intent.addFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP)
            startActivity(intent)

        }
    }

    override fun onStart() {
        Log.i("MyTag","Final Activity onStart")
        super.onStart()
    }

    override fun onResume() {
        Log.i("MyTag","Final Activity onResume")
        super.onResume()
    }

    override fun onPause() {
        Log.i("MyTag","Final Activity onPause")
        super.onPause()
    }

    override fun onStop() {
        Log.i("MyTag","Final Activity onStop")
        super.onStop()
    }

    override fun onRestart() {
        Log.i("MyTag","Final Activity onRestart")
        super.onRestart()
    }

    override fun onDestroy() {
        Log.i("MyTag","Final Activity onDestroy")
        super.onDestroy()
    }
}