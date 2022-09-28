package com.example.activitylifecycle

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.appcompat.widget.AppCompatButton

class ThirdActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_third)
        val btn: AppCompatButton = findViewById(R.id.btnNext)
        Log.i("MyTag","Third Activity onCreate")
        btn.setOnClickListener{
            startActivity(Intent(this,FinalActivity::class.java))
        }
    }

    override fun onStart() {
        Log.i("MyTag","Third Activity onStart")
        super.onStart()
    }

    override fun onResume() {
        Log.i("MyTag","Third Activity onResume")
        super.onResume()
    }

    override fun onPause() {
        Log.i("MyTag","Third Activity onPause")
        super.onPause()
    }

    override fun onStop() {
        Log.i("MyTag","Third Activity onStop")
        super.onStop()
    }

    override fun onRestart() {
        Log.i("MyTag","Third Activity onRestart")
        super.onRestart()
    }

    override fun onDestroy() {
        Log.i("MyTag","Third Activity onDestroy")
        super.onDestroy()
    }
}