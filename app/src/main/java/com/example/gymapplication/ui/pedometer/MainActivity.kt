package com.example.gymapplication.ui.pedometer

import android.hardware.Sensor
import android.hardware.SensorEvent
import android.hardware.SensorEventListener
import android.hardware.SensorManager
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.gymapplication.R
import com.example.gymapplication.databinding.ActivityBeginnerPlanBinding
import com.example.gymapplication.databinding.ActivityMain2Binding
import kotlinx.android.synthetic.main.activity_main2.*


class MainActivity : AppCompatActivity(), SensorEventListener, StepListener {
    lateinit var binding: ActivityMain2Binding

    private var simpleStepDetector: StepDetector? = null
    private var sensorManager: SensorManager? = null
    private var accel: Sensor? = null
    private var numSteps = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMain2Binding.inflate(layoutInflater)
        setContentView(binding.root)


        // Get an instance of the SensorManager
        sensorManager = getSystemService(SENSOR_SERVICE) as SensorManager
        accel = sensorManager!!.getDefaultSensor(Sensor.TYPE_ACCELEROMETER)
        simpleStepDetector = StepDetector()
        simpleStepDetector!!.registerListener(this)

//        var tvSteps = findViewById<View>(R.id.tvSteps) as TextView
//        var  btnStart = findViewById<View>(R.id.btn_start) as Button
//        var btnStop = findViewById<View>(R.id.btn_stop) as Button
        btn_start.setOnClickListener {
            numSteps = 0
            sensorManager!!.registerListener(
                this,
                accel,
                SensorManager.SENSOR_DELAY_FASTEST
            )
        }
        btn_stop.setOnClickListener { sensorManager!!.unregisterListener(this) }
    }

    override fun onAccuracyChanged(sensor: Sensor?, accuracy: Int) {}
    override fun onSensorChanged(event: SensorEvent) {
        if (event.sensor.type == Sensor.TYPE_ACCELEROMETER) {
            simpleStepDetector!!.updateAccel(
                    event.timestamp, event.values[0], event.values[1], event.values[2])
        }
    }

    override fun step(timeNs: Long) {
        numSteps++
        tvSteps.text = TEXT_NUM_STEPS + numSteps;
    }

    companion object {
        private const val TEXT_NUM_STEPS = "Number of Steps: "
    }
}