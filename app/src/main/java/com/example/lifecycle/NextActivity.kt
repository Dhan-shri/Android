package com.example.lifecycle

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button

class NextActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_next)

        val butBack= findViewById<Button>(R.id.butback)
        butBack.setOnClickListener{
            val intent= Intent(this@NextActivity,MainActivity::class.java)
            startActivity(intent)
        }
    }


    override fun onStart() {
        super.onStart()

        Log.e("NextActivity","onStart")

    }

    override fun onResume() {
        super.onResume()

        Log.e("NextActivity","onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.e("NextActivity","onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.e("NextActivity","onStop")
    }

    override fun onRestart() {
        super.onRestart()
        Log.e("NextActivity","onRestart")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.e("NextActivity","onDestroy")
    }



}