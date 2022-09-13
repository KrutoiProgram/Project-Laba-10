package com.bignerdranch.android.laba10

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.style.BackgroundColorSpan
import android.view.View
import android.widget.Button
import android.widget.LinearLayout
import androidx.constraintlayout.widget.ConstraintLayout
private var nomer : Int = 0
public lateinit var back : ConstraintLayout
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val preferences = getSharedPreferences("Count", MODE_PRIVATE)
        val edit = preferences.edit()
        back = findViewById(R.id.back)
        nomer = preferences.getInt("Count",nomer)
        var count = nomer + 1
        nomer = count


        edit.putInt("Count",nomer)
        edit.apply()
        if(preferences.getInt("Count",nomer)==1)
        {
            back.setBackgroundResource(R.color.white)
            edit.putInt("Count",nomer)
            edit.apply()
        }
        else if(preferences.getInt("Count",nomer)%2==0)
        {
            back.setBackgroundResource(R.color.blue)
            edit.putInt("Count",nomer)
            edit.apply()
        }
        else if(preferences.getInt("Count",nomer)%1==0)
        {
            back.setBackgroundResource(R.color.green)
            edit.putInt("Count",nomer)
            edit.apply()
        }
    }
}