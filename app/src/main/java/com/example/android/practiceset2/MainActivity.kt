package com.example.android.practiceset2;

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.TextView
import com.example.android.practiceset2.R

class MainActivity : AppCompatActivity()
{

    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var raspberryPrice = 5

        display1("1 box: $$raspberryPrice")
        raspberryPrice = 10
        display2("2 boxes: $$raspberryPrice")
        display3("3 boxes: $" + raspberryPrice * 3)

/**
        display1( "This is Box 1.");
        display2( "And this is Box 2.");
        display3( "And look! Box 3!");
*/
/*        val weekday = 5
        val weekend = 9
        val optimalHours = 7 * 8

        var actualHours = weekday
        actualHours = actualHours + weekend * 2;
        val solution = optimalHours - actualHours;
        display(solution)
*/
    }

    /**
     * Display methods that allow the text to appear on the screen. Don't worry if you don't know
     * how these work yet. We'll be covering them in lesson 3.
     */

    fun display(text: String)
    {
        val t = findViewById(R.id.display_text_view) as TextView
        t.text = text
    }

    fun display(text: Int)
    {
        val t = findViewById(R.id.display_text_view) as TextView
        t.text = text.toString() + ""
    }

    fun display1(text: String)
    {
        display(text)
    }

    fun display2(text: String)
    {
        val t = findViewById(R.id.display_text_view_2) as TextView
        t.text = text
    }

    fun display3(text: String)
    {
        val t = findViewById(R.id.display_text_view_3) as TextView
        t.text = text
    }
}