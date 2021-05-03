package com.example.gymapplication.ui.plans

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.gymapplication.R
import com.example.gymapplication.databinding.FragmentGraphBinding
import com.example.gymapplication.databinding.FragmentTrainingBinding


class GraphFragment : Fragment() {
    lateinit var binding: FragmentGraphBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentGraphBinding.inflate(layoutInflater)
        return binding.root
    }


}