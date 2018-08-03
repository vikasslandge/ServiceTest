package com.vikasslandge.servicetest

import android.app.Service
import android.content.Intent
import android.media.MediaPlayer
import android.os.IBinder
import cubex.mahesh.servicetest.R


class MyService:Service() {
    override fun onBind(p0: Intent?): IBinder {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
    var mPlayer:MediaPlayer? = null

    override fun onCreate() {
        super.onCreate()
        mPlayer = MediaPlayer.create(this,
                R.raw.dj)
    }
    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
        mPlayer!!.start()
        return super.onStartCommand(intent, flags, startId)
    }
    override fun onDestroy() {
        super.onDestroy()
        mPlayer!!.stop()
    }
}