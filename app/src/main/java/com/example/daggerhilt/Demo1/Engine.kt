package com.example.daggerhilt.Demo1

import android.util.Log
import javax.inject.Inject

class Engine @Inject constructor() {
    fun getEngine(){
        Log.d("ARK", "getEngine: ")
    }
}