package com.cathaybk.dbs.cathaymvp.mvvm

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.cathaybk.dbs.cathaymvp.R
import com.cathaybk.dbs.cathaymvp.databinding.ActivityMainMvvmBinding

/**
 * Created by Ricky on 2022/12/8.
 * view of mvvm sample
 */
class MainMVVMActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainMvvmBinding
    private lateinit var albumViewModel: AlbumViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        albumViewModel = ViewModelProvider(this)[AlbumViewModel::class.java]
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main_mvvm)
        binding.albumViewModel = albumViewModel

    }

    override fun onStart() {
        super.onStart()
//        albumViewModel.getAlbum()
    }

}