package com.example.programmingpath

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity44 : AppCompatActivity()
{
    companion object {
        var clicked = 0
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main44)
    }

    fun buphp(view: View) {
        startActivity(Intent(this@MainActivity44, Web4::class.java))
        clicked = 6
    }
    fun bupyth2(view: View) {
        startActivity(Intent(this@MainActivity44, Web4::class.java))
        clicked = 13
    }
    fun bunet(view: View) {
        startActivity(Intent(this@MainActivity44, Web4::class.java))
        clicked = 9
    }
}