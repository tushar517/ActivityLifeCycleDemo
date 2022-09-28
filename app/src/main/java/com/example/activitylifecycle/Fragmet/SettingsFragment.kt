package com.example.activitylifecycle.Fragmet

import android.content.Context
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.activitylifecycle.R

class SettingsFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        Log.i("MyTag","Settings onCreateView")
        return inflater.inflate(R.layout.fragment_settings, container, false)
    }

    override fun onAttach(context: Context) {
        Log.i("MyTag","Settings onAttach")
        super.onAttach(context)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        Log.i("MyTag","Settings onCreate")
        super.onCreate(savedInstanceState)
    }

    override fun onResume() {
        Log.i("MyTag","Settings onResume")
        super.onResume()
    }

    override fun onStart() {
        Log.i("MyTag","Settings onStart")
        super.onStart()
    }

    override fun onPause() {
        Log.i("MyTag","Settings onPause")
        super.onPause()
    }

    override fun onStop() {
        Log.i("MyTag","Settings onStop")
        super.onStop()
    }

    override fun onDestroyView() {
        Log.i("MyTag","Settings onDestroyView")
        super.onDestroyView()
    }

    override fun onDestroy() {
        Log.i("MyTag","Settings ondestroy")
        super.onDestroy()
    }

    override fun onDetach() {
        Log.i("MyTag","Settings onDetach")
        super.onDetach()
    }

}