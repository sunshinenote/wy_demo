package com.example.demo_lib

import android.content.Context
import android.widget.Toast

object TestClass {
    fun showToast(msg:String,context:Context){
        Toast.makeText(context,msg,Toast.LENGTH_SHORT).show()
    }
}