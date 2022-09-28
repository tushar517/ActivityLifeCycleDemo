package com.example.activitylifecycle.Fragmet

import android.content.Context
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.example.activitylifecycle.R

class HomeFragment : Fragment() {

    override fun onAttach(context: Context) {
        Log.i("MyTag","Home onAttach")
        super.onAttach(context)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        Log.i("MyTag","Home onCreate")
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        Log.i("MyTag","Home onCreateView")
        // Inflate the layout for this fragment
        val rootView = inflater.inflate(R.layout.fragment_home, container, false)
        val editText:EditText = rootView.findViewById(R.id.enterText)
        val btn:Button = rootView.findViewById(R.id.btnSendData)
        val transaction = parentFragmentManager.beginTransaction()
        val profile = ProfileFragment()
        btn.setOnClickListener {
            if(!editText.text.isNullOrEmpty()){
                val bundle = Bundle()
                bundle.putString("data",editText.text.toString())
                profile.arguments = bundle
                transaction.replace(R.id.framelayout,profile)
                transaction.commit()
            }else{
                Toast.makeText(context,"Enter the data",Toast.LENGTH_SHORT).show()
            }
        }
        return rootView
    }

    override fun onResume() {
        Log.i("MyTag","Home onResume")
        super.onResume()
    }

    override fun onStart() {
        Log.i("MyTag","Home onStart")
        super.onStart()
    }

    override fun onPause() {
        Log.i("MyTag","Home onPause")
        super.onPause()
    }

    override fun onStop() {
        Log.i("MyTag","Home onStop")
        super.onStop()
    }

    override fun onDestroyView() {
        Log.i("MyTag","Home onDestroyView")
        super.onDestroyView()
    }

    override fun onDestroy() {
        Log.i("MyTag","Home ondestroy")
        super.onDestroy()
    }

    override fun onDetach() {
        Log.i("MyTag","Home onDetach")
        super.onDetach()
    }

}