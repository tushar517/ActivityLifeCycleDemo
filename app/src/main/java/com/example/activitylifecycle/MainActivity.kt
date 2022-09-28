package com.example.activitylifecycle

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.appcompat.widget.AppCompatButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.i("MyTag","First Activity onCreate")
        setContentView(R.layout.activity_main)
        val btn:AppCompatButton = findViewById(R.id.btnNext)
        btn.setOnClickListener{
            startActivity(Intent(this,SecondActivity::class.java))
        }
    }

    override fun onStart() {
        Log.i("MyTag","First Activity onStart")
        super.onStart()
    }

    override fun onResume() {
        Log.i("MyTag","First Activity onResume")
        onPause()
        super.onResume()
    }

    override fun onPause() {
        Log.i("MyTag","First Activity onPause")
        super.onPause()
    }

    override fun onStop() {
        Log.i("MyTag","First Activity onStop")
        super.onStop()
    }

    override fun onRestart() {
        Log.i("MyTag","First Activity onRestart")
        super.onRestart()
    }

    override fun onDestroy() {
        Log.i("MyTag","First Activity onDestroy")
        super.onDestroy()
    }


}