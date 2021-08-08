package com.example.daggerhilt.Demo3

import android.util.Log
import javax.inject.Inject


class ImplementationClass @Inject constructor():Implement{
    override fun getFName() {
        Log.d("Ark", "getFName: ")
    }

    override fun getLName(lName: String) {
        Log.d("Ark", "getLName: $lName")
    }

    override fun getAge(): String {
        Log.d("Ark", "getAge: ")
        return "getAge:15"
    }

    override fun getComment(c: String): String {
        Log.d("Ark", "getComment: $c")
        return "getComment $c"
    }

}




interface Implement{
    fun getFName()
    fun getLName(lName:String)
    fun getAge():String
    fun getComment(c:String):String
}