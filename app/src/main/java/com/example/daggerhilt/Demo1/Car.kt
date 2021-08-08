package com.example.daggerhilt.Demo1

import android.util.Log
import javax.inject.Inject

class Car @Inject constructor(private val engine: Engine,private val wheel: Wheel) {

    /*@Inject
    lateinit var engine:Engine
    @Inject
    lateinit var wheel: Wheel*/

    fun getCar(){
        Log.d("ARK", "getCar:")
        engine.getEngine()
        wheel.getWheel()
    }
}