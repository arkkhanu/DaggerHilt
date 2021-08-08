package com.example.daggerhilt

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.activity.viewModels
import androidx.lifecycle.lifecycleScope
import com.example.daggerhilt.Demo4Retrofit.ViewModel.PostViewModel
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
//    @Inject
//    lateinit var car: Car
//    @Inject
//    lateinit var main: Main
//    @Inject
//    lateinit var one: One
//    @Inject
//    lateinit var implement: Implement

    private val postViewModel :PostViewModel by viewModels()

    lateinit var btn_click: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btn_click = findViewById(R.id.btn_click)


        btn_click.setOnClickListener {
//            car.getCar()
//            main.getName()
//            one.getName("Abdul","Rehm"

//           implement.getAge()
//           implement.getComment("Hi hello")
//           implement.getFName()
//           implement.getLName("Rehman")

            postViewModel.response.observe(this,{
                Log.d("ARK", "onCreate: ${it.size}")
            })

        }

    }
}