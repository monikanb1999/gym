package com.example.gymapplication.ui.Activity

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.gymapplication.R
import com.example.gymapplication.databinding.*
import com.example.gymapplication.ui.plans.PlansViewModel

class IntermediateplanListActivity : AppCompatActivity() {
    lateinit var binding: ActivityIntermediatePlanBinding
    var interdaynumber:Int=0
    val viewmodel: PlansViewModel by lazy {
        ViewModelProvider(this).get(PlansViewModel::class.java)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityIntermediatePlanBinding.inflate(layoutInflater)
        setContentView(binding.root)
        interdaynumber= intent!!.extras?.get("position") as Int
        Log.d("interdaynumber", "onCreate: $interdaynumber")
        val adapter = InterPlanListAdapter(this)
        binding.interrecyclerview.setHasFixedSize(true)
        val layoutManager: RecyclerView.LayoutManager = LinearLayoutManager(this)
        binding.interrecyclerview.layoutManager = layoutManager
        binding.interrecyclerview?.adapter =adapter

        viewmodel.gymplandetaillist.observe(this, {

        })
    }
    private inner class InterPlanListAdapter internal constructor(
        context: Context
    ) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {
        private val JumpingJacks = 0
        private val Squats = 1
        private val PushUps = 2
        private val LegRaises = 3

        private val inflater: LayoutInflater = LayoutInflater.from(context)
//        var gymfooddetaillist = emptyList<CustomerDetails>()

        override fun getItemViewType(position: Int): Int {
            when (position) {
                0 -> return JumpingJacks
                1 -> return Squats
                2 -> return PushUps
                3 -> return LegRaises
            }
            return super.getItemViewType(position)
        }

        override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
            if (getItemViewType(position) == JumpingJacks) {
                (holder as ShowBeginPlanViewHolder)
                when (interdaynumber) {
                    1 -> {
                        holder.jumpingjacksBinding.JumpingJackstextView.text.toString()
                        holder.jumpingjacksBinding.JumpingJacksTextView.text =
                            resources.getString(R.string.jj1a)
                        holder.jumpingjacksBinding.JumpingJacksTextView2.text =
                            resources.getString(R.string.jj1b)

                    }
                    2 -> {
                        holder.jumpingjacksBinding.JumpingJackstextView.text.toString()
                        holder.jumpingjacksBinding.JumpingJacksTextView.text =
                            resources.getString(R.string.jj2a)
                        holder.jumpingjacksBinding.JumpingJacksTextView2.text =
                            resources.getString(R.string.jj2b)
                    }
                    3 -> {
                        holder.jumpingjacksBinding.JumpingJackstextView.text.toString()
                        holder.jumpingjacksBinding.JumpingJacksTextView.text =
                            resources.getString(R.string.jj1a)
                        holder.jumpingjacksBinding.JumpingJacksTextView2.text =
                            resources.getString(R.string.jj1b)
                    }
                    4 -> {
                        holder.jumpingjacksBinding.JumpingJackstextView.text.toString()
                        holder.jumpingjacksBinding.JumpingJacksTextView.text =
                            resources.getString(R.string.jj4a)
                        holder.jumpingjacksBinding.JumpingJacksTextView2.text =
                            resources.getString(R.string.jj4b)
                    }
                    5 -> {
                        holder.jumpingjacksBinding.JumpingJackstextView.text.toString()
                        holder.jumpingjacksBinding.JumpingJacksTextView.text =
                            resources.getString(R.string.jj2a)
                        holder.jumpingjacksBinding.JumpingJacksTextView2.text =
                            resources.getString(R.string.jj2b)
                    }
                    6 -> {
                        holder.jumpingjacksBinding.JumpingJackstextView.text.toString()
                        holder.jumpingjacksBinding.JumpingJacksTextView.text =
                            resources.getString(R.string.jj5a)
                        holder.jumpingjacksBinding.JumpingJacksTextView2.text =
                            resources.getString(R.string.jj5b)
                    }
                    7 -> {
                        holder.jumpingjacksBinding.JumpingJackstextView.text.toString()
                        holder.jumpingjacksBinding.JumpingJacksTextView.text =
                            resources.getString(R.string.jj1a)
                        holder.jumpingjacksBinding.JumpingJacksTextView2.text =
                            resources.getString(R.string.jj1b)
                    }
                    8 -> {
                        holder.jumpingjacksBinding.JumpingJackstextView.text.toString()
                        holder.jumpingjacksBinding.JumpingJacksTextView.text =
                            resources.getString(R.string.jj5a)
                        holder.jumpingjacksBinding.JumpingJacksTextView2.text =
                            resources.getString(R.string.jj5b)
                    }
                    9 -> {
                        holder.jumpingjacksBinding.JumpingJackstextView.text.toString()
                        holder.jumpingjacksBinding.JumpingJacksTextView.text =
                            resources.getString(R.string.jj4a)
                        holder.jumpingjacksBinding.JumpingJacksTextView2.text =
                            resources.getString(R.string.jj4b)
                    }
                    10 -> {
                        holder.jumpingjacksBinding.JumpingJackstextView.text.toString()
                        holder.jumpingjacksBinding.JumpingJacksTextView.text =
                            resources.getString(R.string.jj2a)
                        holder.jumpingjacksBinding.JumpingJacksTextView2.text =
                            resources.getString(R.string.jj2b)
                    }
                    11 -> {
                        holder.jumpingjacksBinding.JumpingJackstextView.text.toString()
                        holder.jumpingjacksBinding.JumpingJacksTextView.text =
                            resources.getString(R.string.jj1a)
                        holder.jumpingjacksBinding.JumpingJacksTextView2.text =
                            resources.getString(R.string.jj1b)
                    }//
                    12 -> {
                        holder.jumpingjacksBinding.JumpingJackstextView.text.toString()
                        holder.jumpingjacksBinding.JumpingJacksTextView.text =
                            resources.getString(R.string.jj3a)
                    }
                    13 -> {
                        holder.jumpingjacksBinding.JumpingJackstextView.text.toString()
                        holder.jumpingjacksBinding.JumpingJacksTextView.text =
                            resources.getString(R.string.jj4a)
                        holder.jumpingjacksBinding.JumpingJacksTextView2.text =
                            resources.getString(R.string.jj4b)
                    }
                    14 -> {
                        holder.jumpingjacksBinding.JumpingJackstextView.text.toString()
                        holder.jumpingjacksBinding.JumpingJacksTextView.text =
                            resources.getString(R.string.jj4a)
                        holder.jumpingjacksBinding.JumpingJacksTextView2.text =
                            resources.getString(R.string.jj4b)
                    }
                    15 -> {
                        holder.jumpingjacksBinding.JumpingJackstextView.text.toString()
                        holder.jumpingjacksBinding.JumpingJacksTextView.text =
                            resources.getString(R.string.jj1a)
                        holder.jumpingjacksBinding.JumpingJacksTextView2.text =
                            resources.getString(R.string.jj1b)
                    }
                    16 -> {
                        holder.jumpingjacksBinding.JumpingJackstextView.text.toString()
                        holder.jumpingjacksBinding.JumpingJacksTextView.text =
                            resources.getString(R.string.jj2a)
                        holder.jumpingjacksBinding.JumpingJacksTextView2.text =
                            resources.getString(R.string.jj2b)
                    }
                    17 -> {
                        holder.jumpingjacksBinding.JumpingJackstextView.text.toString()
                        holder.jumpingjacksBinding.JumpingJacksTextView.text =
                            resources.getString(R.string.jj4a)
                        holder.jumpingjacksBinding.JumpingJacksTextView2.text =
                            resources.getString(R.string.jj4b)
                    }
                    18 -> {
                        holder.jumpingjacksBinding.JumpingJackstextView.text.toString()
                        holder.jumpingjacksBinding.JumpingJacksTextView.text =
                            resources.getString(R.string.jj1a)
                        holder.jumpingjacksBinding.JumpingJacksTextView2.text =
                            resources.getString(R.string.jj1b)
                    }
                    19 -> {
                        holder.jumpingjacksBinding.JumpingJackstextView.text.toString()
                        holder.jumpingjacksBinding.JumpingJacksTextView.text =
                            resources.getString(R.string.jj4a)
                        holder.jumpingjacksBinding.JumpingJacksTextView2.text =
                            resources.getString(R.string.jj4b)
                    }
                    20 -> {
                        holder.jumpingjacksBinding.JumpingJackstextView.text.toString()
                        holder.jumpingjacksBinding.JumpingJacksTextView.text =
                            resources.getString(R.string.jj1a)
                        holder.jumpingjacksBinding.JumpingJacksTextView2.text =
                            resources.getString(R.string.jj1b)
                    }
                    21 -> {
                        holder.jumpingjacksBinding.JumpingJackstextView.text.toString()
                        holder.jumpingjacksBinding.JumpingJacksTextView.text =
                            resources.getString(R.string.jj3a)
                    }
                    22 -> {
                        holder.jumpingjacksBinding.JumpingJackstextView.text.toString()
                        holder.jumpingjacksBinding.JumpingJacksTextView.text =
                            resources.getString(R.string.jj1a)
                        holder.jumpingjacksBinding.JumpingJacksTextView2.text =
                            resources.getString(R.string.jj1b)
                    }
                    23 -> {
                        holder.jumpingjacksBinding.JumpingJackstextView.text.toString()
                        holder.jumpingjacksBinding.JumpingJacksTextView.text =
                            resources.getString(R.string.jj3a)
                    }
                    24 -> {
                        holder.jumpingjacksBinding.JumpingJackstextView.text.toString()
                        holder.jumpingjacksBinding.JumpingJacksTextView.text =
                            resources.getString(R.string.jj4a)
                        holder.jumpingjacksBinding.JumpingJacksTextView2.text =
                            resources.getString(R.string.jj4b)
                    }
                    25 -> {
                        holder.jumpingjacksBinding.JumpingJackstextView.text.toString()
                        holder.jumpingjacksBinding.JumpingJacksTextView.text =
                            resources.getString(R.string.jj1a)
                        holder.jumpingjacksBinding.JumpingJacksTextView2.text =
                            resources.getString(R.string.jj1b)
                    }
                    26 -> {
                        holder.jumpingjacksBinding.JumpingJackstextView.text.toString()
                        holder.jumpingjacksBinding.JumpingJacksTextView.text =
                            resources.getString(R.string.jj4a)
                        holder.jumpingjacksBinding.JumpingJacksTextView2.text =
                            resources.getString(R.string.jj4b)
                    }
                    27 -> {
                        holder.jumpingjacksBinding.JumpingJackstextView.text.toString()
                        holder.jumpingjacksBinding.JumpingJacksTextView.text =
                            resources.getString(R.string.jj3a)
                    }
                    28 -> {
                        holder.jumpingjacksBinding.JumpingJackstextView.text.toString()
                        holder.jumpingjacksBinding.JumpingJacksTextView.text =
                            resources.getString(R.string.jj1a)
                        holder.jumpingjacksBinding.JumpingJacksTextView2.text =
                            resources.getString(R.string.jj1b)
                    }
                    29 -> {
                        holder.jumpingjacksBinding.JumpingJackstextView.text.toString()
                        holder.jumpingjacksBinding.JumpingJacksTextView.text =
                            resources.getString(R.string.jj2a)
                        holder.jumpingjacksBinding.JumpingJacksTextView2.text =
                            resources.getString(R.string.jj2b)
                    }
                    30 -> {
                        holder.jumpingjacksBinding.JumpingJackstextView.text.toString()
                        holder.jumpingjacksBinding.JumpingJacksTextView.text =
                            resources.getString(R.string.jj1a)
                        holder.jumpingjacksBinding.JumpingJacksTextView2.text =
                            resources.getString(R.string.jj1b)
                    }
                }
                holder.jumpingjacksBinding.executePendingBindings()
            }
            if (getItemViewType(position) == PushUps) {
                (holder as ShowBeginPushUpsViewHolder)
                when(interdaynumber) {
                    1 -> {
                        holder.pushupsBinding.pushupstextView.text.toString()
                        holder.pushupsBinding.pushupsCountTextView.text= resources.getString(R.string.lunch1a)
                        holder.pushupsBinding.pushupsCountTextView2.text= resources.getString(R.string.lunch1b)
                    }
                    2 -> {
                        holder.pushupsBinding.pushupstextView.text.toString()
                        holder.pushupsBinding.pushupsCountTextView.text= resources.getString(R.string.lunch1a)
                        holder.pushupsBinding.pushupsCountTextView2.text= resources.getString(R.string.lunch1b)
                    }
                    3 -> {
                        holder.pushupsBinding.pushupstextView.text.toString()
                        holder.pushupsBinding.pushupsCountTextView.text= resources.getString(R.string.lunch1a)
                        holder.pushupsBinding.pushupsCountTextView2.text= resources.getString(R.string.lunch1b)
                    }
                    4 -> {
                        holder.pushupsBinding.pushupstextView.text.toString()
                        holder.pushupsBinding.pushupsCountTextView.text= resources.getString(R.string.lunch1a)
                        holder.pushupsBinding.pushupsCountTextView2.text= resources.getString(R.string.lunch1b)
                    }
                    5 -> {
                        holder.pushupsBinding.pushupstextView.text.toString()
                        holder.pushupsBinding.pushupsCountTextView.text= resources.getString(R.string.lunch1a)
                        holder.pushupsBinding.pushupsCountTextView2.text= resources.getString(R.string.lunch1b)
                    }
                    6 -> {
                        holder.pushupsBinding.pushupstextView.text.toString()
                        holder.pushupsBinding.pushupsCountTextView.text= resources.getString(R.string.lunch1a)
                        holder.pushupsBinding.pushupsCountTextView2.text= resources.getString(R.string.lunch1b)
                    }
                    7 -> {
                        holder.pushupsBinding.pushupstextView.text.toString()
                        holder.pushupsBinding.pushupsCountTextView.text= resources.getString(R.string.lunch1a)
                        holder.pushupsBinding.pushupsCountTextView2.text= resources.getString(R.string.lunch1b)
                    }
                    8 -> {
                        holder.pushupsBinding.pushupstextView.text.toString()
                        holder.pushupsBinding.pushupsCountTextView.text= resources.getString(R.string.lunch1a)
                        holder.pushupsBinding.pushupsCountTextView2.text= resources.getString(R.string.lunch1b)
                    }
                    9 -> {
                        holder.pushupsBinding.pushupstextView.text.toString()
                        holder.pushupsBinding.pushupsCountTextView.text= resources.getString(R.string.lunch1a)
                        holder.pushupsBinding.pushupsCountTextView2.text= resources.getString(R.string.lunch1b)
                    }
                    10 -> {
                        holder.pushupsBinding.pushupstextView.text.toString()
                        holder.pushupsBinding.pushupsCountTextView.text= resources.getString(R.string.lunch1a)
                        holder.pushupsBinding.pushupsCountTextView2.text= resources.getString(R.string.lunch1b)
                    }
                    11 -> {
                        holder.pushupsBinding.pushupstextView.text.toString()
                        holder.pushupsBinding.pushupsCountTextView.text= resources.getString(R.string.lunch1a)
                        holder.pushupsBinding.pushupsCountTextView2.text= resources.getString(R.string.lunch1b)
                    }
                    12 -> {
                        holder.pushupsBinding.pushupstextView.text.toString()
                        holder.pushupsBinding.pushupsCountTextView.text= resources.getString(R.string.lunch1a)
                        holder.pushupsBinding.pushupsCountTextView2.text= resources.getString(R.string.lunch1b)
                    }
                    13 -> {
                        holder.pushupsBinding.pushupstextView.text.toString()
                        holder.pushupsBinding.pushupsCountTextView.text= resources.getString(R.string.lunch1a)
                        holder.pushupsBinding.pushupsCountTextView2.text= resources.getString(R.string.lunch1b)
                    }
                    14 -> {
                        holder.pushupsBinding.pushupstextView.text.toString()
                        holder.pushupsBinding.pushupsCountTextView.text= resources.getString(R.string.lunch1a)
                        holder.pushupsBinding.pushupsCountTextView2.text= resources.getString(R.string.lunch1b)
                    }
                    15 -> {
                        holder.pushupsBinding.pushupstextView.text.toString()
                        holder.pushupsBinding.pushupsCountTextView.text= resources.getString(R.string.lunch1a)
                        holder.pushupsBinding.pushupsCountTextView2.text= resources.getString(R.string.lunch1b)
                    }
                    16-> {
                        holder.pushupsBinding.pushupstextView.text.toString()
                        holder.pushupsBinding.pushupsCountTextView.text= resources.getString(R.string.lunch1a)
                        holder.pushupsBinding.pushupsCountTextView2.text= resources.getString(R.string.lunch1b)
                    }
                    17 -> {
                        holder.pushupsBinding.pushupstextView.text.toString()
                        holder.pushupsBinding.pushupsCountTextView.text= resources.getString(R.string.lunch1a)
                        holder.pushupsBinding.pushupsCountTextView2.text= resources.getString(R.string.lunch1b)
                    }
                    18 -> {
                        holder.pushupsBinding.pushupstextView.text.toString()
                        holder.pushupsBinding.pushupsCountTextView.text= resources.getString(R.string.lunch1a)
                        holder.pushupsBinding.pushupsCountTextView2.text= resources.getString(R.string.lunch1b)
                    }
                    19 -> {
                        holder.pushupsBinding.pushupstextView.text.toString()
                        holder.pushupsBinding.pushupsCountTextView.text= resources.getString(R.string.lunch1a)
                        holder.pushupsBinding.pushupsCountTextView2.text= resources.getString(R.string.lunch1b)
                    }
                    20 -> {
                        holder.pushupsBinding.pushupstextView.text.toString()
                        holder.pushupsBinding.pushupsCountTextView.text= resources.getString(R.string.lunch1a)
                        holder.pushupsBinding.pushupsCountTextView2.text= resources.getString(R.string.lunch1b)
                    }
                    21 -> {
                        holder.pushupsBinding.pushupstextView.text.toString()
                        holder.pushupsBinding.pushupsCountTextView.text= resources.getString(R.string.lunch1a)
                        holder.pushupsBinding.pushupsCountTextView2.text= resources.getString(R.string.lunch1b)
                    }
                    22 -> {
                        holder.pushupsBinding.pushupstextView.text.toString()
                        holder.pushupsBinding.pushupsCountTextView.text= resources.getString(R.string.lunch1a)
                        holder.pushupsBinding.pushupsCountTextView2.text= resources.getString(R.string.lunch1b)
                    }
                    23 -> {
                        holder.pushupsBinding.pushupstextView.text.toString()
                        holder.pushupsBinding.pushupsCountTextView.text= resources.getString(R.string.lunch1a)
                        holder.pushupsBinding.pushupsCountTextView2.text= resources.getString(R.string.lunch1b)
                    }
                    24 -> {
                        holder.pushupsBinding.pushupstextView.text.toString()
                        holder.pushupsBinding.pushupsCountTextView.text= resources.getString(R.string.lunch1a)
                        holder.pushupsBinding.pushupsCountTextView2.text= resources.getString(R.string.lunch1b)
                    }
                    25 -> {
                        holder.pushupsBinding.pushupstextView.text.toString()
                        holder.pushupsBinding.pushupsCountTextView.text= resources.getString(R.string.lunch1a)
                        holder.pushupsBinding.pushupsCountTextView2.text= resources.getString(R.string.lunch1b)
                    }
                    26 -> {
                        holder.pushupsBinding.pushupstextView.text.toString()
                        holder.pushupsBinding.pushupsCountTextView.text= resources.getString(R.string.lunch1a)
                        holder.pushupsBinding.pushupsCountTextView2.text= resources.getString(R.string.lunch1b)
                    }
                    27 -> {
                        holder.pushupsBinding.pushupstextView.text.toString()
                        holder.pushupsBinding.pushupsCountTextView.text= resources.getString(R.string.lunch1a)
                        holder.pushupsBinding.pushupsCountTextView2.text= resources.getString(R.string.lunch1b)
                    }
                    28 -> {
                        holder.pushupsBinding.pushupstextView.text.toString()
                        holder.pushupsBinding.pushupsCountTextView.text= resources.getString(R.string.lunch1a)
                        holder.pushupsBinding.pushupsCountTextView2.text= resources.getString(R.string.lunch1b)
                    }
                    29 -> {
                        holder.pushupsBinding.pushupstextView.text.toString()
                        holder.pushupsBinding.pushupsCountTextView.text= resources.getString(R.string.lunch1a)
                        holder.pushupsBinding.pushupsCountTextView2.text= resources.getString(R.string.lunch1b)
                    }
                    30 -> {
                        holder.pushupsBinding.pushupstextView.text.toString()
                        holder.pushupsBinding.pushupsCountTextView.text= resources.getString(R.string.lunch1a)
                        holder.pushupsBinding.pushupsCountTextView2.text= resources.getString(R.string.lunch1b)
                    }

                }
                holder.pushupsBinding.executePendingBindings()
            }
            if (getItemViewType(position) == LegRaises) {
                (holder as ShowBeginLRViewHolder)
                when(interdaynumber) {
                    1 -> {
                        holder.legraisesBinding.lrtextView.text.toString()
                        holder.legraisesBinding.lrCountTextView.text= resources.getString(R.string.Dinner1a)
                        holder.legraisesBinding.lrCountTextView2.text= resources.getString(R.string.Dinner1b)
                    }
                    2 -> {
                        holder.legraisesBinding.lrtextView.text.toString()
                        holder.legraisesBinding.lrCountTextView.text= resources.getString(R.string.Dinner1a)
                        holder.legraisesBinding.lrCountTextView2.text= resources.getString(R.string.Dinner1b)
                    }
                    3 -> {
                        holder.legraisesBinding.lrtextView.text.toString()
                        holder.legraisesBinding.lrCountTextView.text= resources.getString(R.string.Dinner1a)
                        holder.legraisesBinding.lrCountTextView2.text= resources.getString(R.string.Dinner1b)
                    }
                    4 -> {
                        holder.legraisesBinding.lrtextView.text.toString()
                        holder.legraisesBinding.lrCountTextView.text= resources.getString(R.string.Dinner1a)
                        holder.legraisesBinding.lrCountTextView2.text= resources.getString(R.string.Dinner1b)
                    }
                    5 -> {
                        holder.legraisesBinding.lrtextView.text.toString()
                        holder.legraisesBinding.lrCountTextView.text= resources.getString(R.string.Dinner1a)
                        holder.legraisesBinding.lrCountTextView2.text= resources.getString(R.string.Dinner1b)
                    }  6 -> {
                    holder.legraisesBinding.lrtextView.text.toString()
                    holder.legraisesBinding.lrCountTextView.text= resources.getString(R.string.Dinner1a)
                    holder.legraisesBinding.lrCountTextView2.text= resources.getString(R.string.Dinner1b)
                }  7 -> {
                    holder.legraisesBinding.lrtextView.text.toString()
                    holder.legraisesBinding.lrCountTextView.text= resources.getString(R.string.Dinner1a)
                    holder.legraisesBinding.lrCountTextView2.text= resources.getString(R.string.Dinner1b)
                }  8 -> {
                    holder.legraisesBinding.lrtextView.text.toString()
                    holder.legraisesBinding.lrCountTextView.text= resources.getString(R.string.Dinner1a)
                    holder.legraisesBinding.lrCountTextView2.text= resources.getString(R.string.Dinner1b)
                }
                    9 -> {
                        holder.legraisesBinding.lrtextView.text.toString()
                        holder.legraisesBinding.lrCountTextView.text= resources.getString(R.string.Dinner1a)
                        holder.legraisesBinding.lrCountTextView2.text= resources.getString(R.string.Dinner1b)
                    }  10 -> {
                    holder.legraisesBinding.lrtextView.text.toString()
                    holder.legraisesBinding.lrCountTextView.text= resources.getString(R.string.Dinner1a)
                    holder.legraisesBinding.lrCountTextView2.text= resources.getString(R.string.Dinner1b)
                }
                    11 -> {
                        holder.legraisesBinding.lrtextView.text.toString()
                        holder.legraisesBinding.lrCountTextView.text= resources.getString(R.string.Dinner1a)
                        holder.legraisesBinding.lrCountTextView2.text= resources.getString(R.string.Dinner1b)
                    }
                    12 -> {
                        holder.legraisesBinding.lrtextView.text.toString()
                        holder.legraisesBinding.lrCountTextView.text= resources.getString(R.string.Dinner1a)
                        holder.legraisesBinding.lrCountTextView2.text= resources.getString(R.string.Dinner1b)
                    }
                    13 -> {
                        holder.legraisesBinding.lrtextView.text.toString()
                        holder.legraisesBinding.lrCountTextView.text= resources.getString(R.string.Dinner1a)
                        holder.legraisesBinding.lrCountTextView2.text= resources.getString(R.string.Dinner1b)
                    }  14 -> {
                    holder.legraisesBinding.lrtextView.text.toString()
                    holder.legraisesBinding.lrCountTextView.text= resources.getString(R.string.Dinner1a)
                    holder.legraisesBinding.lrCountTextView2.text= resources.getString(R.string.Dinner1b)
                }  15 -> {
                    holder.legraisesBinding.lrtextView.text.toString()
                    holder.legraisesBinding.lrCountTextView.text= resources.getString(R.string.Dinner1a)
                    holder.legraisesBinding.lrCountTextView2.text= resources.getString(R.string.Dinner1b)
                }
                    16-> {
                        holder.legraisesBinding.lrtextView.text.toString()
                        holder.legraisesBinding.lrCountTextView.text= resources.getString(R.string.Dinner1a)
                        holder.legraisesBinding.lrCountTextView2.text= resources.getString(R.string.Dinner1b)
                    }
                    17 -> {
                        holder.legraisesBinding.lrtextView.text.toString()
                        holder.legraisesBinding.lrCountTextView.text= resources.getString(R.string.Dinner1a)
                        holder.legraisesBinding.lrCountTextView2.text= resources.getString(R.string.Dinner1b)
                    }
                    18-> {
                        holder.legraisesBinding.lrtextView.text.toString()
                        holder.legraisesBinding.lrCountTextView.text= resources.getString(R.string.Dinner1a)
                        holder.legraisesBinding.lrCountTextView2.text= resources.getString(R.string.Dinner1b)
                    }
                    19 -> {
                        holder.legraisesBinding.lrtextView.text.toString()
                        holder.legraisesBinding.lrCountTextView.text= resources.getString(R.string.Dinner1a)
                        holder.legraisesBinding.lrCountTextView2.text= resources.getString(R.string.Dinner1b)
                    }
                    20 -> {
                        holder.legraisesBinding.lrtextView.text.toString()
                        holder.legraisesBinding.lrCountTextView.text= resources.getString(R.string.Dinner1a)
                        holder.legraisesBinding.lrCountTextView2.text= resources.getString(R.string.Dinner1b)
                    }
                    21 -> {
                        holder.legraisesBinding.lrtextView.text.toString()
                        holder.legraisesBinding.lrCountTextView.text= resources.getString(R.string.Dinner1a)
                        holder.legraisesBinding.lrCountTextView2.text= resources.getString(R.string.Dinner1b)
                    }
                    22 -> {
                        holder.legraisesBinding.lrtextView.text.toString()
                        holder.legraisesBinding.lrCountTextView.text= resources.getString(R.string.Dinner1a)
                        holder.legraisesBinding.lrCountTextView2.text= resources.getString(R.string.Dinner1b)
                    }
                    23 -> {
                        holder.legraisesBinding.lrtextView.text.toString()
                        holder.legraisesBinding.lrCountTextView.text= resources.getString(R.string.Dinner1a)
                        holder.legraisesBinding.lrCountTextView2.text= resources.getString(R.string.Dinner1b)
                    }
                    24 -> {
                        holder.legraisesBinding.lrtextView.text.toString()
                        holder.legraisesBinding.lrCountTextView.text= resources.getString(R.string.Dinner1a)
                        holder.legraisesBinding.lrCountTextView2.text= resources.getString(R.string.Dinner1b)
                    }
                    25 -> {
                        holder.legraisesBinding.lrtextView.text.toString()
                        holder.legraisesBinding.lrCountTextView.text= resources.getString(R.string.Dinner1a)
                        holder.legraisesBinding.lrCountTextView2.text= resources.getString(R.string.Dinner1b)
                    }
                    26 -> {
                        holder.legraisesBinding.lrtextView.text.toString()
                        holder.legraisesBinding.lrCountTextView.text= resources.getString(R.string.Dinner1a)
                        holder.legraisesBinding.lrCountTextView2.text= resources.getString(R.string.Dinner1b)
                    }
                    27 -> {
                        holder.legraisesBinding.lrtextView.text.toString()
                        holder.legraisesBinding.lrCountTextView.text= resources.getString(R.string.Dinner1a)
                        holder.legraisesBinding.lrCountTextView2.text= resources.getString(R.string.Dinner1b)
                    }
                    28 -> {
                        holder.legraisesBinding.lrtextView.text.toString()
                        holder.legraisesBinding.lrCountTextView.text= resources.getString(R.string.Dinner1a)
                        holder.legraisesBinding.lrCountTextView2.text= resources.getString(R.string.Dinner1b)
                    }  29 -> {
                    holder.legraisesBinding.lrtextView.text.toString()
                    holder.legraisesBinding.lrCountTextView.text= resources.getString(R.string.Dinner1a)
                    holder.legraisesBinding.lrCountTextView2.text= resources.getString(R.string.Dinner1b)
                }
                    30 -> {
                        holder.legraisesBinding.lrtextView.text.toString()
                        holder.legraisesBinding.lrCountTextView.text= resources.getString(R.string.Dinner1a)
                        holder.legraisesBinding.lrCountTextView2.text= resources.getString(R.string.Dinner1b)
                    }


                }
                holder.legraisesBinding.executePendingBindings()
            }
        }

        override fun getItemCount(): Int {
            return 4
        }

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
            when (viewType) {
                JumpingJacks -> {
                    val jumpingjacksBinding: JumpingjacksBinding = DataBindingUtil.inflate(inflater, R.layout.jumpingjacks, parent, false)
                    return ShowBeginPlanViewHolder(jumpingjacksBinding)
                }
                Squats -> {
                    val squatsBinding: SquatsBinding = DataBindingUtil.inflate(inflater, R.layout.squats, parent, false)
                    return ShowBeginPlanSQViewHolder(squatsBinding)
                }
                PushUps -> {
                    val pushupsBinding: PushupsBinding = DataBindingUtil.inflate(inflater, R.layout.pushups, parent, false)
                    return ShowBeginPushUpsViewHolder(pushupsBinding)
                }
                else -> {
                    val legraisesBinding: LegraisesBinding = DataBindingUtil.inflate(inflater, R.layout.legraises, parent, false)
                    return ShowBeginLRViewHolder(legraisesBinding)
                }
            }
        }
    }
}