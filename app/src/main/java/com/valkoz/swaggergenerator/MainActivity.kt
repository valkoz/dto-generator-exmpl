package com.valkoz.swaggergenerator

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.uber.feature.dto.ExpandedPet

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        ExpandedPet(name = "name", id = 0L)
    }
}
