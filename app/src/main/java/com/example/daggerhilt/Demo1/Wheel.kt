package com.example.daggerhilt.Demo1

import android.util.Log
import javax.inject.Inject

class Wheel @Inject constructor(){
    fun getWheel(){
        Log.d("ARK", "getWheel: ")
    }
}