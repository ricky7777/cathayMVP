package com.cathaybk.dbs.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.cathaybk.dbs.cathaymvp.databinding.ActivityUiDemoLinearBinding

class UiDemoActivity : AppCompatActivity() {

    private lateinit var binding: ActivityUiDemoLinearBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityUiDemoLinearBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.button.setOnClickListener {
            // click
        }

        binding.text.text = "Ui demo"
    }
}