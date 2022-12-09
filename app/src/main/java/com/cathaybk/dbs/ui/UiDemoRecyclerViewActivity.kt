package com.cathaybk.dbs.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.cathaybk.dbs.cathaymvp.databinding.ActivityUiDemoLinearBinding
import com.cathaybk.dbs.cathaymvp.databinding.ActivityUiDemoRecyclerviewBinding

class UiDemoRecyclerViewActivity : AppCompatActivity() {

    private lateinit var binding: ActivityUiDemoRecyclerviewBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityUiDemoRecyclerviewBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val adapter = CustomAdapter(arrayOf("A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L"))
        binding.rvList.adapter = adapter
    }
}