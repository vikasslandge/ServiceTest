package com.vikasslandge.servicetest

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import cubex.mahesh.servicetest.R
 import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button.setOnClickListener({
            var i = Intent(this@MainActivity,
                                MyService::class.java)
            startService(i)
        })
        button2.setOnClickListener({
            var i = Intent(this@MainActivity,
                    MyService::class.java)
            stopService(i)
        })
    }
}
