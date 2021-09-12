package com.example.tarea_2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    companion object{
        var  counter: Int = 0
    }
    lateinit var txtCounter : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        txtCounter =findViewById(R.id.textCounter)
        txtCounter.text = counter.toString()
    }

    fun showToast(view: View){
        Toast.makeText(this, "Este es un mensaje de la tostada", Toast.LENGTH_LONG).show()
    }

    fun increment(view: View){
        counter++
        updateCounter(counter.toString())
    }

    fun decrement(view: View){
        counter--
        updateCounter(counter.toString())
    }

    fun reset(view: View){
        counter = 0
        updateCounter(counter.toString())
    }
    private fun updateCounter(value: String){
        txtCounter.text = value
    }
}