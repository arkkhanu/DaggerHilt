package com.example.daggerhilt.Demo2

import android.util.Log
import javax.inject.Inject

class OneImp @Inject constructor(/*@FName private val fName:String,@LName private val lName:String*/) : One {

//    override fun getName() {
//        Log.d("ARK", "getName: $fName : $lName")
//    }

    override fun getName(fName: String, lName: String) {
        Log.d("ARK", "getName: $fName : $lName")
    }

}

class Main @Inject constructor( val one: One) {
    fun getName() {
//        one.getName()
    }
}

