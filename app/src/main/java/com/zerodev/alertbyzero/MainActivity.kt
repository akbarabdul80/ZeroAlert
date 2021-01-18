package com.zerodev.alertbyzero

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.zerodev.zeroalert.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val toast: Toast = Toast(applicationContext)

        toast.toastCheck("Tayo Test")


    }
}