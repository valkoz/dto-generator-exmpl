package com.valkoz.swaggergenerator

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.citymobil.app.dto.ExpandedPetDto

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        ExpandedPetDto(name = "name", id = 0L)
    }
}
