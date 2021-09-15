package com.sandeepkambojiftmu.hubcoretrofitapi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class ForgetPassword_Hubco : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_forget_password__hubco)

        if (supportActionBar != null) {
            supportActionBar!!.hide()
        }
    }
}