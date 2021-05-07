package com.example.gymapplication.ui.plans

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.gymapplication.DetectHandler
import com.example.gymapplication.R
import com.example.gymapplication.databinding.FragmentDetectingBinding
import com.example.gymapplication.databinding.FragmentNotificationsBinding
import com.example.gymapplication.ui.activity.EditableHomeActivity
import com.example.gymapplication.ui.pedometer.MainActivity

class DetectingFragment : Fragment(),DetectHandler {
    lateinit var binding: FragmentDetectingBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        binding = FragmentDetectingBinding.inflate(layoutInflater)
        return binding.root
        binding.detecthandler = this
    }

    override fun onDetectClicked(view: View) {
        startActivity(Intent(context, MainActivity::class.java))

    }


}