package com.example.activitylifecycle.Fragmet

import android.content.Context
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.activitylifecycle.R

class ProfileFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        Log.i("MyTag","Profile onCreateView")
        val arg =arguments
        if (arg!=null) {
            Log.i("FragmentDataPassed", arg!!.getString("data").toString())
        }
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_profile, container, false)
    }
    override fun onAttach(context: Context) {
        Log.i("MyTag","Profile onAttach")
        super.onAttach(context)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        Log.i("MyTag","Profile onCreate")
        super.onCreate(savedInstanceState)
    }

    override fun onResume() {
        Log.i("MyTag","Profile onResume")
        super.onResume()
    }

    override fun onStart() {
        Log.i("MyTag","Profile onStart")
        super.onStart()
    }

    override fun onPause() {
        Log.i("MyTag","Profile onPause")
        super.onPause()
    }

    override fun onStop() {
        Log.i("MyTag","Profile onStop")
        super.onStop()
    }

    override fun onDestroyView() {
        Log.i("MyTag","Profile onDestroyView")
        super.onDestroyView()
    }

    override fun onDestroy() {
        Log.i("MyTag","Profile ondestroy")
        super.onDestroy()
    }

    override fun onDetach() {
        Log.i("MyTag","Profile onDetach")
        super.onDetach()
    }


}