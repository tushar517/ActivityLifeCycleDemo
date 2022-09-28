package com.example.activitylifecycle

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.widget.AppCompatButton
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentTransaction
import com.example.activitylifecycle.Fragmet.HomeFragment
import com.example.activitylifecycle.Fragmet.ProfileFragment
import com.example.activitylifecycle.Fragmet.SettingsFragment
import com.google.android.material.bottomnavigation.BottomNavigationItemView

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.i("MyTag","Second Activity onCreate")
        setContentView(R.layout.activity_second)
        val nextBtn:AppCompatButton=findViewById(R.id.btnNext)
        nextBtn.setOnClickListener{
            startActivity(Intent(this,ThirdActivity::class.java))
        }

        val homeFragment = HomeFragment()
        val profileFragment = ProfileFragment()
        val settingFragment = SettingsFragment()

        val bottomNavigationItemView:com.google.android.material.bottomnavigation.BottomNavigationView = findViewById(R.id.bottomNav)
        changeFragment(homeFragment)
        bottomNavigationItemView.setOnItemSelectedListener{
            when(it.itemId){
                R.id.Home->changeFragment(homeFragment)
                R.id.Profile->changeFragment(profileFragment)
                R.id.Settings->changeFragment(settingFragment)
            }
            true
        }
    }

    private fun changeFragment(fragment:Fragment)= supportFragmentManager.beginTransaction().apply {
            replace(R.id.framelayout,fragment)
            commit()

    }
    override fun onStart() {
        Log.i("MyTag","Second Activity onStart")
        super.onStart()
    }

    override fun onResume() {
        Log.i("MyTag","Second Activity onResume")
        super.onResume()
    }

    override fun onPause() {
        Log.i("MyTag","Second Activity onPause")
        super.onPause()
    }

    override fun onStop() {
        Log.i("MyTag","Second Activity onStop")
        super.onStop()
    }

    override fun onRestart() {
        Log.i("MyTag","Second Activity onRestart")
        super.onRestart()
    }

    override fun onDestroy() {
        Log.i("MyTag","Second Activity onDestroy")
        super.onDestroy()
    }

}