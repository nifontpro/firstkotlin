package ru.nifontbus.firstkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val listener = object : View.OnClickListener {
            override fun onClick(v: View?) {
                TODO("Not yet implemented")
            }

        }

        val listener1 = View.OnClickListener { TODO("Not yet implemented") }

        val type = TYPE.TYPE2

        var x = when (type) {
            TYPE.TYPE1 -> 1
            TYPE.TYPE2 -> 2
            TYPE.TYPE3 -> 3
            TYPE.TYPE4 -> 4
        }

        Log.d("my","x=$x")

        x = when {
            type == TYPE.TYPE2 -> 2
            type.ordinal == 1 -> 1
            else -> 5
        }

        Log.d("my","x=$x")
        Log.d("my", type.ordinal.toString())
    }
}

enum class TYPE {
    TYPE1,
    TYPE2,
    TYPE3,
    TYPE4
}