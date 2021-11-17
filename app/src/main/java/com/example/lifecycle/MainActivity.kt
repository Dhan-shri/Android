package com.example.lifecycle

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        val butFirst= findViewById<Button>(R.id.butfirst)
        butFirst.setOnClickListener{
            val intent= Intent(this@MainActivity,NextActivity::class.java)
            startActivity(intent)
        }
    }


    override fun onStart() {
        super.onStart()

        Log.e("MainActivity","onStart")

    }

    override fun onResume() {
        super.onResume()

        Log.e("MainActivity","onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.e("MainActivity","onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.e("MainActivity","onStop")
    }

    override fun onRestart() {
        super.onRestart()
        Log.e("MainActivity","onRestart")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.e("MainActivity","onDestroy")
    }



}