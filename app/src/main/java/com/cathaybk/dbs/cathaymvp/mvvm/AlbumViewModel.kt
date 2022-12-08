package com.cathaybk.dbs.cathaymvp.mvvm

import androidx.lifecycle.ViewModel

/**
 * Created by Ricky on 2022/12/8.
 * this is sample of view model
 */
class AlbumViewModel : ViewModel() {
    private val shakiraAlbum = ShakiraAlbum("Shakria", 12)

    init {
        shakiraAlbum.updateAlbumScore()
    }

    fun getShakiraTotalScore() = shakiraAlbum.getTotalScore()

}