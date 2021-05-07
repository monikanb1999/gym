package com.example.gymapplication.ui.pedometer

interface StepListener {
    fun step(timeNs: Long)
}