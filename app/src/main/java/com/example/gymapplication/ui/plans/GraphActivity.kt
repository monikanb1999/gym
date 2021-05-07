package com.example.gymapplication.ui.plans

import android.content.Context
import android.hardware.Sensor
import android.hardware.SensorEvent
import android.hardware.SensorEventListener
import android.hardware.SensorManager
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.gymapplication.databinding.ActivityGraphactBinding
import kotlinx.android.synthetic.main.activity_graphact.*


class GraphActivity : AppCompatActivity(), SensorEventListener  {
    lateinit var binding: ActivityGraphactBinding
    private var sensorManager: SensorManager? = null
    private var running = false
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityGraphactBinding.inflate(layoutInflater)
        setContentView(binding.root)
        sensorManager = getSystemService(SENSOR_SERVICE) as SensorManager

        var sensorManager = getSystemService(Context.SENSOR_SERVICE) as SensorManager

    }

    override fun onResume() {
        super.onResume()
        running = true
        var stepsSensor = sensorManager?.getDefaultSensor(Sensor.TYPE_STEP_COUNTER)

        if (stepsSensor == null) {
            Toast.makeText(this, "No Step Counter Sensor !", Toast.LENGTH_SHORT).show()
        } else {
            sensorManager?.registerListener(this, stepsSensor, SensorManager.SENSOR_DELAY_UI)
        }
    }

    override fun onPause() {
        super.onPause()
        running = false
        sensorManager?.unregisterListener(this)
    }

    override fun onAccuracyChanged(p0: Sensor?, p1: Int) {
    }

    override fun onSensorChanged(event: SensorEvent) {
               if (running) {
                tv_stepsTaken.setText("" + event.values[0])
            }
        }

    }

