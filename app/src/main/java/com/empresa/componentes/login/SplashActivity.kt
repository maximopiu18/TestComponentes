package com.empresa.componentes.login

import android.content.Context
import android.content.Intent
import android.content.res.ColorStateList
import android.graphics.Color
import android.os.AsyncTask
import android.os.Bundle
import android.os.CountDownTimer
import android.support.v7.app.AppCompatActivity
import android.util.Log
import android.widget.ProgressBar
import com.empresa.componentes.R
import android.graphics.PorterDuff
import android.view.WindowManager


class SplashActivity :AppCompatActivity() {

    var isFinishCount= false
    var color :Int = 0
    lateinit var myProgressBar : ProgressBar
    lateinit var mycount : CountDownTimerLoading
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.splash_activity)
        myProgressBar = findViewById(R.id.miProgresBar)

        mycount  = CountDownTimerLoading(2000, 10)
        mycount.start()


    }


    inner class CountDownTimerLoading(millisInFuture: Long, countDownInterval: Long) : CountDownTimer(millisInFuture, countDownInterval) {
        override fun onTick(millisUntilFinished: Long) {
            Log.e("timer", "timer" +millisUntilFinished/1000)
            var milisegundos = (millisUntilFinished/1000).toInt()

            if(milisegundos== 9){
                runOnUiThread {
                    //val color = -0xff0100
                    color = resources.getColor(R.color.progress_09)

                }
            }
           else if(milisegundos== 8){
                runOnUiThread {
                    color = resources.getColor(R.color.progress_08)                }
            }
            else if(milisegundos== 7){
                runOnUiThread {
                    color = resources.getColor(R.color.progress_07)
                }
            }
            else if(milisegundos== 6){
                runOnUiThread {
                    color = resources.getColor(R.color.progress_06)
                }
            }
            else if(milisegundos== 5){
                runOnUiThread {
                    color = resources.getColor(R.color.progress_05)
                }
            }
            else if(milisegundos== 4){
                runOnUiThread {
                    color = resources.getColor(R.color.progress_04)
                }
            }
            else if(milisegundos== 3){
                runOnUiThread {
                    color = resources.getColor(R.color.progress_03)
                }
            }
            else if(milisegundos== 2){
                runOnUiThread {
                    color = resources.getColor(R.color.progress_02)
                }
            }
            else if(milisegundos== 1){
                runOnUiThread {
                    color = resources.getColor(R.color.progress_01)
                }
            }

            myProgressBar.getIndeterminateDrawable().setColorFilter(color, PorterDuff.Mode.SRC_IN)
            myProgressBar.secondaryProgressTintList = ColorStateList.valueOf(resources.getColor(R.color.progress_09))
        }

        override fun onFinish() {
            if(!isFinishCount){
                openLogin()
                isFinishCount=true
            }

        }

        fun openLogin(){
            var intent  = Intent(this@SplashActivity, LoginActivity::class.java)
            startActivity(intent)
            finish()
        }

    }

}